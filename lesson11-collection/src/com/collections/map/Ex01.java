package com.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Yêu cầu: Lưu trữ danh sách biển số xe theo thành phố tại VN
 * 
 * >> Cấu trúc dữ liệu
 * >> HashMap
 */
public class Ex01 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();
		model.put(92, "Quảng Nam");
		model.put(43, "Đà Nẵng");
		model.put(75, "Thừa Thiên Huế");
		model.put(74, "Quảng Trị");
		model.putIfAbsent(92, "Quảng Ngãi");
		
		// Complexity: O(1)
		System.out.println("K43: " + model.get(43));
		System.out.println("K63: " + model.getOrDefault(63, "Viet Nam Province"));
		
		// put: save or update
		// set: replace
		model.replace(75, "T-T-Huế");
		
		model.remove(75);
		
		System.out.println("contains 74: " + model.containsKey(74));
		
		System.out.println("size: " + model.size());
		
		
	}
}
