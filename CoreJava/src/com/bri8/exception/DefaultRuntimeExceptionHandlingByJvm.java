package com.bri8.exception;

public class DefaultRuntimeExceptionHandlingByJvm {

	public static void main(String[] args) {
		test1();
	}
	
	static void test1() {
		test2();
	}
	
	static void test2() {
		System.out.println(10/0); // exception here
		
		System.out.println("hi");
	}
}
