package com.sgtesting.methodassignment;
class CharDemo
{
	void CharDemo1(char[][] a)
	{
		for(int i = 0;i <a.length;i++)
		{
			for(int j = 0;j <a[i].length;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}
public class CharArray2DTransposeArray {

	public static void main(String[] args) {
		// Character Array 2D and Transpose the Array
		char a[][] = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		CharDemo O=new CharDemo();
		O.CharDemo1(a);
	}
}