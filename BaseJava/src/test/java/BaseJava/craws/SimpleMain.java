package BaseJava.craws;

import java.io.IOException;


public class SimpleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			SimpleCrawler.downloadPage("http://baidu.com");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
