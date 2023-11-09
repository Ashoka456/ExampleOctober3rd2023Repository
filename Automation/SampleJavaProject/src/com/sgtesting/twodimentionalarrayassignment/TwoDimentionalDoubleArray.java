package com.sgtesting.twodimentionalarrayassignment;

public class TwoDimentionalDoubleArray {

	public static void main(String[] args) {
		double a[][]= {{10.2,12.1,12.5},{10.7,12.7,15.5},{13.5,14.5,18.5}};
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
