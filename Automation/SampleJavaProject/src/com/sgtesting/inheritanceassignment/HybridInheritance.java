package com.sgtesting.inheritanceassignment;
class Company1
{
	String cname;
	String Loc;
	int ph;
	Company1()
	{
		cname="Infosys";
		Loc="Bangalore";
		ph=562389;
		System.out.println("Company Name:"+cname);
		System.out.println("Company Location:"+Loc);
		System.out.println("Company Phone No:"+ph);

	}
}
class Employee3 extends Company
{
	int empid;
	String empName;
	double empSal;
	Employee3()
	{
		empid=27;
		empName="Ranjith";
		empSal=75589.55;
		System.out.println("Employee ID:"+empid);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Salary:"+empSal);
	}

}
class Employee4 extends Employee3
{
	int empid;
	String empName;
	double empsal;
	Employee4()
	{
		empid=22;
		empName="Abdul Khadar";
		empsal=60730.88;
		System.out.println("Employee ID:"+empid);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Salary:"+empsal);

	}
}
class Manger extends Company
{
	int mId;
	String mname ;
	double msal;
	Manger()
	{
		mId=10;
		mname="Robert";
		msal=99785.95;
		System.out.println("Manger Id:"+mId);
		System.out.println("Manger Name:"+mname);
		System.out.println("Manger Salary:"+msal);
		
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		Manger O=new Manger();
		
		Employee4 O1=new Employee4();
	}

}
