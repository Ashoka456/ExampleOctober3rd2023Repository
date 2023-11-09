package com.sgtesting.texttwo;
class Demo3
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
	public static void main(String[] args){
		Demo3 O=new Demo3();
		int a=O.isfact(5);
		System.out.println(a);
	}
}


