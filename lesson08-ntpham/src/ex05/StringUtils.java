package ex05;

public class StringUtils {
	private StringUtils() {
	}
	
	public static String getLongestMutualSubString(String s1, String s2) {
		if (s1.compareTo(s2) == 0) return s1;
		int startIndex = 0;
		int endIndex = 0;
		int maxLength = 0;
		for (int i = 0; i < s1.length(); i++) {
			int nowLength = 0;
			for (int j = i + 1; j < s1.length() + 1; j++) {	
				if (s2.contains(s1.substring(i, j))) {
					nowLength++ ;
				}
				if (nowLength > maxLength) {
					maxLength = nowLength;
					startIndex = i;
					endIndex = j;
				}
			}
		}
		String rs = s1.substring(startIndex, endIndex);
		return rs != "" ? rs : "none";
	}

}
