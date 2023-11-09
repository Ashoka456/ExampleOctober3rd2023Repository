package com.sgtesting.inheritanceassignment;
class College
{
	String cname;
	String loc;
	int ph;
	College()
	{
		cname="KVG";
		loc="Sullia";
		ph=256896;
		System.out.println("College Name:"+cname);
		System.out.println("Location:"+loc);
		System.out.println("Phone No:"+ph);
	}
}
class Branch extends College
{
	String bname;
	String bfloor;
	int ph;
	Branch()
	{
		bname="Mechanical";
		bfloor="Second Floor";
		ph=258456;
		System.out.println("Branch Name:"+bname);
		System.out.println("Branch Floor:"+bfloor);
		System.out.println("Phone No:"+ph);
	}

}
class Student extends Branch
{
	String stdName;
	int stdid;
	int ph;
	Student()
	{
		stdName="Aniketh";
		stdid=12;
		ph=980693662;
		System.out.println("Student Name:"+stdName);
		System.out.println("Student ID:"+stdid);
		System.out.println("Student Phone No:"+ph);

	}

}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Student Obj=new Student();


	}

}
