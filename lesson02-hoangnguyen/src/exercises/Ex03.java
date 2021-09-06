package exercises;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = Integer.parseInt(sc.nextLine());

		if (isSymmetricalNumber(number)) {
			System.out.println(number + " is symmetrical number");
		} else {
			System.out.println(number + " is not symmetrical number");
		}

	}

	private static boolean isSymmetricalNumber(int n) {
		int temp, rem;
		int reverse = 0;
		temp = n;

		while (temp != 0) {
			rem = temp % 10;
			reverse = reverse * 10 + rem;
			temp /= 10;
		}

		if (reverse == n) {
			return true;
		} else {
			return false;
		}
	}
}
