package BaseJava.algorithm;

public class BinSearch {
	public int[] getA()
	{
		return a;
	}
	public void setA(int[] a)
	{
		this.a = a;
	}
	public boolean binSearch(int des)
	{
		int len = a.length;
		int start = 0,end = len - 1;
		int mid = (start + end) / 2;
		while(true)
		{
			mid = (start + end) / 2;
			if(start > end || end - start == 1)
			{
				return false;
			}
			if(a[mid] == des)
			{
				return true;
			}
			if(a[mid] < des)
			{
				start = mid;
			}
			else if(a[mid] > des)
			{
				end = mid;
			}
		
		}
		
	}
	private int[] a;

}
