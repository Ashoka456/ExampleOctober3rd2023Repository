package com.sgtesting.methodreturnvalueassignment;
class Demo6
{
	int isfact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;

	}
}
public class Factorial {

	public static void main(String[] args) {
		Demo6 O=new Demo6();
		int res=O.isfact(6);
		System.out.println("Factorial is :"+res);
	}
}
