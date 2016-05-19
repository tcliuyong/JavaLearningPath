package BaseJava.algorithm;

public class smallNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.printf("%d*%d=%d",i,j,i*j);
				if(i==j)
				
				//System.out.println(i+"*"+j+"="+i*j);
				System.out.println("\n");
				else
				{
					System.out.printf(" ");
				}
				
			}
		}
	}

}
