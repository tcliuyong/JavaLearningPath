package BaseJava.thread;

public class Producer implements Runnable {
	StackBuff ss = new StackBuff();
	Producer(StackBuff ss)
	{
		this.ss = ss;
	}

	public void run() {
		for(int i = 0; i < 20; i++)
		{
			Factory f = new Factory(i);
			ss.push(f);
		}
		try
		{
			Thread.sleep((int)Math.random() * 500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}



}
