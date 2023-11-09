package com.sgtesting.inheritanceassignment;

class StudentB
{
	StudentB(String fname,String location)
	{
		System.out.println("First Name :"+fname);
		System.out.println("Location :"+location);
	}
}
class Library extends StudentB
{
	String bookname;
	Library(String fname,String location,String bookname)
	{
		super(fname,location);	
		this.bookname=bookname;
		System.out.println("Book Name :"+bookname);
	}
}
class Sport extends Library
{
	String Sname;
	Sport(String fname,String location,String bookname,String Sname)
	{
		super(fname,location,bookname);
		this.Sname=Sname;
		System.out.println("Sport :"+Sname);
	}
}

public class MultilevelInheritanceSuperClassParameter {

	public static void main(String[] args) {
		Sport o=new Sport("Ashok","Mangalore","Core Java","Cricket");

	}

}
