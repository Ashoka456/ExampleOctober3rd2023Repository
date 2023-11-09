package com.sgtesting.noargsconstructor;
class Student
{
	int StdId;
	String StdName;
	String StdDept;
	int StdYear;
	Student()
	{
		StdId=01;
		StdName="Abhi";
		StdDept="CS";
		StdYear=2020;
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
	Library()
	{
		LibId=101;
		BookNo=1112;
		BookName="CCP";
		IssueM="Nov";
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
	Sports()
	{
		SptId=01;
		SptType="Indoor";
		SptName="Chess";
		SptLocation="Bangalore";
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
	CsDepartment()
	{
		CSDeptNo=10;
		DeptName="CCP Lab";
		CSDeptDay="Monday";
		CSDeptfloor="First Floor";
		System.out.println("CSDeptNo "+CSDeptNo);
		System.out.println("DeptName "+DeptName);
		System.out.println("CSDeptDay "+CSDeptDay);
		System.out.println("CSDeptfloor "+CSDeptfloor);
		System.out.println("*****************************************");

	}
}
public class MainDemo6 {

	public static void main(String[] args) {
		Student Obj1=new Student();

		Library Obj2=new Library();

		Sports Obj3=new Sports();

		CsDepartment Obj4=new CsDepartment();

	}

}

