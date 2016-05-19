package BaseJava.algorithm;
public class LIS
{
  private int n;
  private int array[];
  private int lis[];
  public LIS(int n,int[] array)
  {
	  this.n=n;
	  this.array=array;
	  lis=new int[n];
  }
   public static void main(String[] args)
   { 

          int[] array  = new int[]{1,2,1,2,3,4,1,2,3};
          LIS tl=new LIS(array.length,array);
          int maxl=tl.lis();
       System.out.println("最长单调递增子序列长度："+maxl);
       System.out.println();
       System.out.println("最长单调递增子序列构成");
          int k=tl.max();
          tl.print(k);
          System.out.println();
   }

  public  int lis()
  {
	for(int i =0;i< n;i++)
	{
		lis[i]=1;
		for(int j=0;j< i;j++)
		{
			if(array[j]< array[i]&&(lis[j]+1>lis[i]))
			  lis[i]=lis[j]+1;              
		}     
	}
	int max=0;
	for(int k=0;k< lis.length;k++)
	{
       
		if(lis[k]>max)
		max=lis[k];
	}
	return max;
   }
    private int max()  
    {  
        int max = lis[0];  
        int k = 0;  
        for (int i = 0; i < lis.length; i++)  
        {  
            if (max < lis[i])  
            {  
                max = lis[i];  
                k = i;  
            }  
        }  
        return k;  
    }  
    public void print(int k)  
    {      
        for (int i = k - 1; i >= 0; i--)  
        {  
            if (lis[k] == lis[i] + 1 && array[i] <= array[k])  
            {  
                print(i);  
                break;  
            }  
        }  
        System.out.print(array[k] + " ");  
    }  
 }