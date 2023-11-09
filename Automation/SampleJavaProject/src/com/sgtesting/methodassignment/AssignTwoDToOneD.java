package com.sgtesting.methodassignment;
class Demo6
{
	void AssignArray(int x[][])
	{
		int m[]=new int[x.length*x[1].length];
		for(int i=0;i<x.length;i++)
		{
			m[i]=x[1][i];
			System.out.println(m[i]+" ");
		}
		System.out.println();
	}
}
public class AssignTwoDToOneD {

	public static void main(String[] args) {
		int a[][]= {{50,100,150},{200,250,300,},{350,400,450}};
		Demo6 O=new Demo6();
		O.AssignArray(a);

	}

}
