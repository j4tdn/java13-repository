package com.collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


/**
 * Map Iterator.
 * HashMap : Không duy trì thứ tự đưa vào 
 * LinkedHashMap :đảm bảo duy trì thứ tự các phần tử đưa vào.
 * TreeMap:mặc định sắp xếp theo thứ tự tăng dần của key
 * 		  :	muốn giảm dần dùng >> reversOrder.
 * 		  : xắp sếp theo value >> manually
 * 
 *
 */
public class Ex04 {
	public static void main(String[] args) {
		Map<Integer, String> model = new TreeMap<Integer, String>(Comparator.reverseOrder());
		model.put(92, "Quãng Nam");
		model.put(43, "Đà Nẵng");
		model.put(75, "Thừa Thiên Huế");
		model.put(74, "Quảng Trị");
		
		System.out.println("size: " +  model.size());	
		
		
		System.out.println("\n=====================\n");
		print(model);
		
		}
	private static void print(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entries = model.entrySet();
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry.getKey() + "..." + entry.getValue());
		}
	}

}
