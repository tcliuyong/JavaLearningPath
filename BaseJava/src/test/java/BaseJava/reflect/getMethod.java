package BaseJava.reflect;

import java.lang.reflect.Method;

public class getMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str = "test";
		
		Method methodCharAt = String.class.getMethod("charAt", int.class);
		System.out.println(methodCharAt.invoke(str, 1));// invoke �����������  ��ʾ��������ķ���
		
	}

}
