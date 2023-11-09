package com.sgtesting.methodspractise;
class Maths
{
	boolean isPrime(int num)
	{
		int flag=0;
		boolean result=false;
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
			result=true;
		}
		return result;
	}
	
}
public class PrimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths O=new Maths();
		boolean v1=O.isPrime(31);
		System.out.println(v1);
		boolean v2=O.isPrime(12);
		System.out.println(v2);
	}

}
