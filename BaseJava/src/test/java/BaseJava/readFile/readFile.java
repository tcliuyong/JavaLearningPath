package BaseJava.readFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class readFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		Scanner s=new Scanner(System.in);
        Scanner sf=new Scanner(BufferReader(new FileReader("D:\\teste.asp")));
        String str=s.next();
        System.out.println(str);
		 */
		File f = new File("dblp-data.xml");
		FileInputStream fin=new FileInputStream(f);
		byte[] b=new byte[fin.available()];//新建一个字节数组

		fin.read(b);//将文件中的内容读取到字节数组中
		fin.close();
		String str2=new String(b);//再将字节数组中的内容转化成字符串形式输出
		System.out.println(str2);
		
	}

}
