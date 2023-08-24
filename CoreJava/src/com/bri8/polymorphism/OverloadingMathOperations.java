package com.bri8.polymorphism;

/**
 * Over loading - Static polymorphism
 */
public class OverloadingMathOperations {

// Method to add two integers
	public int add(int a, int b) {
		return a + b;
	}
 
// Method to add three integers (method with the same name but different parameters)
	public int add(int a, int b, int c) {
		return a + b + c;
	}

// Method to add two double values (method with the same name but different parameter types)
	public double add(double a, double b) {
		return a + b;
	}

// Method to concatenate two strings (method with the same name but different parameter types)
	public String add(String str1, String str2) {
		return str1 + str2;
	}

// Method to add an array of integers (method with the same name but different parameter types)
	public int add(int[] numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		OverloadingMathOperations m = new OverloadingMathOperations();
		m.add("hello","world");
	}

}