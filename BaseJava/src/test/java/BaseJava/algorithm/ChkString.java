package BaseJava.algorithm;

import java.util.ArrayList;
import java.util.Stack;

public class ChkString {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Character> st = new Stack<Character>();
		String a = "haah";
		char[] b= a.toCharArray();
		int mid = a.length()/2;
		for(int i = 0; i < mid; i++)
		{
			st.push(b[i]);
		}
		for(int i = mid; i < a.length(); i++)
		{
			if(st.peek() == b[i])
			{
				System.out.println(st.peek());
				st.pop();
			}
			else
			{
				break;
			}
		}
		if(st.empty())
		{
			System.out.println("true");
		}
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		
	}

}
