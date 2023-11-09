package com.sgtesting.abstractassignment;
abstract class State
{
	static
	{
		System.out.println("its a static block");
	}
	
}
class District extends State
{
	
}
public class StaticBlockAbstract {

	public static void main(String[] args) {
		District o=new District();
		
	}

}
