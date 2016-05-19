package BaseJava.algorithm;

public class QSort {
	public int[] a = {1,0,4,2,-1};
	public void qsort(int[] a,int left ,int right)
	{
		int i = left;
		int j = right;
		int  key = a[left];
		if(left > right)
			return;
		else
		{
			while(i < j && key <= a[j])
				j--;
			a[i] = a[j];
			while(i < j && key > a[i])
				i++;
			a[j] = a[i];
		}
		a[i] = key;
		qsort(a,left,i - 1);
		qsort(a,i + 1, right);
	}
	public static void main(String[] args) {
		QSort qs = new QSort();
		qs.qsort(qs.a, 0, 4);
		for(Integer e: qs.a)
		{
			System.out.println(e);
		}
		
		
	}

}
