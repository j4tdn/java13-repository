package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03 {

	public static void main(String[] args) {
		// Create Empty ArrayList >> Object[] elementData = {} as default
		List<String> statuses = new ArrayList<>();

		// Internal build
		// Add new element, return 1 new array from(elementData + new Element)
		// Reality: first added element elementData = new Object[DEFAULT_CAPACITY(10]
		// size != length of elementData
		statuses.add("ORDER");
		statuses.add("PACKAGE");
		statuses.add("DELIVERY");
		statuses.add("RECEIVED");

		statuses.set(3, "BOOMMMM");

		System.out.println("size: " + statuses.size());
		System.out.println("Statuses[1]: " + statuses.get(1));
		for (String status : statuses) {
			System.out.println(status);
		}

		System.out.println("\n=============================\n");

		// before 1.4: for index, iterate(value)
		// synchronous iteration

		// Example
		// _
		// _ORDER
		// _PACKAGE
		// _DELIVERY
		// _RECEIVED
		Iterator<String> iterator = statuses.iterator();
		while (iterator.hasNext()) {
			String status = iterator.next();
			System.out.println("Iterator: " + status);
		}

		System.out.println("\n======== contains, remove ========\n");
		String word = "BOOMMMM";
//		for (String status : statuses) {
//			if (word.equals(status)) {
//				System.out.println("Statuses contains " + word);
//			}
//		}
		System.out.println("is existed ? " + statuses.contains(word));
		
		// statuses.remove(1);
		// statuses.remove(word);
			
		statuses.removeIf(status -> status.startsWith("B"));
		
		for (String status : statuses) {
			System.out.println(status);
		}
	}
}
