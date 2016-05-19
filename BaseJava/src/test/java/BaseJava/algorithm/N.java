package BaseJava.algorithm;

import java.util.Scanner;

public class N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n;
		int x;
		hierarchy h=new hierarchy();
		Scanner in=new Scanner(System.in);
		
		while(true)
		{
			x=in.nextInt();
			n=h.getHierarchy(x);
			System.out.println(n);
		}
		
	}

}
class hierarchy
{

	public  long getHierarchy(int n)
	{
		if(n<1)
			return 1;
		else
			return n*getHierarchy(n-1);
	}
	private int n;
}