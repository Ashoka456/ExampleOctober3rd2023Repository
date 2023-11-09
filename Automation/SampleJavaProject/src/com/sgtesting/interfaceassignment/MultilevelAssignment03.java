package com.sgtesting.interfaceassignment;

interface Company
{
	void CompanyName(String name);
}
interface Employee extends Company
{
	abstract void EmployeeName(String name); 
}
interface Product extends Employee
{
	abstract void ProductName(String name); 
}
class Infosis implements Company,Employee,Product
{
	public void CompanyName(String name)
	{
		System.out.println("Company :"+name);
	}
	public void EmployeeName(String name)
	{
		System.out.println("Employee :"+name);
	}
	 public void ProductName(String name)
	{
		System.out.println("Product :"+name);
	}
	void location(String location)
	{
		System.out.println("location :"+location);
	}
}
public class MultilevelAssignment03 {
	public static void main(String[] args) {
		Infosis o=new Infosis();
		o.CompanyName("s g tsting");
		o.EmployeeName("Ashok");
		o.ProductName("Laptop");
		o.location("Bangalor");
		

	}

}
