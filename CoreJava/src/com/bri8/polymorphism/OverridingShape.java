package com.bri8.polymorphism;

/**
 * Overriding - Dynamic polymorphism
 */
public class OverridingShape {
	void draw() {
		System.out.println("Drawing a generic shape.");
	}
	
	public static void main(String[] args) {
		OverridingShape s = new Circle();
		OverridingShape s2 = new Square();
		OverridingShape s1 = new OverridingShape();
		
		s.draw();
		s1.draw();
		s2.draw();
		
		
	}
}

class Circle extends OverridingShape {
	@Override
	void draw() {
		System.out.println("Drawing a circle.");
	}
}

class Square extends OverridingShape {
	@Override
	void draw() {
		System.out.println("Drawing a square.");
	}
}
