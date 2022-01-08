package com.collection.map;
/**
 * Map Iterator
 * HashMap: do not maintain order of input element
 * LinkedHashMap: ensure order of input element
 * TreeMap: sorted by key ascending (default) >> reveseOrder
 * 			:     		  descending
 * 			: sorting by values >> manually
 */

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex03 {
	public static void main(String[] args) {
		Map<Integer, String> model = new TreeMap<>(Comparator.reverseOrder());
		model.put(43, "Đà Nẵng");
		model.put(75, "Thừa Thiên Huế");
		model.put(92, "Quảng Nam");
		model.put(74, "Quảng Trị");
		
		System.out.println("size: "+ model.size());
		System.out.println("\n========================\n");
		print(model);
	}
	
	private static void print(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entries = model.entrySet();
		for(Entry<Integer,String> entry :entries) {
			System.out.println(entry.getKey() + "..." + entry.getValue());
		}
	}
	
	
}
