package ex05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Map<String, Double> list = DataProvider.getData();

		System.out.println("Những khoảng chi lớn hơn 500.000: ");
		overThan500(list);
		System.out.println("\n========================================\n");
		System.out.println("Khoản chi theo thứ tự tăng dần: ");
		sortAscendingByKey(list);
		System.out.println("\n========================================\n");
		System.out.println("Số tiền theo thứ tự giảm dần: ");
		sortDescendingByValue(list);

	}

	private static void overThan500(Map<String, Double> list) {
		Set<Entry<String, Double>> newSet = list.entrySet();

		List<Entry<String, Double>> newList = new ArrayList<>(newSet);

		newList.stream().filter(entry -> entry.getValue() > 500000)
				.forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));
		;

	}

	private static void sortAscendingByKey(Map<String, Double> list) {
		Set<Entry<String, Double>> newSet = list.entrySet();

		List<Entry<String, Double>> newList = new ArrayList<>(newSet);
		
		newList.stream().sorted(Comparator.comparing(Entry::getKey)).forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));;
	}
	
	private static void sortDescendingByValue(Map<String, Double> list) {
		Set<Entry<String, Double>> newSet = list.entrySet();

		List<Entry<String, Double>> newList = new ArrayList<>(newSet);
		
		newList.stream().sorted(Comparator.comparing(Entry::getValue,  Comparator.reverseOrder())).forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));;
	}
}
