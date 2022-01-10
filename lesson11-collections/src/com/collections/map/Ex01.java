package com.collections.map;

import java.util.HashMap;
import java.util.Map;

/*
 * Yêu cầu : lưu trữ danh sách biển số xe theo thành phố tại VN
 * 
 * >> Cấu trúc dữ liệu
 * >> HashMap
 */

public class Ex01 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();
		model.put(92, "Quang Nam");
		model.put(43, "Đà Nẵng");
		model.put(75, "Thừa Thiên Huế");
		model.put(37, "Nghệ An");
		model.putIfAbsent(92, "Quãng Ngãi");
		
		// Complexity O(1)
		System.out.println("K43: " + model.get(43));
		System.out.println("K43: " + model.getOrDefault(63,"VietNam province"));
		
		// put : saveOrUpdate
		// set : replace
		System.out.println("K43: " + model.replace(75, "TT_Huế"));
		
		System.out.println("K43: " + model.remove(75));
		// check exist
		System.out.println("contains: " + model.containsKey(74));
		
		
		System.out.println("model: " + model.size());
	}

}
