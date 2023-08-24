package com.bri8.zoo.collection;
public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimal("Lion", "Mammal", 5);
        zoo.addAnimal("Elephant", "Mammal", 10);
        zoo.addAnimal("Giraffe", "Mammal", 7);
        zoo.addAnimal("Tiger", "Mammal", 4);
        zoo.addAnimal("Penguin", "Bird", 2);

        zoo.displayAllAnimals();
        System.out.println();

        zoo.displayUniqueSpecies();
        System.out.println();

        zoo.searchAnimalByName("Elephant");
        zoo.searchAnimalByName("Crocodile");
    }
}