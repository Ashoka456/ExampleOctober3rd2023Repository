package com.sgtesting.methodassignment;

class PrimeDemo2
{
	void PrimeDemo()
	{
		int count = 0;
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
				count++;
			}
		}
		System.out.println(count);
	}
}

public class PrimeNumDemo2 {

	public static void main(String[] args) {
		
		PrimeDemo2	O=new PrimeDemo2();
		O.PrimeDemo();
	}
}