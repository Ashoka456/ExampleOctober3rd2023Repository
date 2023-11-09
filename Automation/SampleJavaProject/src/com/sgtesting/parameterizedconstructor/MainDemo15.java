package com.sgtesting.parameterizedconstructor;
class Product
{
	int PId;
	String PName;
	String PType;
	int PPrice;
	Product(int pid,String pn,String ptyp, int pp)
	{
		PId=pid;
		PName=pn;
		PType=ptyp;
		PPrice=pp;
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
	Order(int ordn,String ordname,int ordqty,int odramt)
	{
		OrdNo=ordn;
		OrdName=ordname;
		OrdQuantity=ordqty;
		OrdAmt=odramt;
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
	Item(int ino,String iname,String itype,int iamt)
	{
		ItmNo=ino;
		ItmName=iname;
		ItmType=itype;
		ItmAmt=iamt;
		System.out.println("ItemNo "+ItmNo);
		System.out.println("ItemName "+ItmName);
		System.out.println("ItemType "+ItmType);
		System.out.println("ItemAmt "+ItmAmt);
		System.out.println("****************************");
	}
}
public class MainDemo15 {

	public static void main(String[] args) {
		Product Obj1=new Product(1212,"Mouse","Electronics",700);

		Order Obj2=new Order(102,"Bag",2,1600);

		Item Obj3=new Item(111,"Redmi mobile","Electronics",15000);
	}
}


