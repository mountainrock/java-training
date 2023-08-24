package com.bri8.string;

public class StringAppend {

	public static void main(String[] args) {
		String[] data = { "Rama", "Krishna", "30", "Engineer" };
		StringBuilder csvBuilder = new StringBuilder();
		for (int i = 0; i < data.length; i++) {
			csvBuilder.append(data[i]);
			if (i < data.length - 1) {
				csvBuilder.append(",");
			}
		}
		System.out.println("CSV: " + csvBuilder);
		// Output: CSV: Rama,Krishna,30,Engineer

	}

}
