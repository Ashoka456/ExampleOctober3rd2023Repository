package com.sgtesting.twodimentionalarrayassignment;

public class TwoDimentionalArrayTransposeElements {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{15,16,17},{18,19,20}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}

	}

}
