package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * Basic operation of SOT: construct add, get, set, iterate
 * remove, contains internal element
 */
public class Ex03{
	public static void main(String[] args) {
		// empty arraylist >> Object[] elementData = {} as default
		List<String> statuses = new ArrayList<>(20);
				
				// internal build
				// add new element, return 1 new array from(elementData + newElement)
				// reality: first added element  elementData = new Object[DEFAULT_CAPACITY(10)]
				// size != length of elementData
		statuses.add("ORDER");
		statuses.add("PACKAGE");
		statuses.add("DELIVERY");
		statuses.add("RECEIVED");
				
		statuses.set(3, "BOOM");
				
				
		System.out.println("size: " + statuses.size());
		System.out.println("statusus[1]: " + statuses.get(1));
		for (String status: statuses) {
			System.out.println(status);
		}
		System.out.println("\n\\\\\\\\===================\\\\\\\\\\\\\\\\\n");
				
				// before 1.4: for index, iterate(value)
				// synchronous iteration
				
				// e.g
				// _
				// _ORDER
				// _PACKAGE
				// _DELIVERY
				// _
		Iterator<String> iterator = statuses.iterator();
		while(iterator.hasNext()) {
			String status = iterator.next();
			System.out.println("iterator: " + status);
		}
		
		//==========contain, remove ============
		System.out.println("==========Contain, remove ============");
		String word = "ORDER";
//		for(String status: statuses) {
//			if(word.equals(status)) {
//				System.out.println("statues contains: " + word);
//			}
//		}
//		
		System.out.println("is existed? " + statuses.contains(word));
		
//		statuses.remove(0);
//		statuses.remove(word);
		statuses.removeIf(status -> status.startsWith("B"));
		for (String status: statuses) {
			System.out.println(status);
		}
	}
}
