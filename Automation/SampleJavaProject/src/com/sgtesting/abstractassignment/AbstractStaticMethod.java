package com.sgtesting.abstractassignment;
abstract class CollegeB
{
	static void CollegeName(String name)
	{
		System.out.println(name);
	}
	static void CollegeLocation(String location)
	{
		System.out.println(location);
	}
}

public class AbstractStaticMethod {

	public static void main(String[] args) {
		CollegeB.CollegeName("KVG");
		CollegeB.CollegeLocation("Sullia");
		 

	}

}
