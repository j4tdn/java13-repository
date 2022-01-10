package com.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex03 {
	public static void main(String[] args) {
		Map<Integer,String >model = new TreeMap<>();
		model.put(92, "QN");
		model.put(43, "DN");
		model.put(75, "TTH");
		
		print(model);
		
	}
	
	private static void print(Map<Integer,String>model){
		Set<Entry<Integer,String>> entries = model.entrySet();
		for(Entry<Integer,String>entry:entries) {
			System.out.println(entry.getKey() + "..." + entry.getValue());
		}
	}
	
}