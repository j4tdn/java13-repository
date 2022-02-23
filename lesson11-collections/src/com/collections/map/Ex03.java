package com.collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


/**
 * Map : sorting by value >> Manually
 *Normally : sort >> return void
 *				  >> return sortedMap
 */
public class Ex03 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();
		model.put(92, "Quãng Nam");
		model.put(43, "Đà Nẵng");
		model.put(75, "Thừa Thiên Huế");
		model.put(74, "Quảng Trị");
		
		System.out.println("size: " +  model.size());	
		
		
		System.out.println("\n=====================\n");
		print(model);
		
		}
	private static void print(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entries = model.entrySet();
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry.getKey() + "..." + entry.getValue());
		}
	}

}
