package com.sgtesting.methodspractise;
class Demo1
{
	static void addition(int x,int y)
	{
		Demo2 O=new Demo2();
		O.multi(12, 4);
	
		int res=(x+y);
		System.out.println("Addition Result:"+res);
		
	}
}
class Demo2
{
 void multi(int x,int y)
{
	int res=(x*y);
	System.out.println("Multi Result:"+res);
	
}
	
}
public class CountDemo {

	public static void main(String[] args) {
		Demo1.addition(500, 300);
	

	}

}
