package ex05;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = "ABCEDEABCKL";
		String S2 = "ABCEDCBEABCKL";
//		do {
//			System.out.print("S1: ");
//			S1 = sc.nextLine();
//			try {
//				if (isValid(S1)) {
//					System.out.print("S2: ");
//					S2 = sc.nextLine();
//					if (isValid(S2)) {
//						break;
//					}
//				}
//			} catch (Exception ex) {
//				System.out.println(ex.getMessage());
//			}
//		} while (true);
		System.out.println("=====================================");
		System.out.println("S1: " + S1);
		System.out.println("S2: " + S2);
		String longestMutualStr = getTheLogestMutualString(S1, S2);
		System.out.println("Xâu con chung dài nhất là: " + longestMutualStr);
		sc.close();
	}

	private static String getTheLogestMutualString(String s1, String s2) {
		int maxLength = 1;
		int count = 0;
		int firstIndex = 0, lastIndex = 0;
		int start = 0;
		for (int i = 0; i < s1.length();) {
			start = i;
			for (int j = i + 1; j < s1.length() + 1; j++) {
				if (s2.contains(s1.substring(i, j))) {
					count++;
				} else {
					break;
				}
			}
			if (count > maxLength) {
				maxLength = count;
				firstIndex = start;
			}
			i = i + count;
			count = 0;
		}
		lastIndex = firstIndex + maxLength;
		return s1.substring(firstIndex, lastIndex);
	}

	private static boolean isValid(String s) throws Exception {
		if (!s.matches("[A-Z]+")) {
			throw new Exception("s1,s2 chỉ chứa các kí tự ‘A’…’Z’");
		}
		return true;
	}
}
