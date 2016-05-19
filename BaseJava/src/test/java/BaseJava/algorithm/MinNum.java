package BaseJava.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MinNum {

	
	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] A = {332,41,322,32,414,4};
		Comparator<Integer> c = new Comparator<Integer>() {
			
			public int compare(Integer o1, Integer o2) {
				String tmp1 = o1.toString() + o2.toString();
				String tmp2 = o2.toString() + o1.toString();
				if(tmp1.compareTo(tmp2) < 0)
					return -1;
				return 1;
			}
		};
		Arrays.sort(A,c);
		for(Integer i : A)
		{
			System.out.println(i);
		}
		
	}
}
