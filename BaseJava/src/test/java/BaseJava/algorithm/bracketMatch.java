package BaseJava.algorithm;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class bracketMatch
{

	public static void main(String[] args)
	{
		Stack<Character> stk =new Stack<Character>();
		StringBuffer sb = new StringBuffer();
		Scanner in = new Scanner(System.in);
		String x;
		char tmp;
		String all;
		for(;;)
		{
			x = in.next();
			sb.append(x);
			if(x.equals("#"))
			{
				sb.deleteCharAt(sb.length() - 1);
				break;
			}
		}
		all = sb.toString();
		for(int i = 0; i < all.length();i++)
		{
			tmp = all.charAt(i);
			if(tmp == '(')
			{
			
				stk.push(tmp);
			}
			else if(tmp == ')')
			{
				stk.pop();
			}
		}
		if(stk.isEmpty())
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

}
