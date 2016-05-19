package BaseJava.readFile;

import java.io.*;

public class ReadTxtLineByLine 
{
	  public static void appendMethod(String fileName, String content)
	  {
	        try
	        {
				//打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
	            FileWriter writer = new FileWriter(fileName, true);
	            writer.write(content);
	            writer.close();
	        } 
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	    }
	public static void main(String[] args) throws IOException
	{
		
		File f = new File("E:\\旅店.txt");
		File tmpF = new File("E:\\1.txt");
		String outFileName = "E:\\1.txt";
		BufferedReader bf =new BufferedReader(new FileReader(f));
		String str = null;
		while((str = bf.readLine()) != null)
		{
			if(!str.startsWith("{\"x\""));
			{
				appendMethod(outFileName, str);
				appendMethod(outFileName, "\r\n");
				System.out.println(str);
			}
		}
	/*	
		BufferedReader show =new BufferedReader(new FileReader(tmpF));
		String showStr = null;
		while((showStr = bf.readLine()) != null)
		{
			System.out.println(showStr);
		}*/
		bf.close();
		//show.close();
		
	}
}
