package com.bri8.exception;

public class TryCatchBasic {

	public static void main(String[] args) {
		test1();
	}
	
	static void test1() {
		test2();
	}
	
	static void test2() {
		
		try {
				System.out.println(10/0); // exception here
		}catch (Exception e) {
			StackTraceElement[] st= e.getStackTrace();
			System.out.println("Error occurred : "+ e.getMessage() +" " + e.getStackTrace()[0].getLineNumber());
			//e.printStackTrace();
			
			return;
		}finally {
			System.out.println("i am finally");
		}
		
		System.out.println("hi");
	}
}
