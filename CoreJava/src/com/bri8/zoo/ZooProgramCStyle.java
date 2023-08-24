package com.bri8.zoo;

import java.util.Scanner;

/**
 * The program allows users to add animals to the zoo, view the number of
 * animals, feed the animals, and exit the zoo.
 */
public class ZooProgramCStyle {
	public static void main(String[] args) {
		// Variables
		int numberOfAnimals = 0;
		boolean isZooOpen = true;
		Scanner scanner = new Scanner(System.in);

		// Welcome message
		System.out.println("Welcome to My Zoo!");

		System.out.println("\n--- Main Menu ---");
		System.out.println("1. Add an Animal");
		System.out.println("2. View Number of Animals");
		System.out.println("3. Feed the Animals");
		System.out.println("4. Exit");
		System.out.println("5. Remove an Animal");
		
		
		// Main menu
		while (isZooOpen) {
			System.out.print("\n Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
				case 1:
					// Add an animal
					numberOfAnimals++;
					System.out.println("Animal added to the Zoo!");
					break;
				case 2:
					// View number of animals
					System.out.println("Number of Animals in the Zoo: " + numberOfAnimals);
					break;
				case 3:
					// Feed the animals
					if (numberOfAnimals > 0) {
						System.out.println("Feeding " + numberOfAnimals + " animals...");
						System.out.println("Animals are happily fed!");
					} else {
						System.out.println("No animals in the Zoo to feed!");
					}
					break;
				case 4:
					// Exit the program
					System.out.println("Goodbye! Thank you for visiting My Zoo!");
					isZooOpen = false;
					break;
				case 5:
					// Add an animal
					numberOfAnimals--;
					System.out.println("Animal removed from the Zoo!");
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
					break;
			}
		}

		// Close the scanner
		scanner.close();
	}
}

/**
Explanation:

1. Data Types and Variables:
   - We use `int` data type to store the number of animals in the zoo (`numberOfAnimals`).
   - `boolean` data type is used for `isZooOpen`, which controls the loop to keep the zoo open.

2. Operators:
   - We use the `+` operator to increment the `numberOfAnimals` when adding an animal.

3. Conditional Statements:
   - We use a `while` loop (`while (isZooOpen)`) to keep the zoo open until the user chooses to exit.
   - Inside the loop, we use a `switch` statement to handle different user choices.

4. For Loops:
   - We do not use a for loop in this program.

5. While Loops:
   - The main loop (`while (isZooOpen)`) is a while loop that keeps the zoo open until the user chooses to exit.

6. Do-While Loops:
   - We do not use a do-while loop in this program.

7. Switch Statement:
   - We use the switch statement to handle different user choices and execute corresponding actions.
*/