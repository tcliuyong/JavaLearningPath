package BaseJava.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 有一本书 缺少了一页找到缺少得页数
 * 
 */
public class lostPage {
	private static int[] a=new int[]{3,2,4,9,6,1,0,8,7,-1};
	
	public static void main(String[] args)
	{
		sortGetPage sgp=new sortGetPage();
		sgp.getPage(a);
	}
}
class sortGetPage
{
	
	public void getPage(int[] a)
	{
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
	
			if((a[i]+1)!=a[i+1])
			{
				System.out.println(i+"is lost");
			}
			else
				System.out.println(i+1);
		}
		return ;
	}
	
	private int[] a;
	
}
class mathGetPage
{
	public void getPage(int[] a)
	{
/*
		 *
		 * 知道总共的页数能够进行求和 可以算出现在的页数 差就是丢失的页数
		 */
		return ;
	}
	private int[] a;
}