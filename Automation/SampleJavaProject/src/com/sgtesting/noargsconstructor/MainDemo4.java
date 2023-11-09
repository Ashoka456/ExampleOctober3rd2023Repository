package com.sgtesting.noargsconstructor;
class Fruits
{
	String FruitName;
	String FruitColor;
	int FruitQuantity;
	int FruiteRate;
	Fruits()
	{
		FruitName="Avocado";
		FruitColor="Green";
		FruitQuantity=1;
		FruiteRate=10;
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
	Flowers()
	{
		FlwName="Rose";
		FlwColor="Red";
		FlwQuantity=1;
		FlwRate=15;
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
	Vegetables()
	{
		VegName="Tomato";
		VegColor="Red";
		VegQuantity=1;
		VegRate=40;
		System.out.println("VegName "+VegName);
		System.out.println("VegColor "+VegColor);
		System.out.println("VegQuantity "+VegQuantity);
		System.out.println("VegRate "+VegRate);
		System.out.println("*************************************************");	
	}
}

public class MainDemo4 {

	public static void main(String[] args) {
		Fruits Obj1=new Fruits();
		
		Flowers Obj2=new Flowers();
		
		Vegetables Obj3=new Vegetables();
		
	}

}

