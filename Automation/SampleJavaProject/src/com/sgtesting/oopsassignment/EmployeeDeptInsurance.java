package com.sgtesting.oopsassignment;
class Employee
{
	int EmpID;
	String Employee;
	String JobName;
	int EmpSalary;
}
class Department
{
	int DeptID;
	String DeptName;
	String DeptLocation;
	String DeptFloor;
}
class Insurance
{
	String InsType;
	int InsNo;
	int InsYear;
	int InsAmt;
}

public class EmployeeDeptInsurance {

	public static void main(String[] args) {
		Employee obj1=new Employee();
		obj1.EmpID=10;
		obj1.Employee="Nandan";
		obj1.JobName="Manager";
		obj1.EmpSalary=40000;
		System.out.println("EmpID: "+obj1.EmpID);
		System.out.println("Employee: "+obj1.Employee);
		System.out.println("JobName: "+obj1.JobName);
		System.out.println("EmpSalary: "+obj1.EmpSalary);
		System.out.println("***********************");
		Department obj2=new Department();
		obj2.DeptID=102;
		obj2.DeptName="Testing";
		obj2.DeptLocation="Bangalore";
		obj2.DeptFloor="First Floor";
		System.out.println("DeptID: "+obj2.DeptID);
		System.out.println("DeptName: "+obj2.DeptName);
		System.out.println("DeptLocation: "+obj2.DeptLocation);
		System.out.println("DeptFloor "+obj2.DeptFloor);
		System.out.println("***********************");
		Insurance obj3=new Insurance();
		obj3.InsType="Vehicle";
		obj3.InsNo=110;
		obj3.InsYear=2017;
		obj3.InsAmt=1500;
		System.out.println("InsType: "+obj3.InsType);
		System.out.println("InsNo: "+obj3.InsNo);
		System.out.println("InsYear: "+obj3.InsYear);
		System.out.println("InsAmt: "+obj3.InsAmt);
		System.out.println("*********************");
	}

}
