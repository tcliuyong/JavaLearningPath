package BaseJava.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class linkList {

	public static void main(String[] args) {
		List<String> a=new LinkedList<String>();
		a.add("amy");
		a.add("bmy");
		a.add("vmy");
		for(String s : a)
		{
			System.out.println(s);
		}
		List<String> b=new LinkedList<String>();
		a.add("wmy");
		a.add("zmy");
		a.add("qmy");
		ListIterator<String> aIter=a.listIterator();
		Iterator<String> bIter=b.iterator();
		while(bIter.hasNext())
		{
			if(aIter.hasNext())
				aIter.next();
			aIter.add(bIter.next());
		}
		System.out.println(a);
		
		bIter=b.iterator();
		while(bIter.hasNext())
		{
			bIter.next();
			if(bIter.hasNext())
			{
				bIter.next();
				bIter.remove();
			}
			aIter.add(bIter.next());
		}
		System.out.println(b);
		//a.removeAll(b);
		a.remove(1);
		System.out.println(a.get(1));
	}


}
