package com.sgtesting.inheritanceassignment;
class Company
{
	String cname;
	String Loc;
	int ph;
	Company()
	{
		cname="Infosys";
		Loc="Bangalore";
		ph=562389;
		System.out.println("Company Name:"+cname);
		System.out.println("Company Location:"+Loc);
		System.out.println("Company Phone No:"+ph);

	}
}
class Employee1 extends Company
{
	int empid;
	String empName;
	double empSal;
	Employee1()
	{
		empid=10;
		empName="Ashok";
		empSal=75589.55;
		System.out.println("Employee ID:"+empid);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Salary:"+empSal);
	}

}
class Employee2 extends Employee1
{
	int empid;
	String empName;
	double empsal;
	Employee2()
	{
		empid=12;
		empName="Ravi Kiran";
		empsal=60730.88;
		System.out.println("Employee ID:"+empid);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Salary:"+empsal);

	}
}
public class HierarchialInheritance {

	public static void main(String[] args) {
		Employee2 O=new Employee2();

	}

}
