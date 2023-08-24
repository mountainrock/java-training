package com.bri8.innerClass;

/**
   Similar to a regular class, but it is nested inside another class for better packaging and organization.
   - Can only access static members of the outer class.
 */
public class StaticInnerClass {
	public static void main(String[] args) {

		OuterClass2.InnerClass inner= new OuterClass2.InnerClass();
		inner.display();
		
	}
}

class OuterClass2 {
	private static int outerField=6;

	public static class InnerClass {
		void display() {
			System.out.println("Outer field value: " + outerField);
		}
	}
	
	void testInnerClass() {
		new InnerClass().display();
	}
}