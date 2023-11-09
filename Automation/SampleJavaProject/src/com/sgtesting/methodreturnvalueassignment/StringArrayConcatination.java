package com.sgtesting.methodreturnvalueassignment;
class Demo8 {
	String stringArray(String a[][]) 
	{
		String s = " ";
		for (int i = 0;i < a.length;i++)
		{
			for (int j =0;j < a[i].length;j++) 
			{
				s = s + a[i][j];
			}
		}
		return s;
	}
}
public class StringArrayConcatination {

	public static void main(String[] args) {
		Demo8 O = new Demo8();
		String s[][]={{"One","Two","Three"},{"Four","Five","Six"},{"Seven","Eight","Nine" }};
		String str=O.stringArray(s);
		System.out.println(str);
	}
}
