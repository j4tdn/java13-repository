package com.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();
		model.put(43, "Đà Nẵng");
		model.put(75, "Thừa Thiên Huế");
		model.put(92, "Quảng Nam");
		model.put(74, "Quảng Trị");
		
		System.out.println("size: "+ model.size());
		System.out.println("\n========================\n");
		// 1. Iterate via keys
//		loopByKey(model);
		// 2. Iterate via values
//		loopByValues(model);
		// 3. Iterate via entries (key & values)
		loopByEntries(model);
	}
	
	private static void loopByEntries(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entries = model.entrySet();
		for(Entry<Integer,String> entry :entries) {
			System.out.println(entry.getKey() + "..." + entry.getValue());
		}
	}
	
	private static void loopByValues(Map<Integer, String> model) {
		Collection<String> values =  model.values();
		for(String value:values) {
			System.out.println(value);
		}
	}
	
	private static void loopByKey(Map<Integer, String> model) {
		// Map<K,V>: key is unique
		// Set<E> : non-overlap, each element is unique
		Set<Integer> keys = model.keySet();
		for(Integer key:keys) {
			System.out.println(key + ", " + model.get(key));
		}
	}
}
