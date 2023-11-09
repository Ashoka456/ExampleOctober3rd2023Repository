package com.sgtesting.singledimentionalarray;

public class SingleDimentionalArrayDivisibleByNine {

	public static void main(String[] args) {
		int count=0;
		for(int i=200;i>=100;i--)
		{
			if(i%9==0)
			{
				count++;
			}
		}
		System.out.println("# of Elements: "+count);
		//Declare an array
		int a[]=new int[count];
		//Assign Divisible by nine into an Array
		int k=0;
		for(int j=200;j>=100;j--)
		{
			if(j%9==0)
			{
				a[k]=j;
				k++;
			}
		}
		//Read Elements
		for(int m=a.length/2;m<a.length;m++)
		{
			System.out.println(a[m]);
		}

	}

}
