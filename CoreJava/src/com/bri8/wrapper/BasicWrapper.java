package com.bri8.wrapper;

import java.util.ArrayList;
import java.util.List;

public class BasicWrapper {

	public static void main(String[] args) {
		int a =0;
		String s = "i am a string";
	
		Integer aWrapper = new Integer(a);
		aWrapper = a;
		
		a = aWrapper;
		
		
		System.out.println(aWrapper);
		
		long l= 1l;
		Long lWrapper = l;
		
		
		boolean b = false;
		Boolean bWrapper = b;
		bWrapper.booleanValue();
		
		List numbers = new ArrayList();
		numbers.add(a);


	}

}
