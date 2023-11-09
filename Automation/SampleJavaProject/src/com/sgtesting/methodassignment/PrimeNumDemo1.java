package com.sgtesting.methodassignment;

class PrimeDemo1
{
	void isPrime()
	{
		for(int num = 50;num <=100;num++)
		{
			int flag=0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag+=1;
					break;
				}

			}
			if(flag==0)
			{
				System.out.println(num+"is a Prime Number");
			}
			else
			{
				System.out.println(num+" is not a prime number");
			}
		}
	}
}

public class PrimeNumDemo1 {

	public static void main(String[] args) {
		// Constructor method Prime in between 50 - 100
		PrimeDemo1	O=new PrimeDemo1();
		O.isPrime();
	}
}