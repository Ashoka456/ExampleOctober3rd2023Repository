package com.sgtesting.twodimentionalarrayassignment;

public class TwoDimentionalShortArray {

	public static void main(String[] args) {
		short a[][]= {{10,12,13},{14,15,16},{17,18,19}};
		for(int i=a.length-1;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
