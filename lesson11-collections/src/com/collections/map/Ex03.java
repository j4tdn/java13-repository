package com.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map iterator
 * HashMap: do not maintain order of input elements
 * LinkedHashMap: ensure order of input elements
 * TreeMap: default: sorted by key ascending
 *        :                        descending ? >> reverseOrder
 *        : sorting by value ? >> manually
 */

public class Ex03 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<Integer, String>();
		model.put(92, "Quang Nam");
		model.put(43, "Da Nang");
		model.put(75, "Thua Thien Hue");
		model.putIfAbsent(74, "Quang Tri");
		
		System.out.println("size: " + model.size());
		
		print(model);
	}
	
	private static void print(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entries = model.entrySet();
		for(Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + "..." + entry.getValue() );
		}

	}
}
