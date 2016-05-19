package BaseJava.algorithm;

import java.util.LinkedList;
import java.util.List;


public class BinarySearch 
{

	public static void main(String[] args) 
	{
		List<Integer> l = new LinkedList<Integer>();
		l.add(1);
		for(int i = 0; i < l.size(); i++)
		{
			System.out.println(l.get(i));
		}
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		BinSearch bin = new BinSearch();
		bin.setA(a);
		if(bin.binSearch(5))
		{
			System.out.println("find");
		}
		else
		{
			System.out.println("can not find");
		}
		
	}
	
	
}

