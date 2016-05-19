package BaseJava.thread;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class blockQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("inout:");
		String directory=in.nextLine();
		System.out.println("����keyword");
		String keyword=in.nextLine();
		final int FILE_QUEUE_SIZE=10;
		final int SEARCH_THREADS=100;
		
		BlockingQueue<File> queue =new ArrayBlockingQueue<File>(FILE_QUEUE_SIZE);
		FileEnumerationTask enumerator=new FileEnumerationTask(queue, new File(directory));
		new Thread(enumerator).start();
		for(int i =0 ;i <= SEARCH_THREADS;i++)
			new Thread(new SearchTash(queue, keyword)).start();

}
}
class FileEnumerationTask implements Runnable
{
	public FileEnumerationTask(BlockingQueue<File> queue,File startingDirectory)
	{
		this.queue=queue;
		this.startingDirectory=startingDirectory;
	}
	public void run()
	{
		try
		{
			enumerate(startingDirectory);
			queue.put(DUMMY);
		}
		catch(InterruptedException e)
		{
			
		}
	}
	public void  enumerate(File directory) throws InterruptedException
	{
		File[] files=directory.listFiles();
		for(File file:files)
		{
			if(file.isDirectory())
			{
				enumerate(file);
			}
			else
			{
				queue.put(file);
			}
		}
	}
	public static File DUMMY=new File("");
	private BlockingQueue<File> queue;
	private File startingDirectory;
}

class SearchTash implements Runnable
{
	public SearchTash(BlockingQueue<File> queue2,String keyword) 
	{
		this.queue=queue2;
		this.keyword=keyword;
	}
	public void run()
	{
		try
		{
			boolean done=false;
			while(!done)
			{
				File file=queue.take();
				if(file == FileEnumerationTask.DUMMY);
				{
					queue.put(file);
					done=true;
				}
	
					search(file);	
				
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		catch (InterruptedIOException e){} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void search(File file) throws IOException 
	{
		Scanner in=new Scanner(new FileInputStream(file));
		int lineNumber=0;
		while(in.hasNextLine())
		{
			lineNumber++;
			String line=in.nextLine();
			if(line.contains(keyword))
				System.out.printf("%s:%d:%s%n",file.getPath(),lineNumber,line);
			
		}
		in.close();
	}
	private String keyword;
	private BlockingQueue<File> queue;
}
