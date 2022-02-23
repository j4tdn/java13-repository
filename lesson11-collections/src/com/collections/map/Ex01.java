package com.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Yêu cầu: Lưu trữ danh sách mã biển số xe theo thành phố tại VN
 * 
 * >> Cấu trúc dữ liệu
 * >> HashMap<K, V>: put, putIfAbsent, get, getOrDefault
 */
public class Ex01 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();//Map<key, value>
		
		model.put(92, "Quảng Nam");
		model.put(43, "Đà nẵng");
		model.put(75, "Thừa Thiên Huế");
		model.put(74, "Quảng Trị");
		model.putIfAbsent(92, "Quảng Ngãi");
		model.entrySet().forEach(t -> {
			System.out.println(t.getValue());
		});
		
		System.out.println("====");
		
		// Complexity: O(1)
		System.out.println("K43: " + model.get(92));
		System.out.println("K63: " + model.getOrDefault(63, "Viet Nam Province"));
		
		// put: saveOrUpdate
		// set: replace
		model.replace(75, "T-T-Huế");
		
		model.remove(75);
		
		System.out.println("contains 74: " + model.containsKey(74));
		
		System.out.println("size: " + model.size());
	}
}