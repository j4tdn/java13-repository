package com.collections.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map: sorting by value >> manually
 */

public class Ex04 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<Integer, String>();
		model.put(92, "Quang Nam");
		model.put(43, "Da Nang");
		model.put(75, "Thua Thien Hue");
		model.putIfAbsent(74, "Quang Tri");
		
		System.out.println("size: " + model.size());
		
		print(model);
		sort(model);
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> model){
		// 1. Get all entries in map, return Set<Entry>
		//    Set<E> does not support sorting
		Set<Entry<Integer, String>> elements = model.entrySet();
		
		// 2. Convert Set<Entry> to List<Entry>: support sorting
		List<Entry<Integer, String>> sortedList = new ArrayList<Map.Entry<Integer,String>>(elements);
		
		// 3. Sort: List<Entry> by Entry(Key, Value)
		sortedList.sort(new Comparator<Entry<Integer, String>>() {

			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		// 4. Put elements from sortedList to sortedMap
		Map<Integer, String> sortedMap = new HashMap<Integer, String>();
		for(Entry<Integer, String> entry: sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	
	private static void print(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entries = model.entrySet();
		for(Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + "..." + entry.getValue() );
		}

	}
}
