package com.sg.test4;
class Demo3
{
	{
		System.out.println("It is instance block");
	}
}
class Demo4
{
	static
	{
		System.out.println("It is Static block");
	}
}
class Demo5
{
	void addition(int x,int y)
	{
		Demo3 O=new Demo3();
	
	int res=(x+y);
	System.out.println(res);
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
