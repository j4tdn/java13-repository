package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	}
}
