package com.sgtesting.methodassignment;
class Demo8
{
	void CharTwoDArray(char ch[][])
	{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length;j++)
			{
				char b=ch[i][j];
				System.out.print(b);
			}
		}
	}
}
public class CharConcatinationArray {

	public static void main(String[] args) {
		Demo8 O=new Demo8();
		char ch[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		O.CharTwoDArray(ch);

	}

}
