package com.sgtesting.interfaceassignment;
interface Country
{
	void CountryName(String name);
}
interface State extends Country
{
	abstract void StateName(String name);
}
interface District extends Country
{
	abstract void DistrictName(String name);
}
class Taluk implements Country,State,District
{
	public void CountryName(String name)
	{
		System.out.println("Country Name :"+name);
	}
	public void StateName(String name)
	{
		System.out.println("State Name :"+name);
	}
	public void DistrictName(String name)
	{
		System.out.println("District Name :"+name);
	}
	 void TalukName(String name)
	 {
		 System.out.println("Taluk Name:"+name);
	 }
	 void VillageName(String name)
	 {
		 System.out.println("Village Name :"+name);
	 }
	
}
public class HierarchialInheritanceAssign04 {

	public static void main(String[] args) {
		Taluk o=new Taluk();
		o.CountryName("India");
		o.StateName("Karnataka");
		o.DistrictName("Mangalore");
		o.TalukName("Sullia");
		o.VillageName("Sampaje");
	}

}
