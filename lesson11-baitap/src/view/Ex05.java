package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Ex05 {
	public static void main(String[] args) {
		Map<String, Integer> spending = new TreeMap<>();
		spending.put("đi chợ", 550);
		spending.put("đi xem phim", 200);
		spending.put("đi chơi", 300);
		spending.put("đi ăn", 600);
		System.out.println("Danh sách các khoản chi tiêu lơn hơn 500VND: ");
		Map<String, Integer> spendingMoreThan500 = spendingMoreThan500(spending);
		print(spendingMoreThan500);
		System.out.println();
		System.out.println("Danh sách các khoản chi tiêu theo thứ tự tăng dần của các khoản chi tiêu(key):");
		print(spending);
		System.out.println();
		System.out.println("Danh sách các khoản chi theo thứ tự giảm dần bởi số tiền(value):");
		Map<String, Integer> sortingByValue = sort(spending);
		print(sortingByValue);
	}
	
	private static void print(Map<String, Integer> model) {
		Set<Entry<String, Integer>> entries = model.entrySet();
		for(Entry<String, Integer> entry: entries) {
			System.out.println(entry.getKey() + "..." + entry.getValue());
		}
	}
	
	private static Map<String, Integer> spendingMoreThan500(Map<String, Integer> spending){
		Set<Entry<String, Integer>> entries = spending.entrySet();
		Map<String, Integer> result =  new TreeMap<>();
		for(Entry<String, Integer> entry: entries) {
			if(entry.getValue() > 500) {
				result.put(entry.getKey(), entry.getValue());
			}
		}
		return result;
	}
	
	private static Map<String, Integer> sort(Map<String, Integer> spending) {
		Set<Entry<String, Integer>> elements = spending.entrySet();
		List<Entry<String, Integer>> sortedList = new ArrayList<>(elements);
		sortedList.sort(Entry.comparingByValue());
		
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for(Entry<String, Integer> entry: sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
}
