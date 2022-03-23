package ex01;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex02 {
	public static void main(String[] args) {
		// ok - good
		int[] arr = { 5, 7, 9, 10, 20, 9, 7, 11 };
		Map<Integer, Integer> maps = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (maps.containsKey(arr[i])) {
				maps.put(arr[i], 2);
			} else {
				maps.put(arr[i], 1);
			}
		}
		maps.entrySet().stream().filter(m -> m.getValue() > 1).map(m -> m.getKey()).collect(Collectors.toList())
				.forEach(System.out::println);
	}
}
