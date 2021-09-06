package exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.println("Enter number of array: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n == 0);

		inputNumbers(n);

	}

	private static void inputNumbers(int n) {
		Random rd = new Random();
		int[] numbers = new int[n];
		int i = 0;

		do {
			boolean check = true;
			numbers[i] = rd.nextInt(11) + 20;
			System.out.println("numbers[" + i + "]" + numbers[i]);

			for (int j = i - 1; j >= 0; j--) {
				if (numbers[j] == numbers[i]) {
					System.out.println("Phần tử nhập đã bị trùng");
					check = false;
					break;
				}
			}

			if (check == false) {
				continue;
			} else {
				i++;
			}

		} while (i < n);
	}
}
