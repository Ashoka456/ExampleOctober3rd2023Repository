package com.sgtesting.twodimentionalarrayassignment;

public class TwoDimentionalStringArraySecondRowElements {

	public static void main(String[] args) {
		String a[][]= {{"One","Two","Three"},{"Four","Five","Six"},{"Seven","Eight","Nine"}};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[1][i]+" ");
		}
	}

}
