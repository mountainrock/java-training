package com.bri8.array;

public class ReverseString {

	public static void main(String[] args) {
		String text = "hello";
		StringBuilder reversedText = new StringBuilder();
		for (int i = text.length() - 1; i >= 0; i--) {
		    reversedText.append(text.charAt(i));
		}
		System.out.println("Reversed: " + reversedText); 
		// Output: Reversed: olleh



	}

}
