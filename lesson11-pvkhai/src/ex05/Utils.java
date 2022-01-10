package ex05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Utils {
	private Utils() {
		
	}
	
	public static Map<String, Double> get(Map<String, Double> data, Stategy stategy) {
		Map<String, Double> getData = new HashMap<>();
		
		Set<Entry<String, Double>> entries = data.entrySet();
		
		for(Entry<String, Double> entry: entries) {
			if(stategy.check(entry)) {
				getData.put(entry.getKey(), entry.getValue());
			}
		}
		return getData;
	}
	
	public static Map<String, Double> sort(Map<String, Double> data) {
		Set<Entry<String, Double>> entries = data.entrySet();
		
		List<Entry<String, Double>> sortedList = new ArrayList<>(entries);
		
		sortedList.sort(Comparator.comparing(Entry::getValue,Comparator.reverseOrder()));
		
		Map<String, Double> sortedMap = new LinkedHashMap<>();
		for(Entry<String,Double> entry: sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
}
