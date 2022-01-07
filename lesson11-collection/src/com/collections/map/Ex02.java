package com.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map Iterator
 */
public class Ex02 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();
		model.put(43, "Đa Nẵng");
		model.put(92, "Quảng Nam");
		model.put(75, "Thừa Thiên Huế");
		model.put(74, "Quảng Trị");
		
		System.out.println("model size: " + model.size());
		
		System.out.println("\n===================\n");
		
		// 1. Iterate via keys >> values
		loopByKeys(model);
		
		// 2. Iterate via values 
		loopByValues(model);
		
		// 3. Iterate via entries(key&value)
		loopByEntries(model);
		
	}
	
	private static void loopByEntries(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entries = model.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + "..." + entry.getValue());
		}
	}

	private static void loopByValues(Map<Integer, String> model) {
		Collection<String> values = model.values();
		for (String value: values) {
			System.out.println(value);
		}
	}
	
	private static void loopByKeys(Map<Integer, String> model) {
		// Map<K, V>: key is unique
		// Set<E>: non-overlap, each element is unique
		Set<Integer> keys = model.keySet();
		for (Integer key: keys) {
			System.out.println(key + ", " + model.get(key));
		}
	}
}
