package BaseJava.readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadText {

	public ReadText(String name)
	{
		this.name=name;
	}
	public	boolean isTxt()
	{
		if(name.length()>0 && name!=null)
		{
			int dot=name.lastIndexOf(".");
			if(dot!=-1 && dot<name.length())
			{
				String tmp=name.substring(dot,name.length());
				if(tmp.equals(".txt") || tmp.equals(".TXT"))
				{
					return true;
				}
				else
				{
					System.out.println("不是一个txt文件");
					return false;
				}
			}
			
		}
		else
		{
			System.out.println("不是一个合法的路径");
			return false;
		}
		return false;
	}
	public String readThisFile() throws FileNotFoundException
	{
		if(this.isTxt())
		{
			Scanner in=new Scanner(new File(name));
			//String content=null;
			while(in.hasNext())
			{
				content = content + in.next();
				content=content+"\n";
				//System.out.println(content);
			}
		}
		return content;
	}
	private String name;
	private String content="";
}
