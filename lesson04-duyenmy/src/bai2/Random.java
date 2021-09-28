package bai2;

import java.util.Scanner;

public class Random {

	static int n;

	// int các phần tử của mảng
	static void In(int[] arr, int m) {
		for (int i = 0; i < m; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	public static void main(String[] args) {
		int k = 0, b = 0, c = 0, j = 0, m = 0, q = 0;
		Random rd = new Random();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập số phần tử : ");
		n = scanner.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			double randomDouble = Math.random();
			randomDouble = randomDouble * 1000 + 1;
			arr[i] = (int) randomDouble;
		}
//tìm số lượng phần tử cho các mảng
		for (int i = 0; i < n; i++) {
			if (arr[i] % 7 == 0) {
				if (arr[i] % 5 == 0) {
					// System.out.println("vua chia het cho 5 &7");
					b++;
				} else {
					// System.out.println("Chi chia het cho 7");
					k++;
				}
			} else {
				if (arr[i] % 5 == 0) {
					// System.out.println("chi chia het cho 5 ");
					c++;
				} else {
					// System.out.println("ko chia het cho 7 & 5");
					b++;
				}
			}

		}
//mảng chứa các phần tử chia hết cho 7
		int[] arr1 = new int[k];

		for (int i = 0; i < n; i++) {

			if (arr[i] % 7 == 0) {
				if (arr[i] % 5 != 0) {
					arr1[j] = arr[i];
					j++;
				}
			}
		}

		In(arr1, k);

		// mảng chưa các phần tử vừa chia hết cho cả 5&7 vừa ko chia hết cho cả 5&7
		int[] arr2 = new int[b];
		for (int i = 0; i < n; i++) {

			if (arr[i] % 7 == 0) {
				if (arr[i] % 5 == 0) {
					arr1[m] = arr[i];
					m++;
				}
			} else {
				if (arr[i] % 5 != 0) {
					arr2[m] = arr[i];
					m++;
				}
			}
		}
		// mảng chứa các phần tử chỉ chia hết cho 5
		int[] arr3 = new int[c];

		for (int i = 0; i < n; i++) {

			if (arr[i] % 5 == 0) {
				if (arr[i] % 7 != 0) {
					arr3[q] = arr[i];
					q++;
				}
			}
		}
//in theo thứ tự
		In(arr1, k);
		In(arr2, b);
		In(arr3, c);

	}

}
