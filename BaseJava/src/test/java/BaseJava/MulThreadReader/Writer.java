package BaseJava.MulThreadReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Writer implements  Runnable{
	Buffer bf = new Buffer();
	public Writer(Buffer bf)
	{
		this.bf = bf;
	}
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			
			String str = "test";
			File f = new File("E:\\res.txt");
			FileWriter fw =  new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			while(!(str = bf.pop()).contains("end"))
			{
				//str = bf.pop();
				bw.write(str + "\n");
			}
			bw.close();
			fw.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

}
