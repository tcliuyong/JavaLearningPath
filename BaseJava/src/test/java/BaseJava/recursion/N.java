package BaseJava.recursion;

public class N {

	public int hierarchy(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		else
		{
			return n*hierarchy(n -1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new N().hierarchy(10));
	}

}
