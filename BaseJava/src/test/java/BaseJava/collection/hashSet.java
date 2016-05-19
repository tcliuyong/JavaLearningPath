package BaseJava.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> words=new HashSet<String>();
		SortedSet<String>  test =new TreeSet<String>();
		long totalTime=0;
		Scanner in =new Scanner(System.in);
		while(in.hasNext())
		{
			String word =in.next();
			long callTime =System.currentTimeMillis();
			words.add(word);
			callTime = System.currentTimeMillis()-callTime;
			totalTime  += callTime; 
		}
		System.out.println(words);
		Iterator<String> iter=words.iterator();
		for(int i=0;i<=20;i++)
			System.out.println(iter.next());
		System.out.println("...");
		System.out.println(words.size()+"distinct words"+ totalTime+"m");
		
	}

}
