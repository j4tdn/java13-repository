package package03;

import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalLong;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex03App02 {
	
	public static void main(String[] args) {
		String text = "aaaababbbbddc";
		
		// Stream<Character>
		Map<Character, Long> letterStatistic = text.chars()
			.mapToObj(letter ->(char) letter) // Stream<Character>
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		OptionalLong opt = letterStatistic.entrySet() // Set<Entry<Character, Long>
										   .stream() // Stream<Entry<Character, Long>
										   .mapToLong(Entry::getValue) // LongStream
										   .max();
		
		System.out.println("Số lượng ký tự nhiều nhất trong chuỗi " + text + " là: ");
		if(opt.isPresent()) {
			letterStatistic.forEach((letter, count) -> {
				if(count == opt.getAsLong()) {
					System.out.println(letter + ", " + count);
				}
			});
		}
	}
}
