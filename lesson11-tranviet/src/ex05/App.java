package ex05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import utils.Utils;

/**
 * Bài 5: Tạo cấu trúc dữ liệu lưu trữ các khoản chi tiêu trong ngày, thông tin
 * lưu trữ dưới dạng key/value. Với key là thông tin khoản chi tiêu, value là số
 * tiền đã sử dụng cho khoản chi tiêu đó. Viết chương trình thực hiện các chức
 * năng sau: 
 * - Liệt kê thông tin các khoản chi lớn hơn 500 nghìn VNĐ 
 * - Sắp xếp các khoản chi theo thứ tự tăng dần của các khoản chi tiêu(key). 
 * - Sắp xếp các khoản chi theo thứ tự giảm dần bởi số tiền(value).
 *
 */
public class App {
	public static void main(String[] args) {
		Map<String, Double> spendings = mockData();
		Utils.printMap(spendings);
		System.out.println("\n===========================================\n");
		
		// Liệt kê thông tin các khoản chi lớn hơn 500 nghìn VNĐ
		Map<String, Double> highSpendings = getHighSpendings(spendings, 500000d);
		System.out.println("Thông tin các khoản chi lớn hơn 500 nghìn VNĐ");
		Utils.printMap(highSpendings);
		System.out.println("\n===========================================\n");
		
		//- Sắp xếp các khoản chi theo thứ tự tăng dần của các khoản chi tiêu(key). 
		System.out.println("Sắp xếp các khoản chi theo thứ tự tăng dần của các khoản chi tiêu(key).");
		Map<String, Double> sortedByKey = sort(spendings, Entry.comparingByKey());
		Utils.printMap(sortedByKey);
		System.out.println("\n===========================================\n");
		
		//- Sắp xếp các khoản chi theo thứ tự giảm dần bởi số tiền(value).
		System.out.println("Sắp xếp các khoản chi theo thứ tự giảm dần bởi số tiền(value).");
		Map<String, Double> sortedByValue = sort(spendings, Entry.comparingByValue(Comparator.reverseOrder()));
		Utils.printMap(sortedByValue);
		System.out.println("\n===========================================\n");
	}
	private static Map<String, Double> sort(Map<String, Double> spendings, Comparator<Entry<String, Double>>  comparator) {
		Set<Entry<String, Double>> entries = spendings.entrySet();
		List<Entry<String, Double>> sortedList = new ArrayList<>(entries);
		sortedList.sort(comparator);
		Map<String, Double> sortedMap = new LinkedHashMap<>();
		for(Entry<String, Double> entry: sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	private static Map<String, Double> getHighSpendings(Map<String, Double> spendings, Double price) {
		Map<String, Double> highSpendings = new HashMap<>();
		Set<Entry<String, Double>> entries = spendings.entrySet();
		for (Entry<String, Double> entry : entries) {
			if (entry.getValue() > price) {
				highSpendings.put(entry.getKey(), entry.getValue());
			}
		}
		return highSpendings;
	}

	private static Map<String, Double> mockData() {
		Map<String, Double> spendings = new HashMap<>();
		spendings.put("Ăn sáng", 20000d);
		spendings.put("Cafe", 20000d);
		spendings.put("Shopping", 600000d);
		spendings.put("Ăn trưa", 15000d);
		spendings.put("Đá bóng", 20000d);
		spendings.put("Ăn tối", 30000d);
		spendings.put("Bida", 15000d);
		return spendings;
	}
}
