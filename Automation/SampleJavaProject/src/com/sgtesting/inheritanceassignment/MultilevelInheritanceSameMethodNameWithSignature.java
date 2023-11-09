package com.sgtesting.inheritanceassignment;

class GrandparentA
{
	void displayinfo(String name)
	{
		System.out.println("Grandparent Name is: "+name);

	}
}

class ParentB extends GrandparentA
{
	ParentB(String name)
	{
		super.displayinfo(name);
	}

	void displayinfo(String name)
	{
		System.out.println("Parent name: "+name);

	}
}

class ChildC extends ParentB
{
	ChildC(String name,String name1)
	{
		super(name); 
		super.displayinfo(name1);
	}

	void displayinfo(String name)
	{
		System.out.println("Child12 Name: "+name);
	}
}
public class MultilevelInheritanceSameMethodNameWithSignature {

	public static void main(String[] args) {
		ChildC O=new ChildC("Ani", "Anitha");
		O.displayinfo("Anjali");
	}
}
