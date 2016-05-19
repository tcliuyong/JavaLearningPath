package BaseJava.sockets;

import java.io.IOException;
import java.net.Socket;

public class portScanner {

	public static void main(String[] args) 
	{
		String host = "localhost";
		if(args.length > 0)
		{
			host = args[0];
		}
		new portScanner().scan(host);
	}
	public void scan(String host)
	{
		Socket socket = null;
		for(int port =1; port < 1024; port++)
		{
			try
			{
				socket = new Socket(host,port);
				System.out.println("There is a server on port :" + port);
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					if(socket != null)
					{
						socket.close();
					}
				}
				catch (IOException e) 
				{
					e.printStackTrace();
				}
				
			}
		}
	
	}

}
