package com.bri8.exception;

public class ThrowsBasic {

	public static void main(String[] args) {
		
		
		try {
			test1();
		}catch (Exception e) {
			System.out.println("Exception happenned aaah");
		}
	}
	
	static void test1() throws Exception{
		
			test2();
		
	}
	
	static void test2() throws Exception {
		
		System.out.println(10/0); // exception here
		System.out.println("hi");
	}
}
