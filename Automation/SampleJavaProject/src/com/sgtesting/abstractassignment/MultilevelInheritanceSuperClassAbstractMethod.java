package com.sgtesting.abstractassignment;
abstract class College
{
	abstract void showCollegeName(String name);
	
}
class EngineeringCollege extends College
{
	void showCollegeName(String name)
	{
		System.out.println("Engineering College name:"+name);
	}
	//abstract void displayCityName(String name);
	
}
class Branch extends EngineeringCollege
{
	void BranchName(String name)
	{
		System.out.println("Branch name:"+name);
	}
	void displayCityName(String name)
	{
		System.out.println("CityName:"+name);
	}
}

public class MultilevelInheritanceSuperClassAbstractMethod {

	public static void main(String[] args) {
		
		Branch ob1=new Branch();
		 ob1.BranchName("ME");
		 ob1.displayCityName("Mangalore");
		 ob1.showCollegeName("KVG");

	}

}
