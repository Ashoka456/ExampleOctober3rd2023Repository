package com.sgtesting.abstractassignment;
abstract class Parent3{
	Parent3(String name,int age){
		System.out.println("String Name :"+name);
		System.out.println("Age :"+age);
	}
}
class Child3 extends Parent3{
	String location;
	Child3(String name,int age,String location){
		super(name,age);
		this.location=location;
		System.out.println("Location :"+location);
	}
}
class Child4 extends Child3{
	String Hobbie;
	Child4(String name,int age,String location,String Hobbie){
		super(name,age,location);
		this.Hobbie=Hobbie;
		System.out.println("Hobbie :"+Hobbie);
	}
}
public class MultilevelParameterizedAbstract {

	public static void main(String[] args) {
		Child4 O=new Child4("Aniketh",24,"Mangalore","Chess");

	}

}
