package com.bri8.collections;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<Object, String> myMap = new HashMap();
		myMap.put( "C","Functional programming");
		myMap.put( "Javascript","Functional programming");
		myMap.put( "PHP","Functional programming");
		
		myMap.put( 1,"OOP programming" );
		myMap.put( 1,"OOP programming" );
		
		myMap.put( "Java","OOP programming" );
		myMap.put( "Python","OOP programming" );
		myMap.put( 2,"OOP programming" );
		myMap.put( "C#","OOP programming" );
		myMap.put( "React Js","OOP programming" );
		myMap.put(null, "OOP programming");

		System.out.println("Map: " + myMap);
		
		System.out.println("OOP programming languages are : ");
		for (Map.Entry<Object, String> entry : myMap.entrySet()) {
			Object key = entry.getKey();
			String val = entry.getValue();
			if("OOP programming".equals(val)) {
				System.out.println(key +" : "+ val);
			}
		}
		
		
	}
}