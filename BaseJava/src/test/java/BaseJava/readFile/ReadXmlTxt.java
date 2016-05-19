package BaseJava.readFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadXmlTxt {
	public static void main (String args[]) throws IOException
	{
		File f = new File("E:\\dblp_data.xml");
		BufferedReader bf = new BufferedReader(new FileReader(f));
		String str = "";
		int i = 0;
		int flag = 0;
		String fileName="";
		while((str = bf.readLine()) != null)
		{
			fileName = "E:\\dblp\\dblp_data" + flag + ".txt";
			
			DealFile.appendMethod(fileName, str, 1);
			i++;
			if(i > 200000)
			{
				i = 0;
				flag++;
				System.out.println(flag);
			}
			
			
		}
	}
}
