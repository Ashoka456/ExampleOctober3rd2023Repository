package com.sgtesting.methodassignment;

class PrimeDemo4
{
	void isPrime()
	{
		for(int num = 250;num >= 200;num--)
		{
			int flag=0;
			for(int j=2;j<num;j++)
			{
				if(num%j==0)
				{
					flag+=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(num+" is a Prime number ");
			}
			else
			{
				System.out.println(num+" is not a Prime number ");
			}
		}
	}
}

public class PrimeNumDemo4 {

	public static void main(String[] args) {
		// Constructor method Prime number in between 250 - 200
		PrimeDemo4 O=new PrimeDemo4();
		O.isPrime();
	}
}