package com.sgtesting.twodimentionalarrayassignment;

public class TwoDimentionalCharacterArray {

	public static void main(String[] args) {
		char ch[][]= {{'A','B','C'},{'D','E','F'},{'H','I','J'}};
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length/2;j++)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}


	}

}
