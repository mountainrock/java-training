package com.bri8.innerClass;

/**
    Defined within a method or scope block.
   - Can access all members (including final local variables) of the enclosing scope.
   
 */
public class LocalInnerClass {

	public static void main(String[] args) {

		new OuterClass3().outerMethod();
	}

}

class OuterClass3 {
	
	void outerMethod() {
		final int localVar = 10;
		
		class LocalInnerClass2 {
			void display() {
				System.out.println("Local variable value: " + localVar);
			}
		}
		LocalInnerClass2 inner = new LocalInnerClass2();
		inner.display();
	}
}