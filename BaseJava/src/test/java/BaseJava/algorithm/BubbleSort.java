package BaseJava.algorithm;

public class BubbleSort 
{

	public static void main(String[] args) 
	{
		int[] a = {1,0,12,45,7,2,56};
		int len = a.length - 1;
		for(int i = 0; i < len; i++)
		{
			for(int j = 0; j < len; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(Integer A : a)
		System.out.println(A);
	}

}
