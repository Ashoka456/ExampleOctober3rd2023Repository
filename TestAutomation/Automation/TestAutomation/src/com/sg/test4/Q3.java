package com.sg.test4;
class Demo21
{
	void addtion(int x,int y)
	{
		int res=(x+y);
		System.out.println(res);
	}
	{
		System.out.println("It is a instance block");
	}
}
class Demo23
{
	static void multiplication(int x,int y)
	{
		Demo21 O=new Demo21();
		O.addtion(10, 20);
		int res=(x*y);
		System.out.println(res);
	}
	
}
public class Q3 {

	public static void main(String[] args) {
		Demo23.multiplication(10, 2);
	}

}
