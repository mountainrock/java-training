package com.bri8.loop;

public class BreakExample {

	
	public static void main(String[] args) {
		
		   String tab = "\t";
		   for (int i = 1; i <= 3; i++) {
		       for (int j = 1; j <= 3; j++) {
		    	   if(j%2!=0) 
   		    	      continue;
		           System.out.println(tab + "i: " + i + ", j: " + j);
		           
		           
		       }
		       tab = tab+"\t";
		       break;
		   }
		   
	}
}
