package com.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * Map iterater
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		 Map<Integer, String> model = new HashMap<>();
		 
		 model.put(92, "Quảng Nam");
		 model.put(43, "Đà Nẵng");
		 model.put(75, "Huế");
		 model.put(74, "Quảng Trị");
		 
		 System.out.println("model size: " + model.size());
		 System.out.println("\n====================================\n");	 
		
		 //1. iterate via keys
		 loopByKeys(model);
		 //2. iterate via values
		 loopByValues(model);
		 //3. iterate via keys & values
		 loopByEntries(model);
		 
	}
	private static void loopByEntries(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entries = model.entrySet();
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		System.out.println("\n====================================\n");
	}
	
	private static void loopByKeys(Map<Integer, String> model) {
		Set<Integer> keys = model.keySet();
		for(Integer key: keys) {
			System.out.println(key + ", " + model.get(key));
		}
		System.out.println("\n====================================\n");
	}
	
	private static void loopByValues(Map<Integer, String> model) {
		Collection<String> values = model.values();
		for(String value: values) {
			System.out.println(value);
		}
		System.out.println("\n====================================\n");
	}
}
