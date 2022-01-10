package com.collections.map;
import java.util.Comparator;
/*
 * 
 * Map Iterator
 * HashMap: do not maintain order of input element
 * LinkedHashMap : ensure order of input elements
 * TreeMap : default: sorted by key  ascending.
 *         :                descending? >> reverseOrder
 *         :          sorting by value ? >> manually
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex03 {
	public static void main(String[] args) {
		//Map<Integer, String> model = new HashMap<>();
		//Map<Integer, String> model = new LinkedHashMap<>();
		//Map<Integer, String> model = new TreeMap<>();// ascending of key
		Map<Integer, String> model = new TreeMap<>(Comparator.reverseOrder());// descending of key
		model.put(92, "Quang Nam");
		model.put(43, "Đà Nẵng");
		model.put(75, "Thừa Thiên Huế");
		model.put(37, "Nghệ An");
		
		print(model);
		
   }
	private static void print(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entries = model.entrySet();
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry.getKey() + "..." + entry.getValue());
		}
	}

}
