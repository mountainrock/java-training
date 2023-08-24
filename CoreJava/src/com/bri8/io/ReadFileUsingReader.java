package com.bri8.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFileUsingReader {
	public static void main(String[] args) {
		try (Reader reader = new FileReader("src/com/bri8/io/input.txt")) {
			int character;
			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
