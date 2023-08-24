package com.bri8.zoo.collection;

import java.util.*;

class Zoo {
    private List<Animal> animalsList;
    private Set<String> uniqueSpeciesSet;
    private Map<String, Animal> animalByNameMap;

    public Zoo() {
        animalsList = new ArrayList<>();
        uniqueSpeciesSet = new HashSet<>();
        animalByNameMap = new HashMap<>();
    }

    public void addAnimal(String name, String species, int age) {
        Animal animal = new Animal(name, species, age);
        animalsList.add(animal);
        uniqueSpeciesSet.add(species);
        animalByNameMap.put(name, animal);
    }

    public void displayAllAnimals() {
        System.out.println("All Animals in the Zoo:");
        for (Animal animal : animalsList) {
            System.out.println(animal);
        }
    }

    public void displayUniqueSpecies() {
        System.out.println("Unique Species in the Zoo:");
        for (String species : uniqueSpeciesSet) {
            System.out.println(species);
        }
    }

    public void searchAnimalByName(String name) {
        if (animalByNameMap.containsKey(name)) {
        	Animal animal = animalByNameMap.get(name);
            System.out.println("Animal Details: " + animal);
        } else {
            System.out.println("Animal not found.");
        }
    }
}