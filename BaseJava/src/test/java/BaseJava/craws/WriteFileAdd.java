package BaseJava.craws;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileAdd 
{
	 public static void appendMethodB(String fileName, String content) {
	        try {
	            FileWriter writer = new FileWriter(fileName, false);
	            writer.write(content);
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
