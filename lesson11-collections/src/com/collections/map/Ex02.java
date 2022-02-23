package com.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/**
 * Map Iterator.
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();
		model.put(92, "Quãng Nam");
		model.put(43, "Đà Nẵng");
		model.put(75, "Thừa Thiên Huế");
		model.put(74, "Quảng Trị");
		
		System.out.println("size: " +  model.size());	
		
		System.out.println("\n=====================\n");
		
		//1 Iterator via keys
		loopBykeys(model);
		
		//2 Iterator via values
		System.out.println("\n=====================\n");
		loopByValue(model);
		//3 Iterator via entries(key&value)
		System.out.println("\n=====================\n");
		loopByEntries(model);
		
		}
	private static void loopByEntries(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entries = model.entrySet();
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry.getKey() + "..." + entry.getValue());
		}
	}
	
	private static void loopByValue(Map<Integer, String> model) {
		Collection<String> values = model.values();
		for(String value : values) {
			System.out.println(value);
		}
	}
	
	
	private static void loopBykeys(Map<Integer, String> model) {
		//Map < K, V> : key is unique
		//Set<E> : non-overlap, each element is unique
		Set<Integer> keys = model.keySet();
		for(Integer key : keys) {
			System.out.println(key + " ," + model.get(key));
		}
		
	}

}
