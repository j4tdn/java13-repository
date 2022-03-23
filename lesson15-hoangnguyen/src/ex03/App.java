package ex03;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {

		String s1 = "Word";
		String s2 = "oWrd";

		System.out.println("Anagram: " + isAnagram(s1, s2));

		System.out.println("=================");

		String str = "aaaababbbbddc";
		// Trường hợp a và b hoặc 1 ký tự khác có số lượng ký tự trùng nhau a chưa xử lý
		// xong
		System.out.println(countingChar(str));

	}

	public static char countingChar(String str) {

		Map<Character, Integer> map = new HashMap<>();

		int len = str.length();
		for (int i = 0; i < len; i++) {
			int count = map.containsKey(str.charAt(i)) ? map.get(str.charAt(i)) + 1 : 1;
			map.put(str.charAt(i), count);
		}

		int max = Integer.MIN_VALUE;
		char result = ' ';

		Entry<Character, Integer> value = map.entrySet().stream().max(Comparator.comparingInt(Entry::getValue)).get();
		Character key = value.getKey();

//        for (int i = 0; i < len; i++) {
//            if (max < count[str.charAt(i)]) {
//                max = count[str.charAt(i)];
//                result = str.charAt(i);
//            }
//        }

		return key;
	}

	public static boolean isAnagram(String s1, String s2) {
		int length1 = s1.length();
		int length2 = s2.length();

		if (length1 != length2)
			return false;

		Map<Character, Integer> map = new HashMap<>();
		// Good thinking
		// E hiểu cách làm nhưng hơi dài
		// A có thể sorting 2 chuỗi string với Arrays.sort(s1||s2.toCharArray)
		// Chuyển sortedArray sang String rồi sorting có thể sẽ code ngẵn và dễ hơn cách
		// này
		for (int i = 0; i < length1; i++) {

			if (map.containsKey(s1.charAt(i))) {
				map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
			} else {
				map.put(s1.charAt(i), 1);
			}
		}

		for (int i = 0; i < length2; i++) {
			if (map.containsKey(s2.charAt(i))) {
				map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);

				Iterator<Integer> st1 = s1.chars().sorted().boxed().iterator();
				Iterator<Integer> st2 = s2.chars().sorted().boxed().iterator();

				while (st1.hasNext() && st2.hasNext()) {
					if (st1.next() != st2.next()) {
						return false;
					}
				}

			
			}
		}
		
		return true;
	}
}
