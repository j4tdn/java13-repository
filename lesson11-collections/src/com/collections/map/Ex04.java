package com.collections.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 
 * 
 *     Map    :    sorting by value ? >> manually
 */


public class Ex04 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();
		
		model.put(92, "Quang Nam");
		model.put(43, "Đà Nẵng");
		model.put(75, "Thừa Thiên Huế");
		model.put(37, "Nghệ An");
		
		print(model);
		
   }
	private static Map<Integer, String> sort(Map<Integer, String> model){
		
		
		//1. Get all entries in map, return Set<Entry>
		Set<Entry<Integer, String>> elements = model.entrySet();
		
		// 2. Convert Set<Entry> to List<>: support sorting
		List<Entry<Integer,String>> sortedList = new ArrayList<>(elements);
		// 3. Sort List<Entry> by Entry(Key, Value)
		sortedList.sort(new Comparator <Entry<Integer,String>>(){
			@Override
			public int compare(Entry<Integer,String> e1,Entry<Integer,String> e2) {
				return e2.getValue().compareTo(e1.getValue());
			}
		});
		//sortedList.
		
		// 4: put elements from sortedList to
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for(Entry<Integer, String> entry: sortedList) {
             sortedMap.put(entry.getKey(), entry.getValue());			
		}
		return sortedMap;
	}
	private static void print(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entries = model.entrySet();
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry.getKey() + "..." + entry.getValue());
		}
	}

}
