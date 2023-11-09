package com.sgtesting.methodassignment;
class Demo7
{
	void StringArray(String a[][])
	{
		for(int i=a.length-1;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				String b=a[i][j];
				System.out.print(b);
			}
		}
	}
}

public class StringTwoDArray {

	public static void main(String[] args) {
		Demo7 O=new Demo7();
		String a[][]= {{"One","Two","Three"},{"Four","Five","Six"},{"Seven","Eight","Nine"}};
		O.StringArray(a);
	}

}
