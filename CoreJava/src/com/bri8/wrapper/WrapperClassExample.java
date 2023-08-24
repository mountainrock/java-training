package com.bri8.wrapper;

public class WrapperClassExample {
	public static void main(String[] args) {
		// Integer wrapper class example
		Integer num1 = 10;
		Integer num2 = Integer.valueOf("20");
		int sum = num1 + num2.intValue();
		
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
		
		// Character wrapper class example
		char ch = 'A';
		Character charObj = Character.valueOf(ch);
		System.out.println("Character object: " + charObj);
		
		// Boolean wrapper class example
		Boolean bool = Boolean.valueOf("true");
		boolean boolValue = bool.booleanValue();
		System.out.println("Boolean value: " + boolValue);
	}
}