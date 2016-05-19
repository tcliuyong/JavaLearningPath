package BaseJava.recursion;

public class Permutation {
	public static void swap(char[] A, int i , int j)
	{
		char tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
	public static void perm(char[] A,int n, int k)//n means sort n num , k means sort nth num
	{
		if(n == k)
		{
			for(int i = 0; i < A.length; i++)
			{
				System.out.print(A[i] + " ");
			}
			System.out.println();
		}
		else
		{
			for(int i = k; i < n; i++)
			{
				swap(A,i,k);
				perm(A,n,k + 1);
				swap(A,i,k );
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[] = {'b','c','d'};
		perm(a,3,0);
		
	}

}
