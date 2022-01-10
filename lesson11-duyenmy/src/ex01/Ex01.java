package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập số lẻ:");
		int n = sc.nextInt();
		print(n);
	}

	private static void print(int n) {
		int tmp = (n + 1) / 2;
		if (n % 2 == 1) {
			for (int i = 1; i < n + 1; i++) {
				for (int j = 1; j < n + 1; j++) {

					if (i < tmp) {
						if (j > i && j < (n - i + 1)) {
							System.out.print("  ");
						} else {
							System.out.print(j + " ");
							if (j == n) {

								System.out.println("\n");
							}
						}
					}
					if (i == tmp) {
						System.out.print(j + " ");
						if (j == n) {
							System.out.println("\n");
						}
					}
					if (i > tmp) {
						if (j < i && j > (n - i + 1)) {
							System.out.print("  ");
						} else {
							System.out.print(j + " ");
							if (j == n) {

								System.out.println("\n");
							}
						}

					}

				}
			}
		} else {
			System.out.println("Hãy nhập số lẻ, đừng nhập số chẵn.");
		}
	}
}
