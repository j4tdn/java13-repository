package com.collection.map;
/**
 * Map Iterator
 * Map: sorting by value > manually
 * Normally: sort > return void
 * 				>>
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex04 {
	public static void main(String[] args) {
		Map<Integer, String> model = new TreeMap<>(Comparator.reverseOrder());
		model.put(43, "AĐà Nẵng");
		model.put(75, "BThừa Thiên Huế");
		model.put(92, "CQuảng Nam");
		model.put(74, "DQuảng Trị");
		
		System.out.println("size: "+ model.size());
		System.out.println("\n========================\n");
		Map<Integer, String> sortedMap = sort(model);
		print(sortedMap);
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> model){
		
		
		// 1. Get ll entries in map, return Set<Entry>
		//	  Set<E> does not support sorting 
		Set<Entry<Integer, String>> elements = model.entrySet();
		
		// 2. Convert Set<Entry> by Entry(key, Value)
		List<Entry<Integer, String>> sortedList = new ArrayList<>(elements);
		// 3. Sort List
		// : Anonymous class and override compareTo method
		// : Comparator.comparing(Entry::getValue)
		
		sortedList.sort(Comparator.comparing(Entry::getValue));
		
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for(Entry<Integer,String> entry:sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}
	private static void print(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entries = model.entrySet();
		for(Entry<Integer,String> entry :entries) {
			System.out.println(entry.getKey() + "..." + entry.getValue());
		}
	}
	
	
}
