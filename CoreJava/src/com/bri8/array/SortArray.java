package com.bri8.array;
/**
 * Bubble sort
 */
class SortArray {
	public static void main(String[] args) {
		int[] numbers = { 40, 20, 80, 65, 70, 90, 35, 10 }; 
		int length = numbers.length; //8
		int temp;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;  
				}
			}
		}
		System.out.println("Array elements in ascending Order:");
		for (int n : numbers)
			System.out.print(n + " ");
	}
}
