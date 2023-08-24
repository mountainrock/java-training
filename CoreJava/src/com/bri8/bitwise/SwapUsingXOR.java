package com.bri8.bitwise;

/**
 * In this example, the numbers `a` and `b` are swapped using the XOR operation.
The key idea behind using XOR is that it allows you to toggle specific bits without affecting other bits. 
This swapping technique works because XORing a value twice with the same number results in the original value.
 */
public class SwapUsingXOR {
	public static void main(String[] args) {
		int a = 100005;
		int b = 2423427;
		System.out.println("Before swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		// Swapping using XOR
		a = a ^ b; // 0 ^1 = 1
		b = a ^ b; // 1^1 = 0
		a = a ^ b; // 1^0 =1
		System.out.println("After swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}