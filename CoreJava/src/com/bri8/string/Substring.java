package com.bri8.string;

public class Substring {

	public static void main(String[] args) {

		String text = "abababab";
		String substring = "ab";
		int count = 0;
		int index = text.indexOf(substring);
		while (index != -1) {
			count++;
			index = text.indexOf(substring, index + 1);
		}
		System.out.println("Count: " + count);
		// Output: Count: 4

	}

}
