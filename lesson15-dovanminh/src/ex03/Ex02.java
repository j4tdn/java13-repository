package ex03;

import java.util.HashMap;
import java.util.Map;

public class Ex02 {
	public static void main(String[] args) {
		String str = "aaaccdcee";
		Map<String, Integer> maps = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (maps.containsKey(str.charAt(i) + "")) {
				maps.put(str.charAt(i) + "", maps.get(str.charAt(i) + "") + 1);
			} else {
				maps.put(str.charAt(i) + "", 1);
			}
		}
		Integer max = maps.entrySet().stream().mapToInt(m -> m.getValue()).max().getAsInt();
		maps.entrySet().stream().filter(m -> m.getValue() == max).map(m -> m.getKey()).forEach(System.out::println);
	}
}
