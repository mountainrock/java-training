package com.bri8.string;

public class StringDemo {

	public static void main(String[] args) {
		String languages[]= {"Java", "Python","Cobol","PHP","Angular","React","C","Javascript"};
		
		StringBuilder newLanguageOfYear2023= new StringBuilder();
		for(String language : languages) {
			newLanguageOfYear2023.append(language.charAt(0)); //newLanguageOfYear2023 = newLanguageOfYear2023 + language.charAt(0)
		}
		
		 
		System.out.println(newLanguageOfYear2023);
		
		
		

	}

}
