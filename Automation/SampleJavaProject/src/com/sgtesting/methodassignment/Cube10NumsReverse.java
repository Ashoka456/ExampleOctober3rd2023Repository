package com.sgtesting.methodassignment;
class CubeDemo
{
	void CubeDemo1()
	{
		int cube = 0;
		for(int i = 10;i >= 1;i--)
		{
			cube  = i * i * i;
			System.out.println(cube);
		}
	}
}
public class Cube10NumsReverse {

	public static void main(String[] args) {
		// Cube first 10 Numbers in Reverse order.
		CubeDemo	O=new CubeDemo();
		O.CubeDemo1();
	}
}