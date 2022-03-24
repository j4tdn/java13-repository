package ex03;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		String s1 = "T h u O n g";
		String s2 = "G nouht";
		System.out.println(checkStringSame(s1, s2));
	}

	private static boolean checkStringSame(String s1, String s2) {
		// Thật ra em không cần kiểm tra step contains cũng được
		// replaceAll nên dùng pattern \\s+: một hoặc nhiều space
		if (s1.contains(" ")) {
			s1 = s1.replaceAll("\\s+", "");
		}
		
		if (s2.contains(" ")) {
			s2 = s2.replaceAll("\\s+", "");
		}
		
		char[] char1 = s1.toLowerCase().toCharArray();
		char[] char2 = s2.toLowerCase().toCharArray();
		
		// Đoạn này không cần thiết
		if (char1.length != char2.length) {
			return false;
		}
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		return Arrays.compare(char1, char2) == 0;
		
		// Còn 1 câu chưa làm
	}
}
