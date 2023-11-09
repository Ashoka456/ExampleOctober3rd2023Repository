package com.sgtesting.twodimentionalarrayassignment;

public class TwoDimentionalIntegerArray {

	public static void main(String[] args) {
		int a[][]= {{100,300,400},{500,600,700},{700,800,900}};
		for(int i=0;i<a.length/2;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
