package com.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * yêu cầu: lưu trữ danh sách mã biển số xe theo thành phố tại VN
 *
 * >> Cấu trúc dữ liệu: HashMap >> put , putlfAbsent
 */
public class Ex01 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();
		model.put(92, "Quãng Nam");
		model.put(43, "Đà Nẵng");
		model.put(75, "Thừa Thiên Huế");
		model.put(74, "Quảng Trị");
		model.putIfAbsent(92, "Quãng Ngãi");
		
		//Complexity :0(1)
		System.out.println("K43: " + model.get(43));
		System.out.println("K63: " + model.getOrDefault(63, "Viet Nam Province"));
		
		//put: saveOrUpdate
		//set : replace
		
		model.replace(75, "T-T-Huế");
		
		//remove
		model.remove(75);
		
		System.out.println("contains: " + model.containsKey(47));
		
		System.out.println("size: " +  model.size());
	}
}
