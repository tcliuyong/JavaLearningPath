package BaseJava.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class arrayList {

	public static void main(String[] args) {
		ArrayList<Emloyee> Emloyees =new ArrayList<Emloyee>();
		ArrayList<Integer> Emloyee =new ArrayList<Integer>();
		Emloyees.add(new Emloyee("xxx", 5000, 1999, 10, 1));
		Emloyees.add(new Emloyee("yyy", 6000, 1999, 10, 1));
		Emloyees.add(new Emloyee("zzz", 7000, 1999, 10, 1));
		Emloyees.remove(1);
		Emloyee.add(1);

		for(Emloyee e:Emloyees)
		{
			e.raiseSalary(5);
		}
		for(Emloyee e:Emloyees)
		{
			System.out.println("name="+e.getName()+" salary="+e.getSalary());
		}
	}

}

class Emloyee
{
	public Emloyee(String n,double s,int year,int month,int day)
	{
		name=n;
		salary=s;
		GregorianCalendar calendar=new GregorianCalendar(year,month-1,day);
		hireDay=calendar.getTime();
	}
	public String getName()
	{
		return name;
	}
	
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	public Date getHireDay()
	{
		return hireDay;
	}
	public void raiseSalary(double byPercent)
	{
		double raise=salary * byPercent/100;
		salary+=raise;
	}
	
	private double  salary;
	private String name;
	private Date hireDay;
}
