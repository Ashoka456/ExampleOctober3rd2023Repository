package com.sgtesting.assignmentarray;

public class FloatArraySecondHalf {

	public static void main(String[] args) {
		float a[]= {10.75f,11.25f,12.75f,13.75f,14.25f,15.75f};
		int i=a.length/2;
		while(i<a.length)
		{
			System.out.println(a[i]);
			i++;
		}
	}

}
