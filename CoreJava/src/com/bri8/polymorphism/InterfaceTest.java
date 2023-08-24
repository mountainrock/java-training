package com.bri8.polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterfaceTest {

	public static void main(String[] args) {

		Animal a = new AnimalImpl();
		a.typeOfAnimal();
		
		Animal ab = new AnimalImpl2();
		ab.typeOfAnimal();
		
	}

}

interface FoodHabits{
	void foodType();
	
}


interface Animal{
	void typeOfAnimal();
	
}


class AnimalImpl implements Animal, FoodHabits{

	@Override
	public void typeOfAnimal() {
		System.out.println("I am a base class for animal interface");
	}
	
	@Override
	public void foodType() {
		System.out.println("Default food type");
	}
	
}


class AnimalImpl2 implements Animal, FoodHabits{

	@Override
	public void typeOfAnimal() {
		System.out.println(" this is  for animal interface");
	}
	
	@Override
	public void foodType() {
		System.out.println("food type");
	}
	
}