package com.sgtesting.oopsassignment;
class Desktop
{
	String DesktopName;
	String DesktopGen;
	int DesktopQty;
	int DesktopPrice;
}
class Laptop
{
	String LaptopName;
	String LaptopGen;
	int LaptopQty;
	int LaptopPrice;
}
class Mobile
{
	String MblName;
	String MblColor;
	int MblQty;
	int MblPrice;
}

public class DesktopLaptopmobile {

	public static void main(String[] args) {
		Desktop Obj1=new Desktop();
		Obj1.DesktopName="Lenovo ThinkCenter 19";
		Obj1.DesktopGen="i5 4thGen";
		Obj1.DesktopQty=1;
		Obj1.DesktopPrice=16499;
		System.out.println("DesktopName "+Obj1.DesktopName);
		System.out.println("DesktopGen "+Obj1.DesktopGen);
		System.out.println("DesktopQty "+Obj1.DesktopQty);
		System.out.println("DesktopPrice "+Obj1.DesktopPrice);
		System.out.println("****************************************");
		Laptop Obj2=new Laptop();
		Obj2.LaptopName="HP Victus";
		Obj2.LaptopGen="i5 12th Gen";
		Obj2.LaptopQty=1;
		Obj2.LaptopPrice=68990;
		System.out.println("LaptopName "+Obj2.LaptopName);
		System.out.println("LaptopGen "+Obj2.LaptopGen);
		System.out.println("laptopQty "+Obj2.LaptopQty);
		System.out.println("LaptopPrice "+Obj2.LaptopPrice);
		System.out.println("**********************************************");
		Mobile Obj3=new Mobile();
		Obj3.MblName="Apple iPhone13";
		Obj3.MblColor="Blue";
		Obj3.MblQty=1;
		Obj3.MblPrice=49999;
		System.out.println("MblName "+Obj3.MblName);
		System.out.println("MblColor "+Obj3.MblColor);
		System.out.println("MblQty "+Obj3.MblQty);
		System.out.println("MblPrice "+Obj3.MblPrice);
		System.out.println("*************************************************");
	}

}
