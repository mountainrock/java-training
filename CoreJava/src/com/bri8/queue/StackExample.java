package com.bri8.queue;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		// Stack example
		Stack<String> stack = new Stack<>(); // LIFO
		stack.push("First");
		stack.push("Second");
		
		String poppedObject = stack.pop();
		System.out.println("Stack: " + poppedObject);
		
		System.out.println("Stack peek(): " + stack.peek());
		System.out.println("Stack peek() again: " + stack.peek());

	}

}
