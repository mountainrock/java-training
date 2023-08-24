package com.bri8.array;
/*
   Searching for an Element in an Array
 */
public class SearchArray {

	public static void main(String[] args) {
		   int[] numbers = {1, 2, 3, 4, 5};
		   int search = 3;
		   
		   boolean found = false;
		   for (int num : numbers) {
		       if (num == search) {
		           found = true;
		           break;
		       }
		   }
		   System.out.println("Found: " + found); 
		// Output: Found: true


	}

}
