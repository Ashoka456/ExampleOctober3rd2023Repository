package com.sgtesting.parameterizedconstructor;
class Student
{
	int StdId;
	String StdName;
	String StdDept;
	int StdYear;
	Student(int sid,String stname,String stdept,int styear)
	{
		StdId=sid;
		StdName=stname;
		StdDept=stdept;
		StdYear=styear;
		System.out.println("StdId "+StdId);
		System.out.println("StdName "+StdName);
		System.out.println("Stddept "+StdDept);
		System.out.println("StdYear "+StdYear);
		System.out.println("********************************");	
	}
}
class Library
{
	int LibId ;
	int BookNo;
	String BookName;
	String IssueM;
	Library(int lid,int bno,String bname,String imonth)
	{
		LibId=lid;
		BookNo=bno;
		BookName=bname;
		IssueM=imonth;
		System.out.println("LibId "+LibId);
		System.out.println("BookNo "+BookNo);
		System.out.println("BookName "+BookName);
		System.out.println("Issuem "+IssueM);
		System.out.println("********************************");	
	}
}
class Sports
{
	int SptId;
	String SptType;
	String SptName;
	String SptLocation;
	Sports(int sid,String styp,String sname,String sloc)
	{
		SptId=sid;
		SptType=styp;
		SptName=sname;
		SptLocation=sloc;
		System.out.println("SptId "+SptId);
		System.out.println("SptType "+SptType);
		System.out.println("SptName "+SptName);
		System.out.println("SptLocation "+SptLocation);
		System.out.println("***********************************");
	}
}
class CsDepartment
{
	int CSDeptNo;
	String DeptName;
	String CSDeptDay;
	String CSDeptfloor;
	CsDepartment(int deptno,String deptn,String deptd,String deptfr)
	{
		CSDeptNo=deptno;
		DeptName=deptn;
		CSDeptDay=deptd;
		CSDeptfloor=deptfr;
		System.out.println("CSDeptNo "+CSDeptNo);
		System.out.println("DeptName "+DeptName);
		System.out.println("CSDeptDay "+CSDeptDay);
		System.out.println("CSDeptfloor "+CSDeptfloor);
		System.out.println("*****************************************");
	}
}
public class MainDemo16 {

	public static void main(String[] args) {
		Student Obj1=new Student(1,"Abhi","CS",2020);

		Library Obj2=new Library(101,1112,"CCP","Nov");

		Sports Obj3=new Sports(01,"Indoor","Chess","Bangalore");

		CsDepartment Obj4=new CsDepartment(10,"CCP Lab","Monday","First Floor");
	}
}


