package com.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map : sorting by value >> manually
 * Normally: sort >> return void
 * 				  >> return sortedMap
 */
public class Ex04 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();
		model.put(75, "Thừa Thiên Huế");
		model.put(74, "Quảng Trị");
		model.put(92, "Quảng Nam");
		model.put(43, "Đa Nẵng");
		
		Map<Integer, String> sortedMap = sort(model);
		
		print(sortedMap);
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> model) {
		// 1. Get all entries in map, return Set<Entry>
		// Set<Entry> does not support sorting
		Set<Entry<Integer, String>> elements = model.entrySet();
		
		// 2. Convert Set<Entry> to List<Entry>: support sorting
		List<Entry<Integer, String>> sortedList = new ArrayList<>(elements);
		
		// 3. Sort List<Entry> by Entry(Key, Value)
		//	. Comparator.comparing(Entry::getValue)
		//  . Entry.comparingByValue()
		sortedList.sort(Entry.comparingByValue());
		
		// 4. Put elements from sortedList to sortedMap
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for (Entry<Integer, String> entry: sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	
	private static void print(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entries = model.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + "..." + entry.getValue());
		}
	}
}
