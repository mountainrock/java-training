package com.bri8.collections;

import java.util.*;

public class CollectionExample {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Apple");
		myList.add("Banana");
		myList.add("Cherry");

		Set<Integer> mySet = new HashSet<>();
		mySet.add(10);
		mySet.add(20);
		mySet.add(30);

		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("One", 1);
		myMap.put("Two", 2);
		myMap.put("Three", 3);

		System.out.println("List: " + myList);
		System.out.println("Set: " + mySet);
		System.out.println("Map: " + myMap);
	}
}