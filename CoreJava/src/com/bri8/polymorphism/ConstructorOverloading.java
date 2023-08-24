package com.bri8.polymorphism;

/** static polymorphism
 * 
 * 
 * Create a variable String and initialize it using constructor
 */
public class ConstructorOverloading {

	int i;
	String name;
	
	ConstructorOverloading(){
		this.i=0;
	}

	ConstructorOverloading(int j){
		this.i = j;
	}
	
	ConstructorOverloading(String str, int j){
        this.i= j;
        this.name =str;
    }
	
	
	public static void main(String[] args) {
		
		ConstructorOverloading  defaultC = new ConstructorOverloading();
		System.out.println(defaultC.i);
		ConstructorOverloading  c = new ConstructorOverloading(5);
		System.out.println(c.i);

	}

}
