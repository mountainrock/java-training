package com.bri8.basic;

/**
 * In Java, data types define the type of data that a variable can hold. 
 * Java has two main categories of data types: primitive data types and reference data types.
 */
public class DataTypes {
	public static void main(String[] args) {
		// Primitive Data Types
		int age = 30; // integer (whole number)
		double salary = 5000.75; // floating-point number
		char grade = 'A'; // character
		boolean isActive = true; // boolean (true or false)

		// Reference Data Type
		String name = "John"; // string
		
		System.out.printf("%s is %s years old having salary : %s for grade : %s and active : %s",name, age, salary, grade, isActive);

	}
}
