package com.bri8.array;

/*
 Sum of Array Elements
 */
public class BasicArray {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		   int sum = 0;
		   for (int num : numbers) {
		       sum += num;
		   }
		   System.out.println("Sum: " + sum); 
		   // Output: Sum: 15
	

	}

}
