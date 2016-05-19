package BaseJava.algorithm;

import java.util.LinkedList;
import java.util.List;

public class LISLength 
{
	private int[] arrX;
	private int[] arrY;
	private int[][] c;

	public LISLength(int[] arr)
	{
		arrX = new int[arr.length + 1];
		arrY = new int[arr.length + 1];
		System.arraycopy(arr,0,arrX,1,arr.length);
		System.arraycopy(arr,0,arrY,1,arr.length);
		selectSort(arrY, arrY.length - 1);
		lisLength();
	}

	//计算最长公共子序列
	public void lisLength()
	{
		c = new int[arrX.length][arrY.length];

		for (int i = 1; i < arrX.length; i++)
		{
			for (int j = 1; j < arrY.length; j++)
			{
				if (arrX[i] == arrY[j])
				{
					c[i][j] = c[i-1][j-1] + 1;
				}
				else
				{
					c[i][j] = max(c[i-1][j], c[i][j-1]);
				}
			}
		}
	}

	//�������������������
	public List<Integer> getLIS()
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		int i = arrX.length - 1;
		int j = arrY.length - 1;
		while (i >= 1 && j >= 1)
		{
			if (arrX[i] == arrY[j])
			{
				list.addFirst(Integer.valueOf(arrX[i]));
				i--;
				j--;
			}
			else
			{
				if (c[i-1][j] > c[i][j-1])
				{
					i--;
				}
				else
				{
					j--;
				}
			}
		}
		return list;
	}

	private int max(int m, int n)
	{
		return m > n ? m : n;
	}

	//ѡ������,0�ſռ䲻��
	private void selectSort(int[] a, int n)
	{
		for (int i = 1; i < n; i++)
		{
			int k = i;
			for (int j = i + 1; j <= n; j++)
			{
				if (a[k] > a[j])
				{
					k = j;
				}
			}
			if (k != i)
			{
				int temp = a[k];
				a[k] = a[i];
				a[i] = temp;
			}
		}
	}

	public static void main(String[] args) 
	{
		int[] arr = {5,2,4,6,5,1,8};
		
		LISLength lis = new LISLength(arr);
		List<Integer> a = lis.getLIS();
		for (Integer item: a)
		{
			System.out.print(item + " ");
		}
	}
}

