package com.bri8.bitwise;

public class BitManipulationExample {
    public static void main(String[] args) {
        int num1 = 5; // Binary: 0101
        int num2 = 3; // Binary: 0011
        // Bitwise AND
        int resultAnd = num1 & num2;
        System.out.println("Bitwise AND: " + resultAnd); // Output: 1
        // Bitwise OR
        int resultOr = num1 | num2;
        System.out.println("Bitwise OR: " + resultOr); // Output: 7
        // Bitwise XOR
        int resultXor = num1 ^ num2;
        System.out.println("Bitwise XOR: " + resultXor); // Output: 6
        // Bitwise NOT
        int resultNotNum1 = ~num1;
        System.out.println("Bitwise NOT (num1): " + resultNotNum1); // Output: -6
        // Left Shift
        int leftShiftResult = num1 << 2; // Shifting left by 2 positions
        System.out.println("Left Shift: " + leftShiftResult); // Output: 20
        // Right Shift
        int rightShiftResult = num1 >> 1; // Shifting right by 1 position
        System.out.println("Right Shift: " + rightShiftResult); // Output: 2
        
        int a = -5; //0101
        
        System.out.println(a>>>2);
        
        //00111111111111111111111111111110
    }
}