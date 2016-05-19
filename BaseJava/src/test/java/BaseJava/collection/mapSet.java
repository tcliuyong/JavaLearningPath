package BaseJava.collection;

import java.util.HashMap;
import java.util.Map;

public class mapSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer , String> mapTest=new HashMap<Integer , String>();
		mapTest.put(1, "test");
		mapTest.put(2, "test1");
		mapTest.put(3, "test3");
		mapTest.put(4, "test4");
		mapTest.remove(1);
		System.out.println(mapTest);
	}

}
