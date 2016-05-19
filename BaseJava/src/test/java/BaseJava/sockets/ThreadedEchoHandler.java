package BaseJava.sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class ThreadedEchoHandler implements Runnable {

	
	public ThreadedEchoHandler(Socket i,int c)
	{
		incoming=i;
		counter=c;
	}
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			try
			{
				InputStream inStream=incoming.getInputStream();
				OutputStream outStream=incoming.getOutputStream();
				Scanner in =new Scanner(inStream);
				PrintWriter out=new PrintWriter(outStream,true);
				out.println("Hello");
				boolean done=false;
				while(!done && in.hasNextLine())
				{
					String line=in.nextLine();
					out.println("Echo"+line);
					if(line.trim().equals("BYE"))
						done=true;
				}
			}
			finally
			{
				incoming.close();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
private Socket incoming;
private int counter;
}
