package com.sgtesting.constructoroverloading;
class Examination
{
	Examination(String examcenter)
	{
		System.out.println("Examination Center: "+examcenter);

	}
	Examination(String exam,double fees)
	{
		System.out.println("Exam Name: "+exam);
		System.out.println("Exam Fees: "+fees);
	}
	Examination(String address,int pn,int ph )
	{
		System.out.println("Address: "+address);
		System.out.println("Pincode: "+pn);
		System.out.println("PhoneNo: "+ph);
	}

}
public class ConstuctorOverloadingDemo23 {
	public static void main(String[] args) {
		Examination Ob1=new Examination("Mangalore");
		Examination Ob2=new Examination("IBPS",825.25);
		Examination Obj3=new Examination("Besant Women's College",575003,253698);
	}
}
