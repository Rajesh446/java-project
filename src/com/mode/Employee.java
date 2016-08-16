package com.mode;

public class Employee 
{
	private int EmpId;
	private String name;
	private String Ssn;
	private Double Salary;
	public Employee(int Empid,String name,String Ssn,Double Salary)
	{
		this.EmpId=Empid;
		this.name=name;
		this.Ssn=Ssn;
		this.Salary=Salary;
		
	
	}
	public void display()
	{
		System.out.println("Emp id:"+EmpId);
		System.out.println("Emp name:"+name);
		System.out.println("Emp Ssn:"+Ssn);
		System.out.println("Emp Salary:"+Salary);
		
	}
}
