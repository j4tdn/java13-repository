package ex02;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		String input1 = "sdf05232sdf3s25d3fs5df3s5df3s5df";
		String input2 = "aa6b326c6e22h";

		String[] digits = { input1, input2 };

		for (String digit : digits) {
			String[] output = digit.split("[a-z]+");
			System.out.println(showText(output));
		}
	}

	private static int showText(String[] elements) {
		int max = 0;
		for (String word : elements) {
			if (!word.isEmpty()) {
				max = Integer.MIN_VALUE;
				if (elements.length == 1) {
					return 0;
				}
				for (String str : elements) {
					if (!str.isEmpty()) {
						int number = Integer.parseInt(str);
						if (max < number) {
							max = number;
						}
					}
				}
			}
		}
		return max;
	}
}