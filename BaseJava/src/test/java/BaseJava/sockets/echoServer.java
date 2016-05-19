package BaseJava.sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class echoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用telnet 调试 telnet 127.0.0.1 1111
		try
		{
			ServerSocket s =new ServerSocket(1111);
			Socket income=s.accept();
			try
			{
				InputStream inStream=income.getInputStream();
				OutputStream outStream=income.getOutputStream();
				Scanner in =new Scanner(inStream);
				PrintWriter out=new PrintWriter(outStream,true);
				out.println("Hello");
				boolean done=false;
				while(!done && in.hasNextLine())
				{
					String line=in.nextLine();
					out.println("Echo"+line);
					if(line.trim().equals("BYE"))
						done=true;
				}
			}
			finally
			{
				income.close();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	

}
