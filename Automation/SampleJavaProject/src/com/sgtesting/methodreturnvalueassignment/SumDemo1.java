package com.sgtesting.methodreturnvalueassignment;
class Demo1
{
	int isSum(int s)
	{
		int sum =0;

		for(int i=1;i<=s;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
}
public class SumDemo1 {

	public static void main(String[] args) {
		Demo1 O=new Demo1();
		int a=O.isSum(20);
		System.out.println(a);
	}
}
