package com.bri8.loop;

 public class ForLoop {

	public static void main(String[] args) {
		basicFor();
		enhancedFor();

	}

	protected static void basicFor() {
		for (int i = 1; i <= 5; i++) {
		    System.out.println("This is loop iteration #" + i);
		}
	}
	
	private static void enhancedFor() {
		int[] numbers = {1, 2, 3, 4, 5};
		
		for (int i = 0; i <= numbers.length; i++) {
		    System.out.println(numbers[i]);
		}
		
		for (int i : numbers) {
		    System.out.print(i + " ");
		}

	}

}
