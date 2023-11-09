package com.sgtesting.abstractassignment;
abstract class State1
{
	abstract void State1Name(String name);
	
}
class District1 extends State1
{
	void State1Name(String name)
	{
		System.out.println("State name:"+name);
	}
	void District1Name(String name)
	 {
		System.out.println("District name:"+name);
	 }
	
}
class Taluk extends State
{
	void StateName(String name)
	{
		System.out.println("State name:"+name);
	}
	 void TalukName(String name)
	 {
		System.out.println("Taluk Name:"+name);
	 }
	
}
class Villege extends Taluk
{
	void VillegeName(String name)
	{
		System.out.println("Villege name:"+name);
	}

}
public class HybridInheritanceAbstractMethod {

	public static void main(String[] args) {
		Villege ob1=new Villege();
		 ob1.StateName("Karnataka");
		 ob1.TalukName("Sullia");
		 ob1.VillegeName("Sampaje");
		 System.out.println("+++++Hybrid inheritence+++++");
		 District1 ob2=new District1();
		 ob2.State1Name("Kerala");
		 ob2.District1Name("Kasaragod");
		


	}

}
