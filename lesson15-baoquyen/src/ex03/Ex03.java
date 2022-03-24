package ex03;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ex03 {
	public static void main(String[] args) {
		
		/* 3.1
		   Kiểm tra 2 chuỗi Strings có phải là đảo ngữ (anagram) của nhau không
		   2 Strings được gọi là đảo ngữ nếu chúng sử dụng chung các kí tự, không qua tâm các 
		   kí tự trống, không phân biệt hoa thường. Mỗi kí tự phải có cùng số lượng trong cả 2
		 */
		System.out.println("s1 - Word, s2 - orWd: is Anagram "+ isAnagram("Word", "orWd"));
		System.out.println("s1 - Word, s2 - DoRw: is Anagram "+ isAnagram("Word", "DoRw"));
		System.out.println("s1 - Hellloo, s2 - Hello: is Anagram "+ isAnagram("Hellloo", "Hello"));
		//3.2
		// Viết chương trình. Tìm kiếm kí tự có số lần xuất hiện nhiều nhất trong chuỗi.
		String s = "aaeaccdcaeaeee";
		longestDigits(s);
	}
	
	// Code tốt lắm em
	public static boolean isAnagram(String s1, String s2) {
		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();
		if(s1.length() != s2.length()) {
			return false;
		}
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}
	
	// OK
	public static void longestDigits(String string) {
		char[] digits = string.toCharArray();
		Arrays.sort(digits);
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		System.out.println(digits);
		int index = 0, i = 0;
		int count = 0;
		while(i < digits.length) {
			char character = digits[index];
			if(character == digits[i]) {
				i++;
				count++;
				map.put(character, count);
			} else {
				count = 0;
				index = i;
			}
			
		}
		// Anh không biết hàm này luôn - Thanks em
		int max = Collections.max(map.values());
		map.forEach((key,value) -> {
			if(value == max ) {
				System.out.print(key + " ");
			}
		});
		
	}
}