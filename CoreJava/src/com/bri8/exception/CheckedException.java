package com.bri8.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Compile time exceptions are checked exceptions
 */
public class CheckedException {

	public static void main(String[] args) {
		File file = new File("test.txt");
		 try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("test");
		}
	}
}
