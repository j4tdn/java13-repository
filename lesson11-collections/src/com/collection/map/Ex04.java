package com.collection.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import static java.util.Comparator.*;
/*
 * Map Iterator: sorting by value
 * Normally: sort >> return void
 * 				  >> return sortedMap
 */
public class Ex04 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();

		model.put(92, "AQuang Nam");
		model.put(43, "BDa Nang");
		model.put(75, "CHue");
		model.put(74, "DQuang Tri");
		
		//Map<Integer, String> sortedMap = sort(model);
		
		print(sort(model));
		
		
	}
	
	private static Map<Integer,String> sort(Map<Integer,String> model){
		
		//1. Get all entries in map, return Set<Entry>
		//	 Set<E> does not support sorting
		Set<Entry<Integer, String>> elements = model.entrySet();
		
		//2. Convert Set<Entry> to List<Entry>: support sort
		List<Entry<Integer, String>> sortedList = new ArrayList<>(elements);
		
		//3. Sort List<Entry> by Entry
		// Anonymous class and override compareTo Method
		//sortedList.sort(comparing(Entry::getValue));
		sortedList.sort(Entry.comparingByValue(reverseOrder()));
		
		//4. Put elements from sortedList to sortedMap
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for(Entry<Integer,String> entry: sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	
	private static void print(Map<Integer, String> model){
		Set<Entry<Integer,String>> entries = model.entrySet();
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry.getKey() +": " + entry.getValue());
		}
	}
}
