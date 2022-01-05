package com.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * Map iterator
 *
 */

public class Ex02 {
	
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();
		model.put(92, "Quang Nam");
		model.put(43, "Da Nang");
		model.put(75, "Hue");
		model.put(74, "Quang Tri");
		
		System.out.println("Size: " + model.size());
		
		System.out.println("\n============================\n");
		
		// 1. Iterate via keys >> values
		loopByKeys(model);
		
		// 2. Iterate via values
		loopByValues(model);
		
		// 3 Iterate via Entry<Key, Value>
		loopByEntries(model);
	}
	
	private static void loopByEntries(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entries = model.entrySet();
		for(Entry<Integer, String> entry : entries) {
			System.out.println(entry);
		}
	}
	
	private static void loopByKeys(Map<Integer, String> model) {
		// Map<K, V>: key is unique
		// Set<E>: non-duplicate, each element is unique
		Set<Integer> keys = model.keySet();
		for(Integer key : keys) {
			System.out.println(model.get(key));
		}
		System.out.println();
	}
	
	private static void loopByValues(Map<Integer, String> model) {
		Collection<String> values = model.values();
		for(String value : values) {
			System.out.println(value);
		}
		System.out.println();
	}
}
