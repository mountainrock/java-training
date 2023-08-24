package com.bri8.collections;
import java.util.*;

public class CollectionsUtilityExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        // Sorting the list using Collections.sort()
        Collections.sort(numbers);

        System.out.println("Sorted numbers: " + numbers);

        // Searching for an element using Collections.binarySearch()
        int searchNumber = 8;
        int index = Collections.binarySearch(numbers, searchNumber);

        if (index >= 0) {
            System.out.println(searchNumber + " found at index " + index);
        } else {
            System.out.println(searchNumber + " not found");
        }
    }
}
