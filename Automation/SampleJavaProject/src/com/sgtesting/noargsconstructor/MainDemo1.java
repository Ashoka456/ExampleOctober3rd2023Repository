package com.sgtesting.noargsconstructor;
class Employee
{
	int EmpID;
	String EmployeeName;
	String JobName;
	int EmpSalary;
	Employee()
	{
		EmpID=10;
		EmployeeName="Ashok";
		JobName="Testing";
		EmpSalary=40000;
		System.out.println("Empid "+EmpID);
		System.out.println("EmployeeName "+EmployeeName);
		System.out.println("JobName "+JobName);
		System.out.println("EmpSalary "+EmpSalary);
		System.out.println("+++++++++++++++++++++++++++++++");
	}

}
class Department
{
	int DeptID;
	String DeptName;
	String DeptLocation;
	String DeptFloor;
	Department()
	{
		DeptID=02;
		DeptName="Testing";
		DeptLocation="Bangalore";
		DeptFloor="First Floor";
		System.out.println("DeptID "+DeptID);
		System.out.println("DeptName "+DeptName);
		System.out.println("DeptLocation "+DeptLocation);
		System.out.println("DeptFloor "+DeptFloor);
		System.out.println("+++++++++++++++++++++++++++++++++++");
	}
}
class Insurance
{
	String InsType;
	int InsNo;
	int InsYear;
	int InsAmt;
	Insurance()
	{
		InsType="Vehicle";
		InsNo=110;
		InsYear=2017;
		InsAmt=1500;
		System.out.println("InsType: "+InsType);
		System.out.println("InsNo: "+InsNo);
		System.out.println("InsYear: "+InsYear);
		System.out.println("InsAmt: "+InsAmt);
		System.out.println("*********************");

	}
}
public class MainDemo1 {

	public static void main(String[] args) {
		Employee obj1=new Employee();

		Department obj2=new Department();

		Insurance obj3=new Insurance();

	}

}


