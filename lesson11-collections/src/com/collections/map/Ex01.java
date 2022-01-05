package com.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Yêu cầu: Lưu trữ danh sách biển số xe theo thành phố tại VN
 *
 * >> Cấu trúc dữ liệu
 * >> HashMap<K,V>: put, putIfAbsent, get, getOrDefault
 */

public class Ex01 {
	
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();
		model.put(92, "Quang Nam");
		model.put(43, "Da Nang");
		model.put(75, "Hue");
		model.put(74, "Quang Tri");
		model.putIfAbsent(92, "Quang Ngai");
		
		// Complexity: O(1)
		System.out.println("K43: " + model.get(43));
		System.out.println("K42: " + model.getOrDefault(42, "Viet Nam Province"));
		
		// Set = Replace
		model.replace(75, "T-T-Hue");
		
		// Remove
		model.remove(75);
		
		// Contains
		System.out.println("is contains ? " + model.containsKey(43));
		
		System.out.println("size: " + model.size());
	}
}
