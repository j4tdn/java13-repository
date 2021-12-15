package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Basic operations SOT: construct, add, get, set, iterate, for each, size,
 * remove, contains, internal build
 */
public class Ex03 {
	public static void main(String[] args) {
		List<String> statues = new ArrayList<>();
		
		statues.add("ORDER");
		statues.add("PACKAGE");
		statues.add("DELIVERY");
		statues.add("RECEIVED");
		
		statues.set(3, "BOOM");
		
		
		System.out.println("size: " + statues.size());
		System.out.println("status[1]: " + statues.get(1));
		
		for(String status:statues) {
			System.out.println(status);
		}
		
		System.out.println("\n\\\\\\\\\\====================\\\\\\\\\n");
		
		Iterator<String> iterator = statues.iterator();
		while(iterator.hasNext()) {
			String status = iterator.next();
			System.out.println(status);
		}
	}
}
