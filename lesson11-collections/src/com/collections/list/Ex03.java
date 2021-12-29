package com.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Basic operations SOT : construct , add, get, set, iterate , for each, size
 * remove contains internal build
 */
public class Ex03 {
	public static void main(String[] args) {
		//empty arraylist >> Object [] elementData = {} as default
		List<String> statuses = new ArrayList<>();
		
		//add new element, return 1 new array from (elementData + newElement)
		statuses.add("ORDER");
		statuses.add("PACKAGE");
		statuses.add("DELIVELY");
		statuses.add("RECEIVED");
		
		statuses.set(3, "BOOM");

		System.out.println("size: " + statuses.size());
		System.out.println("statuses [1]: " + statuses.get(1));

		for (String status : statuses ) {
			System.out.println(status);
		}
		System.out.println("======================");
		
		//before 1.4 : for index, iterate(value)
		//synchronous iteration
		
		//==== contains, remove ====
		System.out.println("==== contains, remove ====");
		String word = "BOOM";
		//for ( String status : statuses) {
		//if(word.equals(status)) {
		//System.out.println("statues contains " + word);
		//}
		//}
		
		System.out.println("is existed ? " + statuses.contains(word));
		//statuses.remove(1);
		//statuses.remove("OEDER");
		//statuses.remove("ORDER");
		//for (String status : statuses ) {
		//	System.out.println(status);
		//}
		System.out.println("================================");
	
		statuses.removeIf(status -> status.startsWith("P"));
		for (String status : statuses ) {
			System.out.println(status);
		}
	}
}
