package com.sgtesting.text;

public class ByteArray {

	public static void main(String[] args) {
		byte a[][]= {{10,20,40},{30,40,60}};
		for(int i=a.length/2;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		}
		System.out.println();

	}

}
