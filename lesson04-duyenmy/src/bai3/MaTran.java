package bai3;

import java.util.Scanner;

public class MaTran {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Nhập n: ");

	int n = Integer.parseInt(scanner.nextLine());
	int arr[][] = new int[n + 1][n + 2];
	for (int i = 0; i <= n; i++) {
		for (int j = 0; j <= i + 1; j++) {
			if (j == 0 || j == i + 1) {
				arr[i][j] = 1;
				System.out.printf("%-8d", arr[i][j]);
			} else {
				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				System.out.printf("%-8d", arr[i][j]);
			}
		}
		System.out.println();
	}
}
}

