/**
 * Bài 7: Cho xâu kí tự S bao gồm toàn các ký tự ‘a’ đến ‘z’, không quá 255 ký tự. “Dãy
	con đúng” trong xâu S là dãy có các kí tự liền kề giống nhau
	Yêu cầu:
	Hãy tính độ dài lớn nhất của dãy con đúng của dãy S.
	Hãy tính độ dài nhỏ nhất của dãy con đúng của dãy S.
	Example: ‘aaabaaabbaaaaa’
	Độ dài lớn nhất của dãy con đúng : 5 “aaaaa” [9]
	Độ dài nhỏ nhất của dãy con đúng: 1 “b” [3]
	Với [x] => bắt đầu từ vị trí x trong xâu S
 */
package ex07;

public class App {
	public static void main(String[] args) {
		String str = "aaabbabbbbbbbaaaaa";
		longestCorrectSub(str);
		shortestCorrectSub(str);
	}

	private static void shortestCorrectSub(String str) {
		int minLen = Integer.MAX_VALUE;
		int start = 0;
		int firstIndex = 0, lastIndex = 0;
		int count = 1;
		for (int i = 0; i < str.length();) {
			start = i;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(j) == str.charAt(i)) {
					count++;
				} else {
					break;
				}
			}
			if (count < minLen) {
				minLen = count;
				firstIndex = start;
			}
			i = i + count;
			count = 1;
		}
		lastIndex = firstIndex + minLen;
		System.out.println("Độ dài nhỏ nhất của dãy con đúng :" + minLen + " " + str.substring(firstIndex, lastIndex)
				+ " [" + firstIndex + "]");
	}

	private static void longestCorrectSub(String str) {
		int maxLen = 1;
		int start = 0;
		int firstIndex = 0, lastIndex = 0;
		int count = 1;
		for (int i = 0; i < str.length();) {
			start = i;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(j) == str.charAt(i)) {
					count++;
				} else {
					break;
				}
			}
			if (count > maxLen) {
				maxLen = count;
				firstIndex = start;
			}
			i = i + count;
			count = 1;
		}
		lastIndex = firstIndex + maxLen;
		System.out.println("Độ dài lớn nhất của dãy con đúng :" + maxLen + " " + str.substring(firstIndex, lastIndex)
				+ " [" + firstIndex + "]");
	}
}
