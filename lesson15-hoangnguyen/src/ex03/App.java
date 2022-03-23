package ex03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
	
	public static void main(String[] args) {
		String s1 = "Wo12rd";
		String s2 = "orWd12";
		
		System.out.println("Anagram: " + isAnagram(s1, s2));
		
		System.out.println("=================");
		
		String str = "aaaababbbbddc";
		// Trường hợp a và b hoặc 1 ký tự khác có số lượng ký tự trùng nhau a chưa xử lý xong
		System.out.println(countingChar(str));
		
	}
	
	public static char countingChar(String str) {
		// 256 ?
		int[] count = new int[256];
	      
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
      
        int max = Integer.MIN_VALUE;
        char result = ' ';

        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
      
        return result;
	}
	
	public static boolean isAnagram(String s1, String s2) {
		int length1 = s1.length();
		int length2 = s2.length();
		
		if(length1 != length2) return false;
		
		Map<Character, Integer> map = new HashMap<>();
		// Good thinking
		// E hiểu cách làm nhưng hơi dài
		// A có thể sorting 2 chuỗi string với Arrays.sort(s1||s2.toCharArray)
		// Chuyển sortedArray sang String rồi sorting có thể sẽ code ngẵn và dễ hơn cách này
		for(int i = 0; i < length1; i++) {
			
			if(map.containsKey(s1.charAt(i))) {
				map.put(s1.charAt(i),
                        map.get(s1.charAt(i)) + 1);
			} else {
				map.put(s1.charAt(i), 1);
			}
		}
		
		for(int i = 0; i < length2; i++) {
			if(map.containsKey(s2.charAt(i))) {
				 map.put(s2.charAt(i),
	                        map.get(s2.charAt(i)) - 1);
			}
		}
		
		Set<Character> keys = map.keySet();
		
		for(Character key : keys) {
			if(map.get(key) != 0) {
				return false;
			}
		}
		
		return true;
	}
}
