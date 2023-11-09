package com.sgtesting.array;

public class StringTwoDimentionalArray {

	public static void main(String[] args) {
		String a[][]= {{"Ashok","Nandan","Abi"},{"Arjun","Ravi","Govind"},{"Aravind","Anajali","Anu"}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}


	}

}
