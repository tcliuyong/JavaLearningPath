package BaseJava.algorithm;

import java.util.*;

public class HowToQueStack {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*MyQueue mq=new MyQueue(0);
		mq.inQueue("test1");
		mq.inQueue("test2");
		mq.inQueue("test3");
		mq.inQueue("test4");
		for(int i=0;i<mq.getQueueSize();i++)
		System.out.println(mq.getQueue(i));
		mq.outQueue();
		System.out.println();
		for(int i=0;i<mq.getQueueSize();i++)
			System.out.println(mq.getQueue(i));
		mq.outQueue();
		System.out.println();
		for(int i=0;i<mq.getQueueSize();i++)
			System.out.println(mq.getQueue(i));
		mq.inQueue("test");
		System.out.println();
		for(int i=0;i<mq.getQueueSize();i++)
			System.out.println(mq.getQueue(i));
		
		*/
		MyStack ms=new MyStack(0);
		ms.inStack("test1");
		ms.inStack("test2");
		ms.inStack("test3");
		ms.inStack("test4");
		while(!ms.isEmpty())
		{
			System.out.println(ms.getStack());
			ms.outStack();
		}
	}

}
class MyQueue1
{
	public MyQueue1(int size)
	{

		this.size=size;
	}
	public void inQueue(String tmp)
	{
		l.add(tmp);
		size++;
	}
	public String getQueue(int a)
	{
		 return l.get(a);
	}
	public int getQueueSize()
	{
		return l.size();
	}
	public void outQueue()
	{
		l.remove(0);
		size--;
	}
	private List<String> l=new ArrayList<String>();
	int size;
}
class MyStack
{
	public MyStack(int size)
	{
		this.size=size;
	}
	public int getStackSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void inStack(String tmp)
	{
		l.add(tmp);
		size++;
	}
	public void outStack()
	{
		if(size>0)
		{
			l.remove(size-1);
			size--;
		}
		else
		{
			System.out.println("Խ����");
		}
		
	}
	public boolean isEmpty()
	{
		if(l.size()==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String getStack()
	{
		 return l.get(size-1);
	}
	public int getQueueSize()
	{
		return l.size();
	}
	
	private List<String> l=new ArrayList<String>();
	int size;
}
