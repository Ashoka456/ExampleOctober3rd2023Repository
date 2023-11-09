package com.sgtesting.oopsassignment;
class Product
{
	int PId;
	String PName;
	String PType;
	int PPrice;
}
class Order
{
	int OrdNo;
	String OrdName;
	int OrdQuantity;
	int OrdAmt;
}
class Item
{
	int ItmNo;
	String ItmName;
	String ItmType;
	int ItmAmt;
}

public class ProductOrderItems {

	public static void main(String[] args) {
		Product Obj1=new Product();
		Obj1.PId=1212;
		Obj1.PName="Mouse";
		Obj1.PType="Electronics";
		Obj1.PPrice=700;
		System.out.println("PId: "+Obj1.PId);
		System.out.println("PName: "+Obj1.PName);
		System.out.println("PType: "+Obj1.PType);
		System.out.println("PPrice: "+Obj1.PPrice);
		System.out.println("*********************");
		Order Obj2=new Order();
		Obj2.OrdNo=102;
		Obj2.OrdName="Bag";
		Obj2.OrdQuantity=2;
		Obj2.OrdAmt=1600;
		System.out.println("OrdNo "+Obj2.OrdNo);
		System.out.println("OrdName "+Obj2.OrdName);	
		System.out.println("OrdQuantity "+Obj2.OrdQuantity);
		System.out.println("OrdAmt "+Obj2.OrdAmt);
		System.out.println("*******************************");
		Item Obj3=new Item();
		Obj3.ItmNo=111;
		Obj3.ItmName="Redmi mobile";
		Obj3.ItmType="Electronics";
		Obj3.ItmAmt=15000;
		System.out.println("ItemNo "+Obj3.ItmNo);
		System.out.println("ItemName "+Obj3.ItmName);
		System.out.println("ItemType "+Obj3.ItmType);
		System.out.println("ItemAmt "+Obj3.ItmAmt);
		System.out.println("****************************");
	}

}
