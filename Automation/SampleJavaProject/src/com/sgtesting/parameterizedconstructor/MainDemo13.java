package com.sgtesting.parameterizedconstructor;
class Desktop
{
	String DesktopName;
	String DesktopGen;
	int DesktopQty;
	int DesktopPrice;
	Desktop(String dname,String dgen,int dqty,int dprice)
	{
		DesktopName=dname;
		DesktopGen=dgen;
		DesktopQty=dqty;
		DesktopPrice=dprice;
		System.out.println("DesktopName "+DesktopName);
		System.out.println("DesktopGen "+DesktopGen);
		System.out.println("DesktopQty "+DesktopQty);
		System.out.println("DesktopPrice "+DesktopPrice);
		System.out.println("****************************************");
	}
}
class Laptop
{
	String LaptopName;
	String LaptopGen;
	int LaptopQty;
	int LaptopPrice;
	Laptop(String lname,String lgen,int lqty,int lprice)
	{
		LaptopName=lname;
		LaptopGen=lgen;
		LaptopQty=lqty;
		LaptopPrice=lprice;
		System.out.println("LaptopName "+LaptopName);
		System.out.println("LaptopGen "+LaptopGen);
		System.out.println("laptopQty "+LaptopQty);
		System.out.println("LaptopPrice "+LaptopPrice);
		System.out.println("**********************************************");
	}
}
class Mobile
{
	String MblName;
	String MblColor;
	int MblQty;
	int MblPrice;
	Mobile(String mbln,String mblc,int mqty,int mblprice)
	{
		MblName=mbln;
		MblColor=mblc;
		MblQty=mqty;
		MblPrice=mblprice;
		System.out.println("MblName "+MblName);
		System.out.println("MblColor "+MblColor);
		System.out.println("MblQty "+MblQty);
		System.out.println("MblPrice "+MblPrice);
		System.out.println("*************************************************");
	}
}
public class MainDemo13 {

	public static void main(String[] args) {
		Desktop Obj1=new Desktop("Lenovo ThinkCenter 19","i5 4thGen",1,16499);

		Laptop Obj2=new Laptop("HP Victus","i5 12th Gen",1,68990);

		Mobile Obj3=new Mobile("Apple iPhone13","Blue",1,49999);
	}
}



