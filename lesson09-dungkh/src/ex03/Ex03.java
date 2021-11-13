package ex03;

public class Ex03 {
	public static void main(String[] args) {
		String input = "Welcome to JAVA10 class";
		revertString(input);
	}

	private static String revertString(String input) {
		String string = input;
		string = string.replaceAll("[,\\s]+", " ").trim();
		String[] words = string.split(" ");
		string = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revertWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				revertWord += word.charAt(j);
			}
			string = string + revertWord + " ";
		}
		System.out.println(string);

		return string;
	}
}
