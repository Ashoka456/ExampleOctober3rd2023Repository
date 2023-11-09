package com.sgtesting.inheritanceassignment;
class Students
{
	Students(String fname,String location)
	{
		System.out.println("First Name :"+fname);
		System.out.println("Location :"+location);
	}
}
class Librarya extends Students
{
	String bookname;
	Librarya(String fname,String location,String bookname)
	{
		super(fname,location);	
		this.bookname=bookname;
		System.out.println("Book Name :"+bookname);
	}
}
class Sports extends Students
{
	String Sname;
	Sports(String fname,String location,String bookname,String Sname)
	{
		super(fname,location);
		this.Sname=Sname;
		System.out.println("Sport :"+Sname);
	}
}
public class HierarchialInheritanceParameterizedConstuctor {

	public static void main(String[] args) {
		Sports O=new Sports("Ranjan","Banglore","Python","Chess");
		Sports O1=new Sports("Aniketh","Banglore","core java","Cricket");


	}

}
