package BaseJava.thread;

public class Consumer implements Runnable {
	StackBuff ss = new StackBuff();
	Consumer(StackBuff ss)
	{
		this.ss = ss;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 20; i++)
		{
			Factory f=ss.pop(); 
		}
		try
		{
			Thread.sleep((int)Math.random() * 1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
