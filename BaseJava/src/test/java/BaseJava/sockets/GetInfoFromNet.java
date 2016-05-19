package BaseJava.sockets;

import java.net.InetAddress;

public class GetInfoFromNet
{

	public static void main(String[] args) 
	{
		try
		{
			InetAddress ind = InetAddress.getLocalHost();
			System.out.println(ind.toString());
			String Name = ind.getHostName();
			System.out.println(Name);
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
	}

}
