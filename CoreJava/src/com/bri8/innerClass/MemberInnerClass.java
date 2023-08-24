package com.bri8.innerClass;

/**
 *  Defined within the scope of an outer class, just like any other member (field or method).
   - Can access all members (including private) of the outer class.
 */
public class MemberInnerClass {
	public static void main(String[] args) {

		OuterClass outer= new OuterClass();
		outer.testInnerClass();
		

	}
}

class OuterClass {
	private int outerField=6;

	class InnerClass {
		void display() {
			System.out.println("Outer field value: " + outerField);
		}
	}
	
	void testInnerClass() {
		new InnerClass().display();
	}
}