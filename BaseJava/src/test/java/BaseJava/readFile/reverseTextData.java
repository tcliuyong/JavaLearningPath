package BaseJava.readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class reverseTextData {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(new File("D:\\test.txt"));
		Stack<String> line=new Stack<String>();
		String tmp=null;
		while(in.hasNextLine())
		{
			//System.out.println(in.next());
			tmp=in.nextLine();
			line.push(tmp);
		}
		//System.out.println(line.length);
		while(!line.empty())
		{
			System.out.println(line.peek());
			line.pop();
		}
		
	}

}
