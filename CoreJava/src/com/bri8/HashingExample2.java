package com.bri8;

import java.util.ArrayList;

public class HashingExample2 {
	public static void main(String[] args) {
		ArrayList personList = new ArrayList();

		Person p1= new Person("Abbas",25);
		Person p2= new Person("Parvesh",25);
		
		personList.add(p1);
		personList.add(p2);
		
		Person p3 = new Person("Abbas",25);
		if(personList.contains(p3) == true) {
			System.out.println("Found "+ p3);
		}
		
		System.out.println(personList);
		
		
	}
}


class Person {
    private String name;
    private int age;
    
    Person(String name, int age){
    	this.name = name;
    	this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            return other.name == null;
        } else {
            return name.equals(other.name);
        }
    }
    
    @Override
    public String toString() {
    	return "name : "+ name;
    }
    
    
}

