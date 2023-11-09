package com.sgtesting.twodimentionalarrayassignment;

public class TwoDimentionalStringArray {

	public static void main(String[] args) {
		String b=" ";
		String a[][]= {{"Ashok","Abhi","Rohith"},{"Nandan","Anu","Santosh"},{"Rakshith","Raviraj","Kiran"}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b=b+a[i][j];
			}
		}
		System.out.print(b);
	}
}


