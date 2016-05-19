package BaseJava.readFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DealFile 
{
	 public static void appendMethod(String fileName, String content, int flag)
	  {
		 if(flag == 1)
		 {
			 try
		        {
		            FileWriter writer = new FileWriter(fileName, true);
		            content = content + "\r\n";
		            writer.write(content);
		            writer.close();
		        } 
		        catch (IOException e)
		        {
		            e.printStackTrace();
		        } 
		 }
		 else if(flag == 0)
		 {
			 try
		        {
		            FileWriter writer = new FileWriter(fileName, false);
		            writer.write(content);
		            writer.close();
		        } 
		        catch (IOException e)
		        {
		            e.printStackTrace();
		        } 
		 }
		 else
		 {
			 System.out.println("you flag is not right!");
		 }
	        
	    }
}
