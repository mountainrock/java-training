package com.bri8.operators;
/**
 * Operators are symbols that perform operations on variables and values. 
 * Java supports various types of operators, including arithmetic, relational, logical, and assignment operators.
 */
public class Operators {
	
	
	public static void main(String[] args) {
		int a = 10;
		int b = 5;

		// Arithmetic Operators
		int sum = a + b; // Addition
		int difference = a - b; // Subtraction
		int product = a * b; // Multiplication
		int quotient = a / b; // Division
		int remainder = a % b; // Modulus (remainder of division)

		// Relational Operators
		boolean isEqual = (a == b); // Equality check
		boolean isNotEqual = (a != b); // Not equal check
		boolean isGreater = (a > b); // Greater than check
		boolean isLess = (a < b); // Less than check

		// Logical Operators
		boolean logicalAnd = (a > 20 && b > 0); // Logical AND
		boolean logicalOr = (a > 30 || b > 0); // Logical OR
		boolean logicalNot = !(a > 0); // Logical NOT

		// Assignment Operators
		a = 10;
		a += b; // Equivalent to a = a + b;
		a -= b; // Equivalent to a = a - b;
		a *= b; // Equivalent to a = a * b;
		a /= b; // Equivalent to a = a / b;
		a %= b; // Equivalent to a = a % b;

		
		//increment and decrement operators

		a++;
		b--;
		System.out.println("a = "+a +", b =" + b);
		System.out.printf("a=%s, b= %s",a,b);
	}
}
