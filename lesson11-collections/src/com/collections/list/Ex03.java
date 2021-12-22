package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Basic operations SOT: construct, add, get, set, iterate,
 * for each, size, remove, contains, internal build
 *
 */
public class Ex03 {
	public static void main(String[] args) {
		List<String> statuses = new ArrayList<>();
		
		statuses.add("Order");
		statuses.add("Package");
		statuses.add("Dilivery");
		statuses.add("Received");
		
		
		statuses.set(3, "Failed");
		System.out.println("Statuses[1]: " + statuses.get(1));
		//System.out.println("size:" + statuses.size());
		for(String status: statuses) {
			System.out.println(status);
		}
		
		//before 1.4
		//synchronous iteration
		
		System.out.println("\n\n==============================\n\n");
		Iterator<String> iterator = statuses.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		System.out.println("\n\n==============================\n\n");
		//contains, remove
		System.out.println("is existed: " + statuses.contains("Order"));
		
		System.out.println("\n\n==============================\n\n");
		//remove base on index
		//statuses.remove(0);
		
		//remove base on object
		//statuses.remove("Package");
		
		//remove if
//		Predicate<String> predicate = new Predicate<String>() {
//			@Override
//			public boolean test(String str) {
//				return str.length()<6;
//			}
//		};
//		statuses.removeIf(predicate);
		statuses.removeIf(x->x.startsWith("P"));
		for(String status: statuses) {
			System.out.println(status);
		}
		
	}
}
