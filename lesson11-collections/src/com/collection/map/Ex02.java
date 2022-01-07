package com.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*
 * Map Iterator
 */
public class Ex02 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();

		model.put(92, "Quang Nam");
		model.put(43, "Da Nang");
		model.put(75, "Hue");
		model.put(74, "Quang Tri");
		
		System.out.println("size: " + model.size());
		
		System.out.println("===============");
		
		//1. Iterator via keys>>>values
		loopByKeys(model);
		//2. Iterator via values
		System.out.println("===============");
		loopByValues(model);
		//3. Iterator via entries(key&value
		System.out.println("===============");
		loopByEntry(model);
		
		
	}
	private static void loopByEntry(Map<Integer, String> model){
		Set<Entry<Integer,String>> entries = model.entrySet();
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry);
		}
	}
	
	private static void loopByValues(Map<Integer, String> model){
		Collection<String> values = model.values();
		for(String value: values) {
			System.out.println(value);
		}
	}
	
	private static void loopByKeys(Map<Integer, String> model){
		// Map<K,V>: K is unique
		//Set<E>: non-overlap, each element is unique
		 Set<Integer> keys = model.keySet();
		 for(Integer key: keys) {
			 System.out.println(key + ", " + model.get(key));
		 }
	}
}
