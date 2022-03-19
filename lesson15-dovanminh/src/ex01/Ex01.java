package ex01;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 5, 5, 3, 1 };
		Map<Integer, Integer> maps = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (maps.containsKey(arr[i])) {
				maps.put(arr[i], 2);
			} else {
				maps.put(arr[i], 1);
			}
		}
		maps.entrySet().stream().filter(m -> m.getValue() == 1).map(m -> m.getKey()).collect(Collectors.toList())
				.forEach(System.out::println);
	}
}
