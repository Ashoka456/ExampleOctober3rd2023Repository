package com.sgtesting.interfaceassignment;

interface University
{
	void UniversityName(String name);
}
interface College
{
	abstract void CollegeName(String name); 
}
interface Student
{
	abstract void StudentName(String name); 
}
class Engineering implements University,College,Student
{
	public void UniversityName(String name)
	{
		System.out.println("University :"+name);
	}
	public void CollegeName(String name)
	{
		System.out.println("College :"+name);
	}
	public void StudentName(String name)
	{
		System.out.println("Student :"+name);
	}
	void location(String location)
	{
		System.out.println("location :"+location);
	}
}
public class MultipleInheritanAssign01 {
	public static void main(String[] args) {
		Engineering o=new Engineering();
		o.UniversityName("VTU");
		o.CollegeName("KVG");
		o.StudentName("Ashok");
		o.location("Mangalore");

	}

}
