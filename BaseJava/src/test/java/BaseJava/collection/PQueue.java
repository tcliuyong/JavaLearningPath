package BaseJava.collection;

import java.util.PriorityQueue;

public class PQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		PriorityQueue <Integer> PQ=new PriorityQueue<Integer>();
		PQ.add(1);
		PQ.add(10);
		PQ.add(12);
		PQ.add(2);
		System.out.println(PQ);
		
		while(!PQ.isEmpty() && i==0)
		{
			PQ.remove();
			i++;
		}
		System.out.println(PQ);
	}

}
