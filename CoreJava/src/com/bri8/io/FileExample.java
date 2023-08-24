package com.bri8.io;

import java.io.File;

public class FileExample {

	public static void main(String[] args) {
		File file = new File("src/com/bri8/io/input.txt");
		
		if (file.exists() && file.isFile()) {
			System.out.println("File exists.");
		} else {
			System.out.println("File does not exist.");
		}

	}

}
