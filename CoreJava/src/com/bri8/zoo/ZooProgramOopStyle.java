package com.bri8.zoo;

import java.util.InputMismatchException;
import java.util.Scanner;

class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class Zoo {
	private int numberOfAnimals;
	private boolean isZooOpen;
	private Scanner scanner;

	public Zoo() {
		numberOfAnimals = 0;
		isZooOpen = true;
		
	}

	public void welcomeMessage() {
		System.out.println("Welcome to My Zoo!");
	}

	public void displayMenu() {
		System.out.println("\n--- Main Menu ---");
		System.out.println("1. Add an Animal");
		System.out.println("2. View Number of Animals");
		System.out.println("3. Feed the Animals");
		System.out.println("4. Exit");
	}

	public int getUserChoice() {
		System.out.println("Enter your choice: ");
		int choice =-1;
		try {
			scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			
		}catch (InputMismatchException e) {
			System.out.println("Please enter numbers only");
		}
		return choice;
	}

	public void addAnimal(String name) {
		numberOfAnimals++;
		System.out.println(name + " added to the Zoo!");
	}

	public void viewNumberOfAnimals() {
		System.out.println("Number of Animals in the Zoo: " + numberOfAnimals);
	}

	public void feedAnimals() {
		if (numberOfAnimals > 0) {
			System.out.println("Feeding " + numberOfAnimals + " animals...");
			System.out.println("Animals are happily fed!");
		} else {
			System.out.println("No animals in the Zoo to feed!");
		}
	}

	public void closeZoo() {
		System.out.println("Goodbye! Thank you for visiting My Zoo!");
		isZooOpen = false;
	}

	public boolean isZooOpen() {
		return isZooOpen;
	}

	public void closeScanner() {
		scanner.close();
	}
}

public class ZooProgramOopStyle {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.welcomeMessage();

		while (zoo.isZooOpen()) {
			zoo.displayMenu();
			int choice =-1;

			choice = zoo.getUserChoice();


			switch (choice) {
			case -1:
				System.out.print("Enter the valid choice again ");
			
				break;
			case 1:
				System.out.print("Enter the animal name: ");
				String animalName = new Scanner(System.in).nextLine();
				zoo.addAnimal(animalName);
				break;
			case 2:
				zoo.viewNumberOfAnimals();
				break;
			case 3:
				zoo.feedAnimals();
				break;
			case 4:
				zoo.closeZoo();
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		}

		zoo.closeScanner();
	}
}