package com.sgtesting.assignmentarray;

public class DoubleArrayDoWhileLoop {

	public static void main(String[] args) {
		// Read elements from double array reverse order using do while loop
      double a[]= {10.5,11.5,10.6,12.5,13.5};
      int i=a.length-1;
      do
      {
    	  System.out.println(a[i]);
    	  i--;
      }while(i>=0);
	}

}
