// Tên package nhớ viết thường toàn bộ
package Ex03;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App1 {
	public static void main(String[] args) {
		String s = "aaaccdcee";
		String[] elements = s.split("");
		
		long max = max(elements);

		Arrays.stream(elements)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet()
		.stream()
		// Kết quả chính xác nhưng ...
		// Viết kiểu này thì e sẽ phải tìm max rất nhiều lần
		.filter(entry -> entry.getValue() == max)
		.map(entry -> entry.getKey()) // Entry::getKey
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
