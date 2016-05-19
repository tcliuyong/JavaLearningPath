package BaseJava.sockets;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class socketTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		try
		{
			Socket s =new Socket("127.0.0.1",1111);
			try
			{
				InputStream inStream=s.getInputStream();
				Scanner in =new Scanner(inStream);
				while(in.hasNextLine())
				{
					String line=in.nextLine();
					System.out.println(line);
				}
			}
			finally
			{
				s.close();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
