package BaseJava.algorithm;

import java.util.Stack;

public class twoStackIsQueue {

	public static void main(String[] args)
	{
		myQueue mq=new myQueue();
		mq.inQueue(1);
		mq.inQueue(2);
		mq.inQueue(3);
		mq.inQueue(4);
		System.out.println(mq.outQueue());
		mq.inQueue(100);
		System.out.println(mq.outQueue());
		System.out.println(mq.outQueue());
		System.out.println(mq.outQueue());
		System.out.println(mq.outQueue());
	}

}
class myQueue
{

	public void inQueue(int x)
	{
		s1.push(x);
	}
	public int outQueue()
	{
		int tmp;
		if(s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.peek());
				s1.pop();
			}	
			tmp=s2.peek();
			s2.pop();
			return tmp;
		}
		else
		{
			tmp=s2.peek();
			s2.pop();
			return tmp;
		}
		
	}
	private Stack<Integer> s1=new Stack<Integer>();
	private Stack<Integer> s2=new Stack<Integer>();
}
