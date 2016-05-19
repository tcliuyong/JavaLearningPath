package BaseJava.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class getPackageAndClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 	Demo demo=new Demo();
		 	Class c = demo.getClass();
	        System.out.println(demo.getClass().getName());
	        System.out.println(Class.forName("java.util.Date"));
	        System.out.println(c.isPrimitive());//�ж��ǲ��ǻ�������
	        System.out.println(c.getConstructors());
	        Constructor constructor = String.class.getConstructor(StringBuffer.class);
	        String str =(String) constructor.newInstance(new StringBuffer("abc"));
	        System.out.println(str);
	        
	        
	}

}
class Demo{
	private int a;
	private int b;
	Demo()
	{
		System.out.println("DemoConstructors");
	}
	int getA()
	{
		return a;
	}
	int getB()
	{
		return b;
	}
	void setA(int a)
	{
		this.a = a;
	}
	void setB(int b)
	{
		this.b = b;
	}
}
 
