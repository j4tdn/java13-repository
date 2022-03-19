package ex03;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class App02 {

	public static void main(String[] args) {
		String string = "aaaababbbddc";
		Map<Character, Integer> map = getCommonCharacters(string);

		for (Entry<Character, Integer> i : map.entrySet()) {
			System.out.println(i.getKey() + " - " + i.getValue());
		}
		int max = Collections.max(map.values());
		System.out.print("Ki tu co so lan xuat hien nhieu nhat trong chuoi la: ");
		map.forEach((key, value) -> {
			if (value == max) {
				System.out.println(key + " ");
			}
		});
	}

	private static Map<Character, Integer> getCommonCharacters(String string) {
		Map<Character, Integer> map = new HashMap<>();
		int count = 1;
		for (int i = 0; i < string.length(); i++) {
			if (!isRepeat(string, i)) {
				for (int j = i + 1; j < string.length(); j++) {
					if (string.charAt(i) == string.charAt(j)) {
						count++;
					}
				}
				map.put(string.charAt(i), count);
			}
			count = 1;
		}
		return map;
	}

	private static boolean isRepeat(String string, int index) {
		for (int i = index - 1; i >= 0; i--) {
			if (string.charAt(i) == string.charAt(index)) {
				return true;
			}
		}
		return false;
	}
}
