package com.collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * Map Iterator
 * HashMap: do not maintain order of input elements
 * LinkedHashMap: ensure order of input elements
 * TreeMap: default sorted by key ascending
 * 		  : 					  descending ? >> reverseOrder
 * 		  : 		sorting by value ? >> manually 
 */
public class Ex03 {
	public static void main(String[] args) {
		Map<Integer, String> model = new TreeMap<>(Comparator.reverseOrder());
		model.put(75, "Thừa Thiên Huế");
		model.put(74, "Quảng Trị");
		model.put(92, "Quảng Nam");
		model.put(43, "Đa Nẵng");
		
		print(model);
	}
	
	private static void print(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entries = model.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + "..." + entry.getValue());
		}
	}
}
