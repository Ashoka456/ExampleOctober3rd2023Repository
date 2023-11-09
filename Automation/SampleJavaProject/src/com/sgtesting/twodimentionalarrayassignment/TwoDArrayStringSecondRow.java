package com.sgtesting.twodimentionalarrayassignment;

public class TwoDArrayStringSecondRow {

	public static void main(String[] args) {
		String a[][]= {{"One","Two","Three"},{"Four","Five","Six"},{"Seven","Eight","Nine"}};
		for(int i=a.length/2;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[1][j]+" ");
			}
			System.out.println();
		}
	}

}
