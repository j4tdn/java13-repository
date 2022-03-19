package view;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

/**
 * 
 * @author Pho Dac Biet
 *	1. Kiểm tra 2 chuỗi Strings có phải là đảo ngữ (anagram) của nhau không
2 	Strings được gọi là đảo ngữ nếu chúng sử dụng chung các kí tự, không qua tâm các
	kí tự trống, không phân biệt hoa thường. Mỗi kí tự phải có cùng số lượng trong cả 2
	Strings
 */
public class Ex03 {
	public static void main(String[] args) {
		System.out.println("isEqual: " + isEqual("DoRw", "orWd"));
		 Map<String, Integer> rs = countChar("aaaccdcee");
		 int max = rs.entrySet()
			.stream()
			.map(entry -> entry.getValue())
			.reduce(0, new BinaryOperator<Integer>() {
				public Integer apply(Integer t, Integer u) {
					return t > u ? t : u;
				};
			});
		 
		 System.out.println("Result: " + max);
		 rs.entrySet()
		 	.stream()
		 	.filter(entry -> entry.getValue() == max)
		 	.map(entry -> entry.getKey())
		 	.forEach(System.out::println);
		 
	}
	
	private static boolean isEqual(String a, String b) {
		if (a == null || b == null) {
			return false;
		}
		if (a == b) {
			return true;
		}
		if (a.length() != b.length()) {
			return false;
		}
		a = a.toUpperCase(); b = b.toUpperCase();
		char[] chara = a.toCharArray();
		char[] charb = b.toCharArray();
		Arrays.sort(chara);
		Arrays.sort(charb);
		for (int i = 0; i < chara.length; i++) {
			if (chara[i] != charb[i]) {
				return false;
			}
		}
		return true;
	}
	
	private static Map<String, Integer> countChar(String s) {
		Map<String, Integer> counting = new HashMap<String, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (!(counting.containsKey("" + s.charAt(i)))) {
				counting.put("" + s.charAt(i), 1);
			} else {
				counting.replace("" + s.charAt(i), (counting.get(("" + s.charAt(i))) + 1));
			}
		}
		return counting;
	}
}
