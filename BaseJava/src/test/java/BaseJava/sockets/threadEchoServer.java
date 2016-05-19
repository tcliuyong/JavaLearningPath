package BaseJava.sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class threadEchoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int i=1;
			ServerSocket s =new ServerSocket(1111);
			
			while(true)
			{
				Socket income=s.accept();
				System.out.println("Spawning"+i);
				Runnable r=new ThreadedEchoHandler(income,i);
				Thread t=new Thread(r);
				t.start();
				i++;
			
			}

		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	

}

