package com.sgtesting.oopsassignment;
class Student
{
	int StdId;
	String StdName;
	String StdDept;
	int StdYear;
}
class Library
{
	int LibId ;
	int BookNo;
	String BookName;
	String IssueM;
}
class Sports
{
	int SptId;
	String SptType;
	String SptName;
	String SptLocation;
}
class CsDepartment
{
	int CSDeptNo;
	String DeptName;
	String CSDeptDay;
	String CSDeptfloor;
}
public class StudentsLibrarySports {

	public static void main(String[] args) {
		Student Obj1=new Student();
		Obj1.StdId=01;
		Obj1.StdName="Abhi";
		Obj1.StdDept="CS";
		Obj1.StdYear=2020;
		System.out.println("StdId "+Obj1.StdId);
		System.out.println("StdName "+Obj1.StdName);
		System.out.println("Stddept "+Obj1.StdDept);
		System.out.println("StdYear "+Obj1.StdYear);
		System.out.println("********************************");
		Library Obj2=new Library();
		Obj2.LibId=101;
		Obj2.BookNo=1112;
		Obj2.BookName="CCP";
		Obj2.IssueM="Nov";
		System.out.println("LibId "+Obj2.LibId);
		System.out.println("BookNo "+Obj2.BookNo);
		System.out.println("BookName "+Obj2.BookName);
		System.out.println("Issuem "+Obj2.IssueM);
		System.out.println("********************************");
		Sports Obj3=new Sports();
		Obj3.SptId=01;
		Obj3.SptType="Indoor";
		Obj3.SptName="Chess";
		Obj3.SptLocation="Bangalore";
		System.out.println("SptId "+Obj3.SptId);
		System.out.println("SptType "+Obj3.SptType);
		System.out.println("SptName "+Obj3.SptName);
		System.out.println("SptLocation "+Obj3.SptLocation);
		System.out.println("***********************************");
		CsDepartment Obj4=new CsDepartment();
		Obj4.CSDeptNo=10;
		Obj4.DeptName="CCP Lab";
		Obj4.CSDeptDay="Monday";
		Obj4.CSDeptfloor="First Floor";
		System.out.println("CSDeptNo "+Obj4.CSDeptNo);
		System.out.println("DeptName "+Obj4.DeptName);
		System.out.println("CSDeptDay "+Obj4.CSDeptDay);
		System.out.println("CSDeptfloor "+Obj4.CSDeptfloor);
		System.out.println("*****************************************");

	}

}
