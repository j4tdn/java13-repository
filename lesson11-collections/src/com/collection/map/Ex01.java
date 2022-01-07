package com.collection.map;

import java.util.HashMap;
import java.util.Map;

/*
 * Yêu cầu: Lưu trữ danh sách biển số xe theo thành phố tại VN
 * 
 * >> Cấu trúc dữ liệu 
 * >> HashMap<K,V>: put, putIfAbsence, get, getOrDefault
 */
public class Ex01 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();
		
		model.put(92, "Quang Nam");
		model.put(43, "Da Nang");
		model.put(75, "Hue");
		model.put(74, "Quang Tri");
		model.putIfAbsent(92, "Quang Ngai");
		
		System.out.println("Key 43: " + model.get(43));
		System.out.println("Key 63: " + model.getOrDefault(63,"VN"));
		
		//put: save or update
		//set: replace()
		model.replace(75, "TT-Hue");
		
		model.remove(75);
		
		System.out.println("contains 74: " + model.containsKey(74));
		
		System.out.println("Size: " + model.size());
	}
}
