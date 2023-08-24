package com.bri8.string;

import java.io.StringReader;
import java.io.IOException;

public class StringReaderExample {
	public static void main(String[] args) {
		String data = "Hello, this is a StringReader example.";

		try (StringReader stringReader = new StringReader(data)) {
			int character;
			while ((character = stringReader.read()) != -1) {
				System.out.println((char) character);
			}
		} catch (IOException e) {			
			e.printStackTrace();
			
		}
	}
}
