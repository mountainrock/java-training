package com.bri8.zoo.collection;
import java.util.*;

class Animal {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

	public String getName() {
		return name;
	}

	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}


    @Override
    public String toString() {
        return name + " (" + species + ", " + age + " years)";
    }
    
}