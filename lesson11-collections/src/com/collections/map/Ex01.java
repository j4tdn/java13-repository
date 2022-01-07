package com.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Yeu cau: Luu tru danh sach bien so xe theo thanh pho tai VN
 * 
 * >> Cau truc du lieu
 * >> HashMap: put, putIfAbsent
 */

public class Ex01 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<Integer, String>();
		model.put(92, "Quang Nam");
		model.put(43, "Da Nang");
		model.put(75, "Thua Thien Hue");
		model.putIfAbsent(74, "Quang Tri");
		
		// Complexity: 0(1)
		System.out.println("K43: " + model.get(43));
		System.out.println("K63: " + model.getOrDefault(63, "Viet Nam Province"));

		// put: saveOrUpdate
		// set: replace
		model.replace(75, "T-T-Hue");
		
		model.remove(75);
		
		System.out.println("Contains 74: " + model.containsKey(74));

		System.out.println("size: " + model.size());
		
	}
}
