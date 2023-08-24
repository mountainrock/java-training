package com.bri8.array;

/*
 * Finding the Maximum and Minimum Values in an Array
 */
public class MinMaxArray {

	public static void main(String[] args) {
		int[] numbers = { 10, 5, 25, 3, 15 };// Declaring and initializing the numbers array 
		int max = numbers[0]; //10
		int min = numbers[0]; //10
		
		for(int i=0;i< numbers.length;i++) {
			int num = numbers[i];
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		System.out.println("Max: " + max + ", Min: " + min);
		// Output: Max: 25, Min: 3

	}

}
