package java1;
import java.util.*;
class Employee {
    String name;
    int age;
    public void setDetails(String name,int age) {
    	this.name=name;
    	this.age=age;
    }
    public String getDetails() {
    	return "name:"+name+",age:"+age;
}
	
}
class FullTimeEmployee extends Employee{
	double salary;
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
}
class PartTimeEmployee extends Employee{
	double hourlyrate;
	int hours;
	public void setHourlyRate(int hourlyrate,int hours)
	{
		this.hourlyrate=hourlyrate;
	this.hours=hours;
}
	public double getSalary()
	{
		return hourlyrate*hours;
	}
}
public class Maini{
	public static void main(String args[]) {
		ArrayList<Employee> em=new ArrayList<>();
		FullTimeEmployee fte=new FullTimeEmployee();
		fte.setDetails("Roshan", 25);
		fte.setSalary(25000);
		em.add(fte);
		PartTimeEmployee pte=new PartTimeEmployee();
		pte.setDetails("Rani", 23);
		pte.setHourlyRate(12,25);
		em.add(pte);
	
			System.out.println(fte.getDetails());
			System.out.println("Salary:"+fte.getSalary());
			System.out.println();

			System.out.println(pte.getDetails());
			System.out.println("Salary:"+pte.getSalary());
			System.out.println();
		
		
}
}

