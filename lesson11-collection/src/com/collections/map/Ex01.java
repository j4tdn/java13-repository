package com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {
	public static void main(String[] args) {
		Map<Integer,String >model = new HashMap<>();
		model.put(92, "QN");
		model.put(43, "DN");
		model.put(75, "TTH");
		model.putIfAbsent(92, "QNg");
		
		System.out.println("K43:"+model.get(43)); 
		System.out.println("K73:"+model.getOrDefault(73, "VN"));
		
		model.replace(75, "T-T-H");
		
		model.remove(75);
		System.out.println("contains 75:"+model.containsKey(74));
		
		System.out.println("size: "+model.size());
	}
}
