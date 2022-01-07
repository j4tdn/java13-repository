package com.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Basic operations SOT: construct, add, get, set, iterate, for each, size,
 * remove, contains internal build
 */
public class Ex03 {
	public static void main(String[] args) {
		List<String> status = new ArrayList<String>();
		
		status.add("Order");
		status.add("Package");
		status.add("delivery");
		status.add("received");
		
		status.set(3, "Boom");
		
		System.out.println("size: " + status.size());
		
		for(String statu : status) {
			System.out.println(statu);
		}
		
		// ========= contains, remove ========
		String word = "BOOM";
		String key = "BOOM123";
		
		System.out.println("=====================");
		System.out.println("Testing: " + word.contains(key));
		
	}
}
