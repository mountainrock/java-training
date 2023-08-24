package com.bri8.recursion;

public class RecursionExample {
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1; // Base case: factorial of 0 and 1 is 1
		} else {
			return n * factorial(n-1); // Recursive call
		}
	}

	public static void main(String[] args) {
		int num = 5;
		int result = factorial(num);
		System.out.println("Factorial of " + num + " is " + result);
	}
}
