package exercises;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = Integer.parseInt(sc.nextLine());

		if (isPowOf2(n)) {
			System.out.println(n + " is power of 2");
		} else {
			System.out.println(n + " is not power of 2");
		}
	}

	private static boolean isPowOf2(int n) {

		if (n == 0 || n == 1) {
			return true;
		}
		int x = n / 2;
		int y = n % 2;
		if (y == 1) {
			return false;
		}
		return isPowOf2(x);
	}
}