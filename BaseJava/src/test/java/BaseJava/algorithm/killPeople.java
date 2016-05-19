package BaseJava.algorithm;

import java.util.LinkedList;

public class killPeople {

	 public static int removeNM(int n, int m) {   
		       LinkedList ll = new LinkedList();   
		       for (int i = 0; i < n; i++)   
		           ll.add(new Integer(i + 1));   
		       int removed = -1;   
	        while (ll.size() > 1) {   
		            removed = (removed + m) % ll.size();   
	           ll.remove(removed--);   
	      }   
	       return ((Integer) ll.get(0)).intValue();   
		    }   
		
		   public static void main(String[] args) {   
		        System.out.println(removeNM(50, 3));   
		  }   

	
}

