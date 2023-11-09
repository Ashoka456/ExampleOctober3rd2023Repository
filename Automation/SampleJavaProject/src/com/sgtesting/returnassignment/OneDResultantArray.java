package com.sgtesting.returnassignment;
class ArrayDemo6
{
	int[] resultantArray(int a[],int b[])
	{
		int x[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			x[k]=a[i];
			k++;
		}
		for(int j=0;j<b.length;j++)
		{
			x[k]=b[j];
			k++;
		}
		return x;
	}
}
public class OneDResultantArray {

	public static void main(String[] args) {
		ArrayDemo6 O=new ArrayDemo6();
		int c[]= {5,7,9};
		int d[]= {4,6,8};
		int y[]=O.resultantArray(c, d);
		for(int i=0;i<y.length;i++)
		{
			System.out.print(y[i]+" ");
		}

	}

}
