package com.bri8.loop;

public class ConditionalLoopExample {
	public static void main(String[] args) {
		int sum = 0;
// For loop to calculate the sum of the first 5 even numbers
		
		for ( int i =0; i <= 10; i++) {
			if (i % 2 == 0) { // Check if the number is even
				sum += i; // Add the even number to the sum
			} 
		}
// Print the result
		System.out.println("The sum of the first 5 even numbers is: " + sum);
	}
}
