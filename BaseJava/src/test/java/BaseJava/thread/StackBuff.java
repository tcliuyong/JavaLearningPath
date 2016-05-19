package BaseJava.thread;

public class StackBuff {
	Factory[] sum = new Factory[6];
	int index = 0;
	public synchronized void push(Factory f)
	{
		try
		{
			while(index == sum.length)
			{
				System.out.println("product enough");
				this.wait();
			}
			this.notify();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		sum[index] = f;
		index ++;
		System.out.println("product:" + f + "sum:" + index +"");
	}	
	public synchronized Factory pop()
	{
		try
		{
			while(index == 0)
			{
				System.out.println("null");
				this.wait();
			}
			this.notify();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		index --;
		System.out.println("use:" + sum[index] + "sum:" + index + "");
		return sum[index];
	}
}
