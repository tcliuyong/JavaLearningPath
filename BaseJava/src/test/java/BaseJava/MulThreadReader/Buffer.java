package BaseJava.MulThreadReader;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;


public class Buffer {
	//String[] queue = new String[11];
	Queue<String> queue = new LinkedList<String>();
	int  len = 0;
	public synchronized void push(String s)
	{

			try
			{
				while(len == 10)
				{
					this.wait();
				}
				this.notify();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			//queue[len] = s;
			queue.add(s);
			++len;
			System.out.println("push:" + len);
	}
	public synchronized String pop()
	{


			try
			{
				while(len == 0)
				{
					this.wait();
				}
				this.notify();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			--len;
			System.out.println("pop:" +len);
			//return queue[len];
			return queue.remove();
	}
}
