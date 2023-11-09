package com.sgtesting.assignmentarray;

public class StringArrayReverseWhileLoop {

	public static void main(String[] args) {
		String str[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int i=str.length-1;
		while(i>=0)
		{
			System.out.println(str[i]);
			i--;
		}
	}

}
