package com.bri8;

import java.util.HashMap;

public class HashingExample {
	public static void main(String[] args) {
		// Create a HashMap to store key-value pairs
		HashMap<String, Integer> hashMap = new HashMap<>();

		// Adding key-value pairs to the HashMap
		hashMap.put("apple", 1);
		hashMap.put("carrot", 2);
		hashMap.put("orange", 3);

		// Accessing values using keys
		int value = hashMap.get("carrot");
		System.out.println("Value for carrot: " + value);

		// Checking if a key exists
		boolean containsKey = hashMap.containsKey("grape");
		System.out.println("Contains 'grape'? " + containsKey);
	}
}

