package com.sgtesting.interfaceassignment;

interface AdditionDemo
{
	void add(int a,int b);
}
interface substractionDemo extends AdditionDemo
{
	abstract void sub(int c,int d); 
}

class Multiplication implements AdditionDemo,substractionDemo
{
	public void Addition(int a,int b)
	{
		System.out.println("Addition :"+(a+b));
	}
	public void substraction(int c,int d)
	{
		System.out.println("Substraction :"+(c-d));
	}
	void Mult(int i,int j)
	{
		System.out.println("Miltiplication :"+(i*j));
	}
}
public class InterfaceAssignment04 {
	public static void main(String[] args) {
		Multiplication o=new Multiplication();
		o.add(20, 10);
		o.substraction(20, 15);
        o.Mult(2, 10);
	}

}
