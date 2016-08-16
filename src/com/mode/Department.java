package com.mode;

public class Department extends Employee
{
private String Deptname;

public  Department(int EmpId,String name,String Ssn,double Salary,String deptname) 
{
super (EmpId,name,Ssn,Salary);
this.Deptname=deptname;
}
public void show()
{
	System.out.println("Department="+Deptname);


}
}
