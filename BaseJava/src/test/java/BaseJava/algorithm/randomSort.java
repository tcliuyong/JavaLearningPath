package BaseJava.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class randomSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randomss r=new randomss();
		
		ArrayList<Integer> x=new ArrayList<Integer>();
		x=r.getRandom();
		
		Collections.sort(x);
		for (Integer integer : x) 
		{
			System.out.printf(integer+" ");
		}
	}

}
class randomss
{
	
	public ArrayList<Integer> getRandom()
	{
		
		Random rnd=new Random();
		for(int i=0;i<20;i++)
		{
			rdGet = Math.abs(rnd.nextInt())%26+97;
			System.out.printf(rdGet+" ");

			a.add(rdGet);
		}
		System.out.println();
		return a;
	}
	
	private ArrayList<Integer> a=new ArrayList<Integer>();
	private Integer rdGet;
}