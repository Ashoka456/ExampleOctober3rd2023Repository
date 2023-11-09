package com.sgtesting.oopsassignment;
class Fruits
{
	String FruitName;
	String FruitColor;
	int FruitQuantity;
	int FruiteRate;
}
class Flowers
{
	String FlwName;
	String FlwColor;
	int FlwRate;
	int FlwQuantity;
}
class Vegetables
{
	String VegName;
	String VegColor;
	int VegQuantity;
	int VegRate;
}

public class FruitsFlowersVeg {

	public static void main(String[] args) {
		Fruits Obj1=new Fruits();
		Obj1.FruitName="Avocado";
		Obj1.FruitColor="Green";
		Obj1.FruitQuantity=1;
		Obj1.FruiteRate=10;
		System.out.println("FruitName "+Obj1.FruitName);
		System.out.println("FruitColor "+Obj1.FruitColor);
		System.out.println("FruitQuantity "+Obj1.FruitQuantity);
		System.out.println("FruitRate "+Obj1.FruiteRate);
		System.out.println("**************************************");
		Flowers Obj2=new Flowers();
		Obj2.FlwName="Rose";
		Obj2.FlwColor="Red";
		Obj2.FlwQuantity=1;
		Obj2.FlwRate=15;
		System.out.println("FlwName "+Obj2.FlwName);
		System.out.println("FlwColor "+Obj2.FlwColor);
		System.out.println("FlwQuantity "+Obj2.FlwQuantity);
		System.out.println("FlwRate "+Obj2.FlwRate);
		System.out.println("********************************************");
		Vegetables Obj3=new Vegetables();
		Obj3.VegName="Tomato";
		Obj3.VegColor="Red";
		Obj3.VegQuantity=1;
		Obj3.VegRate=40;
		System.out.println("VegName "+Obj3.VegName);
		System.out.println("VegColor "+Obj3.VegColor);
		System.out.println("VegQuantity "+Obj3.VegQuantity);
		System.out.println("VegRate "+Obj3.VegRate);
		System.out.println("*************************************************");
	}

}
