package ex05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex05 {
	public static void main(String[] args) {
		Map<String, Double> myBudget = new HashMap<>();
		myBudget.put("Tiền nhà", 2500000d);
		myBudget.put("Tiền nước", 77000d);
		myBudget.put("Tiền điện", 125000d);
		myBudget.put("Mua sắm", 1500000d);
		
		getSpendingMore500(myBudget);
		sortAscendingByKey(myBudget);
		sortDescendingByValue(myBudget);
	}
	private static void getSpendingMore500(Map<String, Double> myBudget) {
		Set<Entry<String, Double>> entries = myBudget.entrySet();
		List<Entry<String, Double>> budget = new ArrayList<>(entries);
		System.out.println("Các khoản chi phí lớn hơn 500.000 đồng:");
		for(Entry entry:budget) {
			if(Double.parseDouble(entry.getValue().toString())>500000d) {
				System.out.println("- "+entry.getKey()+" : "+entry.getValue() + "(đồng)");
			}
		}
	}
	private static void sortAscendingByKey(Map<String, Double> myBudget) {
		Set<Entry<String, Double>> entries = myBudget.entrySet();
		List<Entry<String, Double>> budget = new ArrayList<>(entries);
		System.out.println("Sắp xếp tăng dần theo Key: ");
		budget.stream().sorted(Comparator.comparing(Entry::getKey)).forEach(entry->System.out.println("- "+entry.getKey()+" : "+entry.getValue() + "(đồng)"));
	}
	private static void sortDescendingByValue(Map<String, Double> myBudget) {
		Set<Entry<String, Double>> entries = myBudget.entrySet();
		List<Entry<String, Double>> budget = new ArrayList<>(entries);
		System.out.println("Sắp xếp giảm dần theo value: ");
		budget.stream().sorted(Comparator.comparing(Entry::getValue)).forEach(entry->System.out.println("- "+entry.getKey()+" : "+entry.getValue() + "(đồng)"));
	}
}
