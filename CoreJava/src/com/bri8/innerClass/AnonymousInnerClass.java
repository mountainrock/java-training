package com.bri8.innerClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		OuterClass4 obj = new OuterClass4();
		obj.displayGreeting();

	}

}


class OuterClass4 {
    void displayGreeting() {
    	
    
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous inner class!");
            }
        };
        greeting.greet();
    }
}

interface Greeting {
    void greet();
}
