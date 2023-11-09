package com.sgtesting.texttwo;
class Demo2
{
	short []isarry(short a[])
	{ 
		int count=0;
		short x[]=new short[a.length];
		for(int i=0;i<=10;i++)
		{
			count++;
		}
		return x;
	}
}
public class ShortArray {

	public static void main(String[] args) {
		Demo2 O=new Demo2();
		short y[]= {1,2,3,4,5,6,7,10};
		short z[]=O.isarry(y);
		for(int i=0;i<z.length;i++)
		System.out.println(z[i]);

	}

}
