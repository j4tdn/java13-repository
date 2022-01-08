package com.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Yêu cầu : Lưu trữ danh sách biển số xe theo thành phố tại VN
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		 Map<Integer, String> model = new HashMap<>();
		 
		 model.put(92, "Quảng Nam");
		 model.put(43, "Đà Nẵng");
		 model.put(75, "Huế");
		 model.put(74, "Quảng Trị");
		 
		 //trung key thi se van put nhung ghi de len value
		 //model.put(92, "Quảng Ngãi");
		 
		 //trung key se khong add
		 model.putIfAbsent(92, "Quang Ngai");
		 
		 //get
		 //complexity : 0(1)
		 //hashing : convert the key to hash code and stored in heap memory to process quicker
		 System.out.println("K43: " + model.get(43));
		 
		 System.out.println("K63: " + model.getOrDefault(63, "Viet Nam"));
		 
		 // put: saveOrUpdate
		 // set: replace
		 model.replace(75, "T-T-Huế");
		 System.out.println("K75: " + model.get(75));
		 // remove 
		 model.remove(75);
		 
		 // contains
		 System.out.println("contains 74: " + model.containsKey(74));
		 
		 System.out.println("K75: " + model.get(75));
		 System.out.println("size: " + model.size());
	}
}
