package BaseJava.algorithm;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkEvenOrodd  test=new checkEvenOrodd(5);
		if(!test.check())
		{
			System.out.println("奇数");
		}
		else
		{
			System.out.println("偶数");
		}

	}
	
}

class checkEvenOrodd
{
	public checkEvenOrodd(int x)
	{
		this.x=x;
	}
	public boolean check()
	{
		if((x&1)!=0)
		{
			return false;
		}
		else if((x&1)==0)
		{
			return true;
		}
		return false;
	}
	private int x;
}
