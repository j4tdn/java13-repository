package exercises;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input number and n: ");
		int number = Integer.parseInt(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());

		String result = convert(number, n);
		System.out.print("Giá trị " + number + " chuyển từ hệ 10 sang hệ " + n + " : ");
		printResult(result);
	}

	private static String convert(int number, int n) {
		String result = "";
		int x = 0;
		while (number > 0) {
			x = number % n;
			number = number / n;
			if (n == 16) {
				if (x == 10)
					result += "A";
				if (x == 11)
					result += "B";
				if (x == 12)
					result += "C";
				if (x == 13)
					result += "D";
				if (x == 14)
					result += "E";
				if (x == 15)
					result += "F";
				if (x >= 0 && x < 10)
					result += x;
			} else {
				result += x;
			}
		}
		return result;
	}

	private static void printResult(String str) {

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(str.length() - i - 1));
			System.out.print("");
		}
	}

}
