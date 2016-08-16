package com.Tes2;

import com.modl.Employee;

public class Testclient 
{

	public static void main(String args[])
	{
		Employee e=new Employee();
		
		e.setEmpid(100);
		e.setName("raj");
		e.setSsn("appu123");
		e.setSalary(12356132.2564);
		System.out.println(e.getEmpid());
		System.out.println(e.getName());
		System.out.println(e.getSsn());
		System.out.println(e.getSalary());
	}
	
	
	
}
