package com.bri8.array;

class TwoDArray {
	public static void main(String[] args) {
		int[][] matrix = new int[2][2];
		matrix[0][0] = 10;
		matrix[0][1] = 20;
		matrix[1][0] = 30;
		matrix[1][1] = 40;

		System.out.println("Element at index 00 = " + matrix[0][0]);
		System.out.println("Element at index 01 = " + matrix[0][1]);
		System.out.println("Element at index 10 = " + matrix[1][0]);
		System.out.println("Element at index 11 = " + matrix[1][1]);

		
		int[][] a = {  //c0
					  { 15, 20, 25 }, // row 0
					  { 20, 30, 40 }, //row 1
					  { 50, 60, 70 } //row 2
					};

		System.out.println("\nElement at index 00 = " + a[0][0]);
		System.out.println("Element at index 01 = " + a[0][1]);
		// Accessing array elements using for loop;
		System.out.println("\nAccessing array element using for loop ........");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++)
				System.out.println("Element at index " + i + "" + j + " = " + a[i][j]);
		}
	}
}
