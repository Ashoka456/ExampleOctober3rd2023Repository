package com.sgtesting.methodspractise;
class Maths1
{
	void Factorial1(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of "+num+" is "+fact);
		
	}
}

public class Factorial {

	public static void main(String[] args) {
		Maths1 O=new Maths1();
		O.Factorial1(5);

	}

}
