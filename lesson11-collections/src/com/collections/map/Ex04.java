package com.collections.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * <?Sorting by value?> >> Manually
 * 
 */
public class Ex04 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();

		model.put(75, "Huế");
		model.put(74, "Quảng Trị");
		model.put(92, "Quảng Nam");
		model.put(43, "Đà Nẵng");
		
		Map<Integer, String> sortedMap = sort(model);

		print(sortedMap);
	}

	private static Map<Integer, String> sort(Map<Integer, String> model) {
		// Get all entries in map, return Set<Entry>
		Set<Entry<Integer, String>> set = model.entrySet();
		// Convert Set<Entry> to List<Entry>: support sorting
		List<Entry<Integer, String>> sortedList = new ArrayList<>(set);
		// Sort List<Entry> by Entry<Key, Value>
		// Comparator.comparing(Entry::getValue, Comparator.reverseOrder())
		sortedList.sort(Entry.comparingByValue(Comparator.reverseOrder()));

		// LinkedHashMap to maintain the order of sortedList added to sortedMap
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for (Entry<Integer, String> e : sortedList) {
			sortedMap.put(e.getKey(), e.getValue());
		}
		return sortedMap;
	}

	private static void print(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entries = model.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		System.out.println("\n====================================\n");
	}
}
