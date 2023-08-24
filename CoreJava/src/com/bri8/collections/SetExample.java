package com.bri8.collections;

import java.util.*;

public class SetExample {
	public static void main(String[] args) {
		Set<Integer> mySet = new HashSet<>();
		mySet.add(10);
		mySet.add(20);
		mySet.add(30);
		mySet.add(30); //no duplicates allowed
		
		System.out.println("mySet: " + mySet);
	}
}