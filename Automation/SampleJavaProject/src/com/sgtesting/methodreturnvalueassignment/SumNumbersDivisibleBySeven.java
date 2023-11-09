package com.sgtesting.methodreturnvalueassignment;

class Demo3 {
	int isSum(int s) {
		int sum=0;
		for (int i=100;i <= s;i++)
		{
			if (i % 7 == 0) 
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}
public class SumNumbersDivisibleBySeven {

	public static void main(String[] args) {
		Demo3 O = new Demo3();
		int a = O.isSum(200);
		System.out.println(a);
	}
}
