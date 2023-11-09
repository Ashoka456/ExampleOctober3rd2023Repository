package com.sgtesting.noargsconstructor;
class Desktop
{
	String DesktopName;
	String DesktopGen;
	int DesktopQty;
	int DesktopPrice;
	Desktop()
	{
		DesktopName="Lenovo ThinkCenter 19";
		DesktopGen="i5 4thGen";
		DesktopQty=1;
		DesktopPrice=16499;
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
		Laptop()
		{
			LaptopName="HP Victus";
			LaptopGen="i5 12th Gen";
			LaptopQty=1;
			LaptopPrice=68990;
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
			Mobile()
			{
				MblName="Apple iPhone13";
				MblColor="Blue";
				MblQty=1;
				MblPrice=49999;
				System.out.println("MblName "+MblName);
				System.out.println("MblColor "+MblColor);
				System.out.println("MblQty "+MblQty);
				System.out.println("MblPrice "+MblPrice);
				System.out.println("*************************************************");
			}
		}

		public class MainDemo3 {

			public static void main(String[] args) {
				Desktop Obj1=new Desktop();

				Laptop Obj2=new Laptop();

				Mobile Obj3=new Mobile();


			}


		}


