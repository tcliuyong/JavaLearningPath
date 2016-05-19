package BaseJava.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class compare {

	
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		
		String str;
		while(true)
		{
		str=in.nextLine();
		char[] temp=str.toCharArray();
		Arrays.sort(temp);
		for(int i=0;i<3;i++)
		{
			System.out.print(temp[i]);
			if(i!=2)
			System.out.print(" ");
			else
			System.out.println();
		}
		}
	
	}

}
