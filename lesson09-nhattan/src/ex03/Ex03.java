package ex03;

public class Ex03 {
	public static void main(String[] args) {
		String s = "Welcome  to JAVA10   class";
		System.out.println(revert(s));
	}

	private static String revert(String s) {

		String[] words = s.trim().replaceAll("[\\s]+", " ").split("\\s");

		String temp = "";

		for (int i = 0; i <= words.length - 1; i++) {
			temp = temp + revertWord(words[i]);
		}

		return temp;
	}

	private static String revertWord(String s) {
		byte[] strAsByte = s.getBytes();

		byte[] result = new byte[strAsByte.length];

		for (int i = s.length() - 1; i >= 0; i--) {
			result[strAsByte.length - i - 1] = strAsByte[i];
		}
		return new String(result);
	}
}
