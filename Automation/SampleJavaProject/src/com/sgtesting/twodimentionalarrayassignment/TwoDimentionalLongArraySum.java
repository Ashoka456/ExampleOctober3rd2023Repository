package com.sgtesting.twodimentionalarrayassignment;

public class TwoDimentionalLongArraySum {

	public static void main(String[] args) {
		long a[][]= {{10,15,16},{17,18,19},{20,21,22}};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum+=a[i][j];
			}
		}
		System.out.print(sum);

	}

}
