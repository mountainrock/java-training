package com.bri8.collections;
import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Creating an Iterator
        System.out.println("Fruits in the ArrayList:");
        for (Iterator<String> iterator = fruits.iterator(); iterator.hasNext();) {
			   String fruit = iterator.next();
            System.out.println(fruit);
			
		}

    }
}
