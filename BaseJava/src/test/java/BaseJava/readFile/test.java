package BaseJava.readFile;

import java.io.FileNotFoundException;

public class test {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ReadText RT=new ReadText("D:\\test.txt");
		String test=RT.readThisFile();
		System.out.println(test);
	}

}
