package com.collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * HashMap - Unordered 
 * LinkedHashMap - Ensure order of input elements 
 * TreeMap - Sorted by ascending/descending key <?Sorting by value?>
 * 
 */
public class Ex03 {
	public static void main(String[] args) {
		//Map<Integer, String> model = new TreeMap<>((x1, x2) -> x2 - x1);
		Map<Integer, String> model = new TreeMap<>(Comparator.reverseOrder());
		
		// Map<Integer, String> model = new LinkedHashMap<>();

		model.put(75, "Huế");
		model.put(74, "Quảng Trị");
		model.put(92, "Quảng Nam");
		model.put(43, "Đà Nẵng");

		print(model);
	}

	private static void print(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entries = model.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		System.out.println("\n====================================\n");
	}
}
