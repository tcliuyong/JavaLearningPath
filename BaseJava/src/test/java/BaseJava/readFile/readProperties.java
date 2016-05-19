package BaseJava.readFile;

import java.io.FileInputStream;
import java.util.Properties;

public class readProperties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		String a = "";
		FileInputStream inputFile = null;
		try
		{
			inputFile = new FileInputStream("E:\\a.properties");
			prop.load(inputFile);
			a = prop.getProperty("name").trim();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(a);
		
	}

}
