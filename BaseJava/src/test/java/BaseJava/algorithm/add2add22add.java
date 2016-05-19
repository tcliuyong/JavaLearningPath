package BaseJava.algorithm;

import java.util.Scanner;

public class add2add22add {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String n=s.nextLine();
		String res="";
		int sum=0;
		for(int i=0;i<Integer.parseInt(n);i++)
		{
			
			res+=a;
			
			sum+=Integer.parseInt(res);
		}
		System.out.println(sum);
		
	}

}
