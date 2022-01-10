package ex05;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Utils {
	private Utils() {

	}

	public static Map<String, Integer> listCost(Map<String, Integer> map) {
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Map<String, Integer> newMap = new TreeMap<String, Integer>();

		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 500000) {
				newMap.put(entry.getKey(), entry.getValue());
			}
		}
		return newMap;
	}

	@SuppressWarnings("unchecked")
	public static <T> Map<String, Integer> sort(Map<String, Integer> map, Comparator<T> comparator) {
		List<Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
		list.sort((Comparator<? super Entry<String, Integer>>) comparator);
		Map<String, Integer> newMap = new LinkedHashMap<String, Integer>();

		for (Entry<String, Integer> entry : list) {
			newMap.put(entry.getKey(), entry.getValue());
		}
		return newMap;
	}

	public static <K, V> void print(Map<K, V> map) {
		Set<K> set = map.keySet();

		for (K elements : set) {
			System.out.println(elements + " - " + map.get(elements));
		}
	}
}
