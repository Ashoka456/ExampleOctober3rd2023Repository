package com.sg.test4;
class Demo1
{

	{
	
		System.out.println("It is instance block");
	}
	static 
	{
		System.out.println("It is a Static block");
	}
}
class Demo2
{
	
		void addition(int x,int y)
		{
			Demo1 O=new Demo1();
			int res=(x+y);
			System.out.println(res);
			
		}
	}
public class Question01 {

	public static void main(String[] args) {
		Demo2 O=new Demo2();
		O.addition(20, 30);
	}

}
