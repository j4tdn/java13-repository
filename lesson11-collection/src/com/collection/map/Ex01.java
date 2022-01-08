package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();
		model.put(43, "Đà Nẵng");
		model.put(75, "Thừa Thiên Huế");
		model.put(92, "Quảng Nam");
		model.putIfAbsent(92, "Quảng Ngãi");
		
		// Complexity = 1
		System.out.println("K43: " + model.get(43));
		System.out.println("K63: " + model.getOrDefault(63, "Viet Nam's province"));
		
		// put: OrUpdate
		// set: replace
		model.replace(75, "T.T Hue");
		model.remove(75);
		System.out.println("contains 43: " + model.containsKey(43));
		System.out.println("size: " + model.size());
	}
}
