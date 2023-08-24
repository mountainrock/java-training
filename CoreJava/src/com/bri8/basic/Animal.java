package com.bri8.basic;

public abstract class Animal {
	
	static String PROGRAM_NAME="CLASSIFICATION";
	int age;
	int color;
	boolean isAlive;
	String type;
	String move;
	
	abstract String getMove();
	
}

class Duck extends Animal{
	String getMove() {
		return "Fly";
	}
}

class Tiger extends Animal{
	String getMove() {
		return "Walk";
	}
}

class Elephant extends Animal{

	@Override
	String getMove() {
		
		return "Walk";
	}
	
}