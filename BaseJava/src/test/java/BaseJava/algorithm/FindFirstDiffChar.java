package BaseJava.algorithm;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import javax.swing.text.html.parser.Entity;

public class FindFirstDiffChar {
	char findFindFirstDiffChar(String s)
	{
		int len = s.length();
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		for(int i = 0;i < len; i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
			}
			else
			{
				hm.put(s.charAt(i), 1);
			}
		}

		for(int i = 0;i < len; i++)
		{
			if(hm.get(s.charAt(i)) == 1)
			{
				return s.charAt(i);
				
			}
		}
		return ' ';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindFirstDiffChar ffc = new FindFirstDiffChar();
		System.out.println(ffc.findFindFirstDiffChar("aacjksdfcel"));
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		for(Integer i : l)
		{
			System.out.println(i);
		}
	}

}
