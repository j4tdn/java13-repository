package com.collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
/*
 * Map Iterator
 * HashMap: do not maintain order of input elements
 * LinkedHashMap: ensure order of input elements
 * TreeMap: sorted by key ASC
 * 		  : sorted by key DSC >> reverseOrder
 * 		  : sorted by value ???
 */
public class Ex03 {
	public static void main(String[] args) {
		Map<Integer, String> model = new TreeMap<>(Comparator.reverseOrder());

		model.put(92, "Quang Nam");
		model.put(43, "Da Nang");
		model.put(75, "Hue");
		model.put(74, "Quang Tri");
		
		print(model);
		
		
	}
	private static void print(Map<Integer, String> model){
		Set<Entry<Integer,String>> entries = model.entrySet();
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry.getKey() +": " + entry.getValue());
		}
	}

}
