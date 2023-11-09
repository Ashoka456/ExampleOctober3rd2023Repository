package com.sgtesting.abstractassignment;
abstract class Hotel{
	void HotelName(String name)
	{
		System.out.println("Hotel Name:"+name);
	}
	void HotelLocation(String location)
	{
		System.out.println("Hotel Location:"+location);
	}
}
class Chef extends Hotel
{

	void Chefspecial(String name)
	{
		System.out.println("Chefspecial Name:"+name);
	}
}

public class AbstractClassInstanceMethod {

	public static void main(String[] args) {
		Chef ob=new  Chef();
		ob.HotelName("Karavali");//Instance method
		ob.HotelLocation("Mangalore");//Instance method
		ob.Chefspecial("CB");//subclass method


	}

}
