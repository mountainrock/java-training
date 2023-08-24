package com.bri8.io;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileInputStream{
	public static void main(String[] args) {
		  try (FileInputStream fis = new FileInputStream("src/com/bri8/io/input.txt")) {
		      int data;
		      while ((data = fis.read()) != -1) {
		    	  char c = (char)data;
		          System.out.print( c);
		      }
		  } catch (IOException e) {
		      e.printStackTrace();
		  }
	}
}

