package BaseJava.thread;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class threadPool {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("inout:");
		String directory=in.nextLine();
		System.out.println("����keyword");
		String keyword=in.nextLine();
		ExecutorService  pool = Executors.newCachedThreadPool();
		 MatchCounter counter=new MatchCounter(new File(directory), keyword, pool);
		Future<Integer> result =pool.submit(counter);
		try
		{
			System.out.println(result.get()+"Mathing fileS");
		}
		catch(ExecutionException e)
		{
			e.printStackTrace();
		}
		
		catch(InterruptedException e){}
		pool.shutdown();
		int largestPoolSize=((ThreadPoolExecutor)pool).getLargestPoolSize();
		System.out.println("largeest size="+ largestPoolSize);
		
	}

}
class MatchCounter implements Callable<Integer>
{
	public MatchCounter(File directory,String keyword,ExecutorService pool)
	{
		this.directory=directory;
		this.keyword=keyword;
		this.pool=pool;
	}
	public Integer call()
	{
		count =0;
		try
		{
			File[]  files=directory.listFiles();
			ArrayList<Future<Integer>> results=new ArrayList<Future<Integer>>();
			for(File file:files)
			
				if(file.isDirectory())
				{
					MatchCounter counter =new MatchCounter(file, keyword, pool);
					Future<Integer> result = pool.submit(counter);
					results.add(result);
				}
				else
				{
					if(search(file)) count++;
				}
				for(Future<Integer> result:results)
					try
				{
				count+=result.get();
				
				}
				catch (ExecutionException e)
				{
					// TODO: handle exception
					e.printStackTrace();
				}
			
		}
		catch (InterruptedException e){}
		return count;
	}
	public boolean search(File file)
	{
		try
		{
			Scanner in =new Scanner(new FileInputStream(file));
			boolean found = false;
			while(!found && in.hasNextLine())
			{
				String line=in.nextLine();
				if(line.contains(keyword))
				{
					found =true;
				}
			}
			in.close();
			return found;
		}
		catch (IOException e)
		{
			return false;
		}
	}
	private File directory;
	private String keyword;
	private ExecutorService pool;
	private int count;
	
}

