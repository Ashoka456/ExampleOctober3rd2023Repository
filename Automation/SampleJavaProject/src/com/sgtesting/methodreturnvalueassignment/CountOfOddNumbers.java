package com.sgtesting.methodreturnvalueassignment;
class Demo2 
{
	int count(int x) 
	{
		int count = 0;
		for (int i = 150; i <= x; i++) {
			if (i % 2 == 1) 
			{
				count++;
			}
		}
		return count;
	}
}
public class CountOfOddNumbers {

	public static void main(String[] args) {
		Demo2 O = new Demo2();
		int s = O.count(250);
		System.out.println(s);
	}
}
