package BaseJava.readFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("E:\\FE.txt");

		FileChannel fc = fis.getChannel();
		ByteBuffer bf = ByteBuffer.allocate(1024);
		while(fc.read(bf) != -1)
		{
			bf.flip();
			while(bf.hasRemaining())
			{
				System.out.print((char) bf.get());
			}
			bf.clear();
		}
		
	}

}
