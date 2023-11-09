package com.sgtesting.methodassignment;
class Demo5
{
	void MatrixSub(int a[][],int b[][])
	{
		if(a.length==b.length && a[0].length==b[0].length)
		{
			System.out.println("Before Transpose");
			int c[][]=new int[a.length][a[0].length];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					c[i][j]=a[i][j]-b[i][j];
					System.out.println(c[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("After Transpose");
			for(int m=0;m<a.length;m++)
			{
				for(int n=0;n<a[m].length;n++)
				{
					System.out.println(c[n][m]+" ");
				}
				System.out.println();
			}
		}

	}
}
public class SubOfTwoMatrix {

	public static void main(String[] args) {
		int k[][]= {{20,20,30},{10,20,15},{20,18,19}};
		int l[][]= {{6,7,8},{8,12,13},{12,14,16}};
		Demo5 O=new Demo5();
		O.MatrixSub(k,l);

	}

}
