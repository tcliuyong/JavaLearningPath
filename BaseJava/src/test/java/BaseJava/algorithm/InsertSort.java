package BaseJava.algorithm;

public class InsertSort {

	public static void main(String[] args) {
		final int[] a = {1,2};
		a[1] = 100;
		System.out.println(a[1]);
		// TODO Auto-generated method stub
		//int[] a = {1,0,4,2,4};
		for(int which = 1; which < a.length; ++which)
		{
			int val = a[which];
			for(int i = 0; i < which; ++i)
			{
				if(a[i] > val)
				{
				System.arraycopy(a, i, a, i + 1, which - i);
				a[i] = val;
				break;
				}
		
			}
		}
		for(int i = 0; i < a.length; ++i)
		{
			System.out.println(a[i]);
		}
	}

}
