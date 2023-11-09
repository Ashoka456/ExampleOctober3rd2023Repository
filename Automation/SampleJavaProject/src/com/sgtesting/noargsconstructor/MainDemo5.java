package com.sgtesting.noargsconstructor;
class Product
{
	int PId;
	String PName;
	String PType;
	int PPrice;
	Product()
	{
		PId=1212;
		PName="Mouse";
		PType="Electronics";
		PPrice=700;
		System.out.println("PId: "+PId);
		System.out.println("PName: "+PName);
		System.out.println("PType: "+PType);
		System.out.println("PPrice: "+PPrice);
		System.out.println("*********************");
	}
}
class Order
{
	int OrdNo;
	String OrdName;
	int OrdQuantity;
	int OrdAmt;
	Order()
	{
		OrdNo=102;
		OrdName="Bag";
		OrdQuantity=2;
		OrdAmt=1600;
		System.out.println("OrdNo "+OrdNo);
		System.out.println("OrdName "+OrdName);	
		System.out.println("OrdQuantity "+OrdQuantity);
		System.out.println("OrdAmt "+OrdAmt);
		System.out.println("*******************************");
	}
}
class Item
{
	int ItmNo;
	String ItmName;
	String ItmType;
	int ItmAmt;
	Item()
	{
		ItmNo=111;
		ItmName="Redmi mobile";
		ItmType="Electronics";
		ItmAmt=15000;
		System.out.println("ItemNo "+ItmNo);
		System.out.println("ItemName "+ItmName);
		System.out.println("ItemType "+ItmType);
		System.out.println("ItemAmt "+ItmAmt);
		System.out.println("****************************");
	}
}

public class MainDemo5 {

	public static void main(String[] args) {
		Product Obj1=new Product();

		Order Obj2=new Order();

		Item Obj3=new Item();

	}

}

