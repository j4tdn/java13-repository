package Ex03;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class App1 {
	public static void main(String[] args) {
		String s = "aaaccdcee";
		String[] elements = s.split("");

		Arrays.stream(elements)
		.collect(Collectors.groupingBy(student -> student, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(entry -> entry.getValue() == max(elements))
		.map(entry -> entry.getKey())
		.forEach(System.out::println);


	}
	private static long max(String[] elements) {
		Map<Object, Long> map = Arrays.stream(elements)
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		long maxValue = 0;

		for (Long value : map.values()) {
			if (value > maxValue) {
				maxValue = value;
			}
		}
		return maxValue;
	}

}
