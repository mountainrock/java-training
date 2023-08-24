package com.bri8.collections;

import java.util.*;

public class ListExample {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();// creating object for arraylist
		myList.add("Apple"); //add the object to the list
		myList.add("Banana");
		myList.add("Cherry");

		myList.add("Cherry");
		
		
		//myList.remove("Cherry");
		
		Boolean isPresent = myList.contains("Cherry"); // checking if cherry existi
		System.out.println("Cherry present? "+ isPresent); //printing value
		
		System.out.println("List: " + myList);//print
		
		for(String str : myList) {
			System.out.println(str);
		}
	}
}