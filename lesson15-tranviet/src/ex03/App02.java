package ex03;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App02 {

	public static void main(String[] args) {
		String string = "aaaababbbbddc";
		Map<Character, Long> map = getCommonCharacters(string);
		System.out.println(map);

		long max = Collections.max(map.values());
		System.out.println("Ki tu co so lan xuat hien nhieu nhat trong chuoi la: ");
		map.entrySet().stream()
				.filter(x -> (x.getValue() == max)) //
				.map(Entry::getKey)
				.forEach(System.out::println);
	}

	// Replace by Collectors.groupingBy(Function.identity, Collectors.counting());
	private static Map<Character, Long> getCommonCharacters(String string) {
//		Map<Character, Integer> map = new HashMap<>();
//		int count = 1;
//		for (int i = 0; i < string.length(); i++) {
//			if (!isRepeat(string, i)) {
//				for (int j = i + 1; j < string.length(); j++) {
//					if (string.charAt(i) == string.charAt(j)) {
//						count++;
//					}
//				}
//				map.put(string.charAt(i), count);
//			}
//			count = 1;
//		}
//		return map;
		return string.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	}

//	private static boolean isRepeat(String string, int index) {
//		for (int i = index - 1; i >= 0; i--) {
//			if (string.charAt(i) == string.charAt(index)) {
//				return true;
//			}
//		}
//		return false;
//	}
}
