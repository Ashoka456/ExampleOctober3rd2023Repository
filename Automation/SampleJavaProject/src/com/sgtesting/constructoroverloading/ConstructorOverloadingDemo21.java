package com.sgtesting.constructoroverloading;
class University
{
	University(String uname)
	{
		System.out.println("University Name: "+uname);
	}
	University(String uloc,String course,int fees,int Ph)
	{
		System.out.println("University Location: "+uloc);
		System.out.println("Unicourse: "+course);
		System.out.println("UniFees: "+fees);
		System.out.println("Phone No: "+Ph);
	}
	University(String address,int pincode)
	{
		System.out.println("University Address: "+address);
		System.out.println("Pincode: "+pincode);
	}
}
public class ConstructorOverloadingDemo21 {

	public static void main(String[] args) {
		University Ob1=new University("VTU");
		University Ob2=new University("Belgaum","BE",7040,28477024);
		University Ob3=new University("Jnana Sangama Belagavi",590018);
	}
}
