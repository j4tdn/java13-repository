package ex07;

public class StringUtils {
	private StringUtils() {
	}
	
	public static void LongestSubCorrectString(String s) {
		int start = 0;
		int startIndex = 0, endIndex = 1;
		int lengthMax = 1;
		for (int i = 0; i < s.length(); i++) {
			start = i;
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if(s.charAt(j) != s.charAt(i)) break;
				count++;
 			}
			if (count > lengthMax) {
				lengthMax = count;
				startIndex = start;
			}
			i = i + count - 1;
		}
		endIndex = startIndex + lengthMax;
		
		System.out.println("Do dai lon nhat cua day con dung :" + lengthMax + " \"" 
					+ s.substring(startIndex, endIndex) + "\"[" + startIndex + "]");
	}
	
	public static void SmallestSubCorrectString(String s) {
		int start = 0;
		int startIndex = 0, endIndex = 1;
		int lengthMin = s.length();
		for (int i = 0; i < s.length(); i++) {
			start = i;
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if(s.charAt(j) != s.charAt(i)) break;
				count++;
 			}
			if (count < lengthMin) {
				lengthMin = count;
				startIndex = start;
			}
			i = i + count - 1;
		}
		endIndex = startIndex + lengthMin;
		
		System.out.println("Do dai nho nhat cua day con dung :" + lengthMin + " \"" 
							+ s.substring(startIndex, endIndex) + "\"[" + startIndex + "]");
	}
}
