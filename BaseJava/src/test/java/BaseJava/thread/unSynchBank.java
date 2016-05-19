package BaseJava.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class unSynchBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank(NACOUNTS, INITIAL_BALANCE);
		
		int i;
		for(i=0;i<NACOUNTS;i++)
		{
			TransferRunable r=new TransferRunable(b, i, INITIAL_BALANCE);
			Thread t=new Thread(r);
			t.start();
		}
	}
private static final int NACOUNTS=100;
private static final double INITIAL_BALANCE=1000;
}
class Bank
{
	public Bank(int n ,double initialBalance)
	{
		acounts=new double[n];
		for(int i=0;i<acounts.length;i++)
		{
			acounts[i]=initialBalance;
		}
	}
	public void transfer(int from,int to,double amount) throws InterruptedException
	{
		
		banklock.lock();
		try
		{
		if(acounts[from]<amount) return ;
		System.out.print(Thread.currentThread());
		acounts[from]-=amount;
		System.out.printf("%10.2f from %d to %d",amount,from,to);
		Thread.sleep(1000);
		acounts[to]+=amount;
		System.out.printf("Total Banlance:%10.2f%n",getToalBalance());
		Thread.sleep(1000);
		}
		finally
		{
			banklock.unlock();
		}
	}
	public double getToalBalance()
	{
		double sum=0;
		for(double a:acounts)
		{
			sum+=a;
		}
		return sum;
	}
	public int size()
	{
		return acounts.length;
	}
	private final double[] acounts;
	private Lock banklock=new ReentrantLock();//ʵ����һ����ͷ
}

class TransferRunable implements Runnable
{
	public TransferRunable(Bank b,int from,double max)
	{
		bank=b;
		fromAcount=from;
		maxAmount=max;
		
	}
	public void  run()
	{
		try
		{
			while(true)
			{
				int toAcount=(int ) (bank.size()*Math.random());
				double amount=maxAmount*Math.random();
				bank.transfer(fromAcount, toAcount, amount);
				Thread.sleep((long) ((int)DELAY*Math.random()));
			}
		}
		catch(InterruptedException e)
		{
			
		}
	}
	private Bank bank;
	private int fromAcount;
	private double maxAmount;
	private int DELAY=10;
}