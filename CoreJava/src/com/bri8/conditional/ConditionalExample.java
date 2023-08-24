package com.bri8.conditional;

public class ConditionalExample {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		if (a > b) {
			System.out.println("A is greater");
		} else if (a == b) {
			System.out.println("A equal to B");
		} else {
			System.out.println("B is greater");
		}
	}
}