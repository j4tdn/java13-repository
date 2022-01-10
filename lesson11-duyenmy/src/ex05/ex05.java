package ex05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ex05 {
	public static void main(String[] args) {
		Map<String, Integer> thongkect = new HashMap<>();
		thongkect.put("rau", 20);
		thongkect.put("xe dap", 1500);
		thongkect.put("ao khoac", 800);
		thongkect.put("cuc sac", 200);
		print(thongkect);
		System.out.println("=======================");
		System.out.println("Nhung chi tieu hon 500k la: ");
		searchByPrice(thongkect, 500);
		System.out.println("=======================");
		Map<String, Integer> sx = sortByKey(thongkect);
		print(sx);
		System.out.println("=======================");
		Map<String, Integer> sx2 = sortByValue(thongkect);
		print(sx2);
	}

	private static void print(Map<String, Integer> thongke) {
		Set<Entry<String, Integer>> entries = thongke.entrySet();
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "  :  " + entry.getValue());
		}
	}

	private static void searchByPrice(Map<String, Integer> chitieu, int cost) {
		Set<Entry<String, Integer>> entries = chitieu.entrySet();
		for (Entry<String, Integer> entry : entries) {
			if (entry.getValue() > cost) {
				System.out.println(entry.getKey() + "  :  " + entry.getValue());
			}
		}
	}

	private static Map<String, Integer> sortByKey(Map<String, Integer> thongke) {
		Set<Entry<String, Integer>> elements = thongke.entrySet();
		List<Entry<String, Integer>> sortedList = new ArrayList<>(elements);
		sortedList.sort(Entry.comparingByKey());
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Entry<String, Integer> entry : sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	private static Map<String, Integer> sortByValue(Map<String, Integer> thongke) {
		Set<Entry<String, Integer>> elements = thongke.entrySet();
		List<Entry<String, Integer>> sortedList = new ArrayList<>(elements);
		sortedList.sort(Entry.comparingByValue());

		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (int i = sortedList.size() - 1; i >= 0; i--) {
			sortedMap.put(sortedList.get(i).getKey(), sortedList.get(i).getValue());
		}
		return sortedMap;
	}

}
