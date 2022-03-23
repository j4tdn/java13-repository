package Ex03;

public class App {
	public static void main(String[] args) {
		boolean result = isAnagram("Word", "odrW");
		System.out.println(result);

		System.out.println("=======================");

		// và trường hợp có thể số lượng ký tự bằng nhau như aaaavvvv đều có 4 ký tự a chưa xử lý
		char c = counting("aaaavvvjjjj");
		System.out.println(c);
	}

	private static char counting(String s) {

		int count[] = new int[256];

		int len = s.length();
		for (int i = 0; i < len; i++)
			count[s.charAt(i)]++;

		int max = Integer.MIN_VALUE;
		char result = ' ';

		for (int i = 0; i < len; i++) {
			if (max < count[s.charAt(i)]) {
				max = count[s.charAt(i)];
				result = s.charAt(i);
			}
		}

		return result;

	}

	public static boolean isAnagram(String s1, String s2) {
		if (s1 == null || s2 == null || s1.length() != s2.length()) {
			return false;
		}

		// Solution này a dùng để kiểm tra 2 chuỗi có đối xứng không
		// Còn để bài là anagram, là cùng số lượng ký tự còn xuất hiện ở đâu cũng được cả
		int len = s1.length();
		for (int i = 0; i < len; i++) {
			if (s1.charAt(i) != s2.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
