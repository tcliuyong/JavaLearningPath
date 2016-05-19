package BaseJava.algorithm;

import java.util.Scanner;

public class addMatrices {

	public static void main(String[] args)
	{
		int n,m;
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int count=0;
			n=in.nextInt();
			if(n==0)
			{
				return;
			}
			m=in.nextInt();
		
			int[][] A=new int[n][m];
			int[][] B=new int[n][m];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				A[i][j]=in.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				B[i][j]=in.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{	
					int tmp=-1;
					A[i][j]=B[i][j]+A[i][j];
	
				}
				
			}
			int tmp=0;
			for(int i=0;i<n;i++)
			{
				for(int j=1;j<m;j++)
				{	
					tmp=A[i][j]+A[i][j-1];
					if((j+1==m)&&(tmp==0))
					{
						count++;
						tmp=0;
					}
				}
			}
			//System.out.println(count);
			tmp=0;
			for(int i=1;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{	
					tmp=A[i][j]+A[i-1][j];
					if((i+1==n)&&(tmp==0))
					{
						count++;
						tmp=0;
					}
				}
			}
			System.out.println(count);
		}
	}

}
