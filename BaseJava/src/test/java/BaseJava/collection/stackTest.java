package BaseJava.collection;

import java.util.Stack;

public class stackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> stackTest=new Stack<Integer>();
		stackTest.push(1);
		stackTest.push(2);
		stackTest.push(3);
		stackTest.push(4);
		String str = "test";
		str.toCharArray();
		System.out.println(stackTest);
		
		stackTest.insertElementAt(10, 2);
		stackTest.remove(2);
		stackTest.pop();
		System.out.println(stackTest);
	}

}
