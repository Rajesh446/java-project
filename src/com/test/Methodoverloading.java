package com.test;

import com.model.Statistics;

public class Methodoverloading
{

	public static void main(String arg[])
	
	{
Statistics s=new Statistics();
System.out.println("avg of two numbers:"+s.average(10,20));
System.out.println("avg of three numbers:"+s.average(10,20,30));
System.out.println("avg of four numbers:"+s.average(10,20,30,40));
	}
}
