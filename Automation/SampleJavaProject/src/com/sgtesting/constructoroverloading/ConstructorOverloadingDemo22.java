package com.sgtesting.constructoroverloading;
class college
{
	college(String clguniversity)
	{
		System.out.println("College UniName: "+clguniversity);
	}
	college(String clgname,String clgloc)
	{
		System.out.println("College Name: "+clgname);
		System.out.println("College Location: "+clgloc);
	}
	college(String address,int pn,int ph)
	{
		System.out.println("College Address: "+address);
		System.out.println(" Pincode:"+pn);
		System.out.println("College PhoneNo: "+ph);
	}
}
public class ConstructorOverloadingDemo22 {

	public static void main(String[] args) {
		college Obj1=new college("VTU");
		college Obj2=new college("KVG","Dakshina kannada");
		college Obj3=new college("KVG Statue Junction Sullia",574234,98561285);
	}
}


