package com.sgtesting.interfaceassignment;

interface University1
{
	void UniversityName(String name);
}
interface College1
{
	abstract void CollegeName(String name); 
}
class Engineering1 implements University1,College1
{
	public void UniversityName(String name)
	{
		System.out.println("University :"+name);
	}
	public void CollegeName(String name)
	{
		System.out.println("College :"+name);
	}
	void location(String location)
	{
		System.out.println("location :"+location);
	}
}
public class MultipleInheritanceAssign02 {
	public static void main(String[] args) {
		Engineering1 o=new Engineering1();
		o.UniversityName("VTU");
		o.CollegeName("RIt");
		o.location("Hassan");

	}

}
