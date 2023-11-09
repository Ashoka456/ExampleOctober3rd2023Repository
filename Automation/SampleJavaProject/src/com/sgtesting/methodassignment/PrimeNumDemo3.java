package com.sgtesting.methodassignment;
class PrimeDemo3
{
	void isPrime()
	{
		int sum = 0;
		for(int num =1;num <= 100;num++)
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
					sum=sum+num;
				}
}
		System.out.println(sum);
	}
}
public class PrimeNumDemo3 {

	public static void main(String[] args) {
		// Constructor method sum of Prime number in between 150 - 100
		PrimeDemo3 O=new PrimeDemo3();
		O.isPrime();
	}
}