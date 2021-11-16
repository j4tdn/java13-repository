package ex07;

public class Main {
	public static void main(String[] args) {
		String s = "aaabaaabbaaaaa";
		maxMinLength(s);
	}

	private static void maxMinLength(String s) {
		int min = s.length(), max = 0, length = 1;
		int endMin = 0, endMax = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				length++;
				if (length > max) {
					max = length;
					endMax = i + 1;
				}
			} else {
				if (length < min) {
					min = length;
					endMin = i;
				}
				length = 1;
			}
		}
		String minS = s.substring(endMin - min + 1, endMin + 1);
		String maxS = s.substring(endMax - max + 1, endMax + 1);
		System.out.println("Max: " + max + " " + maxS);
		System.out.println("Min: " + min + " " + minS);
	}
}
