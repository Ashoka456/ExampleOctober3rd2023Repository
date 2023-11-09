package com.sgtesting.text;

public class SumEvenNumber {

	public static void main(String[] args) {
		int a[]= {8,3,5,10,7,4,21,2,9,6};
		int sum=0;
		for(int i=0;i<a.length;i++)
			
		{
		
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
		}
      System.out.println(sum);
	}

}
