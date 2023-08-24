package com.bri8.innerClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousInnerClassUsingComparator {

	public static void main(String[] args) {
    	List<String> stringList = new ArrayList<String>();
    	
    	stringList.add("zebra");
    	stringList.add("goat");
    	stringList.add("elephant");
    	
		OuterClass5 obj = new OuterClass5();
		List<String> sortedList = obj.sortTest(stringList);
		System.out.println(sortedList);


	}

}


class OuterClass5 {
	List sortTest(List stringList) {
    	Comparator comparator = new Comparator() {
    		@Override
    		public int compare(Object o1, Object o2) {
    			String name1 = (String)o1;
    			String name2 = (String)o2;
    			
    			return name2.compareTo(name1);
    		}
    	};
    	
    	Collections.sort(stringList, comparator);
    	return stringList;
    	
        
    }
}
