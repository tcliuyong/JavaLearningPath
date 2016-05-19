package BaseJava.reflect;

import java.lang.reflect.Field;


public class PointRefMain {

	public static void main(String[] args) throws Exception
	{
		point p = new point(3, 5);
		Field fieldY = p.getClass().getField("y");//fieldYû�ж�Ӧ�������� fieldY����5
		Field fieldX = p.getClass().getDeclaredField("x");//���ùܷ�����Ȩ��
		System.out.println(fieldY);
		System.out.println(fieldY.get(p));
		fieldX.setAccessible(true);//���ﷴ��
		System.out.println(fieldX.get(p));
		
		
	}
} 
