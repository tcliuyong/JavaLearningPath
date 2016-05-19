package BaseJava.MulThreadReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader implements  Runnable{

	
	Buffer bf = new Buffer();
	public Reader(Buffer bf)
	{
		this.bf = bf;
	}
	public void run() {
		// TODO Auto-generated method stub
	
		try {
		File f = new File("E:\\2.txt");
		FileReader reader = null;
		String str;
		reader = new FileReader(f);
		BufferedReader br =new BufferedReader(reader);
			while((str = br.readLine())!= null)
			{
				bf.push(str);
			}
			br.close();
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
}
