package com.bri8.basic;

public class Zoo {

	//static
	static String NAME="Mysore Zoo";
	
	static void welcome() {
		System.out.println("Welcome to zoo: "+ NAME);
	}
	
	public static void main(String[] args) {
	
		welcome();
		
		Duck d = new Duck();
		Duck d2 = new Duck();
		Tiger t1 = new Tiger();
		System.out.println("Duck "+ d.getMove());
		System.out.println("Tiger "+ t1.getMove());
		System.out.println("Duck "+ d2.getMove());
		
	}
}
