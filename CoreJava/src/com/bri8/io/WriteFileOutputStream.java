package com.bri8.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileOutputStream {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("output.txt")) {
			String data = "Hello, I/O Streams!";
			fos.write(data.getBytes());
			System.out.println("Finished writing to file output.txt");
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
