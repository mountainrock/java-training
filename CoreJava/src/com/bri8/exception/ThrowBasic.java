package com.bri8.exception;

public class ThrowBasic {

	public static void main(String[] args) {
		test1();
	}
	
	static void test1() {
		try {
				test2();
		}catch (Exception e) {
		    System.out.println("Dealing with exception in test1() method");
		}
	}
	
	static void test2() {
		
		try {
				System.out.println(10/0); // exception here
		}catch (Exception e) {
			throw e;
		}
		
		System.out.println("hi");
	}
}
