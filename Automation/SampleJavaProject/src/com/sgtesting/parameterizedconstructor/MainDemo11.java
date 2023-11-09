package com.sgtesting.parameterizedconstructor;
class Employee
{
	int EmpID;
	String EmployeeName;
	String JobName;
	int EmpSalary;
	Employee(int eID,String ename,String jname,int esal)
	{
		EmpID=eID;
		EmployeeName=ename;
		JobName=jname;
		EmpSalary=esal;
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
	Department(int dID,String dName,String dloc,String dflr)
	{
		DeptID=dID;
		DeptName=dName;
		DeptLocation=dloc;
		DeptFloor= dflr;
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
	Insurance(String itype,int ino,int iyear,int iamt)
	{
		InsType=itype;
		InsNo=ino;
		InsYear=iyear;
		InsAmt=iamt;
		System.out.println("InsType: "+InsType);
		System.out.println("InsNo: "+InsNo);
		System.out.println("InsYear: "+InsYear);
		System.out.println("InsAmt: "+InsAmt);
		System.out.println("*********************");
	}
}
public class MainDemo11 {

	public static void main(String[] args) {
		Employee obj1=new Employee(10,"Ashok","Testing",40000);

		Department obj2=new Department(112,"Testing","Bangalore","First Floor");

		Insurance obj3=new Insurance("Vehicle",1012,2017,1500);
	}

}





