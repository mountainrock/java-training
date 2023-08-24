package com.bri8.basic;

public class Calculator {

	
	private  static String name="Basic Calculator";
	
	public static void main(String[] args) {
		System.out.println("Starting calculator : " + name);
		Calculator calculatorObject = new Calculator();
		Calculator calculatorObject1 = new Calculator();
		
		Calculator calculatorObject2 = new Calculator();
		
		int result = calculatorObject.add(5, 10);
		
		System.out.println("Result is "+ result);
	}
	
	private int add(int a , int b) {
		int sum = a+ b;
		return sum;
	}
}
