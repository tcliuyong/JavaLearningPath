package BaseJava.algorithm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1,x2,y1,y2;
		double D1,D2,result;
		Scanner in =new Scanner(System.in);
		 
		while(true)
		{
			x1=in.nextDouble();
			y1=in.nextDouble();
			x2=in.nextDouble();
			y2=in.nextDouble();
			D1=Math.pow(Math.abs(x2-x1), 2);
			D2=Math.pow(Math.abs(y2-y1), 2);
			result=Math.sqrt(D2+D1);
			System.out.printf("%.2lf",result);
		}
	}

}
