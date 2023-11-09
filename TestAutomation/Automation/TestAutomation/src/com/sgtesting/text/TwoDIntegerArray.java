package com.sgtesting.text;

public class TwoDIntegerArray {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{20,40,60},{30,60,80}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		}
		System.out.println();

	}

}
