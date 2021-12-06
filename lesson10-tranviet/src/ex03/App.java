package ex03;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
		System.out.print("Strings: ");
		log(strings);

		System.out.print("Tăng dần: ");
		sort(strings, (int a, int b) -> a > b);
		log(strings);

		System.out.print("Giảm dần: ");
		sort(strings, (int a, int b) -> a < b);
		log(strings);
	}

	private static void log(String[] strings) {
		System.out.println(Arrays.toString(strings));
		System.out.println("\n=====================================\n");
	}

	private static void sort(String[] str, Strategy s) {
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length - 1 - i; j++) {
				if (s.check(priority(str[j]), priority(str[j + 1]))) {
					swap(str, j, j + 1);
				}
			}
		}
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length - 1 - i; j++) {
				if (priority(str[j]) == priority(str[j + 1]) && str[j] != null && !"Specials".equals(str[j])) {
					if (isDigit(str[j])) {
						if (s.check(Integer.parseInt(str[j]), Integer.parseInt(str[j + 1]))) {
							swap(str, j, j + 1);
						}
					} else {
						if (s.check(Character.getNumericValue(str[j].charAt(0)),
								Character.getNumericValue(str[j + 1].charAt(0)))) {
							swap(str, j, j + 1);
						}
					}
				}
			}
		}
	}

	private static int priority(String s) {
		int priority = 0;
		if ("Special".equals(s)) {
			priority = 1;
		} else if (isDigit(s)) {
			priority = Integer.parseInt(s) < 0 ? 2 : 3;
		} else if (s == null) {
			priority = 5;
		} else {
			priority = 4;
		}
		return priority;
	}

	private static boolean isDigit(String s) {
		try {
			Integer.parseInt(s);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}

	private static void swap(String[] strings, int i, int j) {
		String tmp = strings[i];
		strings[i] = strings[j];
		strings[j] = tmp;
	}
}
