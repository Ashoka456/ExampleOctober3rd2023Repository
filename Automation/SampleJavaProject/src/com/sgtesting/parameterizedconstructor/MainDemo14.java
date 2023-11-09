package com.sgtesting.parameterizedconstructor;
class Fruits
{
	String FruitName;
	String FruitColor;
	int FruitQuantity;
	int FruiteRate;
	Fruits(String fname,String fclr,int fqty,int frate)
	{
		FruitName=fname;
		FruitColor=fclr;
		FruitQuantity=fqty;
		FruiteRate=frate;
		System.out.println("FruitName "+FruitName);
		System.out.println("FruitColor "+FruitColor);
		System.out.println("FruitQuantity "+FruitQuantity);
		System.out.println("FruitRate "+FruiteRate);
		System.out.println("**************************************");	
	}
}
class Flowers
{
	String FlwName;
	String FlwColor;
	int FlwRate;
	int FlwQuantity;
	Flowers(String flwname,String flwcr,int flwrate,int flwqty)
	{
		FlwName=flwname;
		FlwColor=flwcr;
		FlwQuantity=flwrate;
		FlwRate=flwqty;
		System.out.println("FlwName "+FlwName);
		System.out.println("FlwColor "+FlwColor);
		System.out.println("FlwQuantity "+FlwQuantity);
		System.out.println("FlwRate "+FlwRate);
		System.out.println("********************************************");	
	}
}
class Vegetables
{
	String VegName;
	String VegColor;
	int VegQuantity;
	int VegRate;
	Vegetables(String vname,String vcr,int vqty,int vrate)
	{
		VegName=vname;
		VegColor=vcr;
		VegQuantity=vqty;
		VegRate=vrate;
		System.out.println("VegName "+VegName);
		System.out.println("VegColor "+VegColor);
		System.out.println("VegQuantity "+VegQuantity);
		System.out.println("VegRate "+VegRate);
		System.out.println("*************************************************");	
	}
}
public class MainDemo14 {

	public static void main(String[] args) {
		Fruits Obj1=new Fruits("Avocado","Green",1,10);

		Flowers Obj2=new Flowers("Rose","Red",1,15);

		Vegetables Obj3=new Vegetables("Tomato","Red",1,40);
	}
}


