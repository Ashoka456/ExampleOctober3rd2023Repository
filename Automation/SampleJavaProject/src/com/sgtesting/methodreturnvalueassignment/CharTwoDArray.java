package com.sgtesting.methodreturnvalueassignment;

class Demo5 {
	char[] twoarray(char ch[][])
	{
		int k =0;
		char a[] =new char[ch.length];
		for(int i=0;i<ch.length;i++) 
		{
			a[k] =ch[0][i];
			k++;
		}
		return a;
	}
}

public class CharTwoDArray {

	public static void main(String[] args) {
		Demo5 O=new Demo5();
		char b[][]={{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		char x[]=O.twoarray(b);
		for(int i=0;i<x.length;i++)
			System.out.print(x[i]+" ");
	}
}
