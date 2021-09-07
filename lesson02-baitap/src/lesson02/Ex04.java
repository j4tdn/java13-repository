package lesson02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int max = 0;
		int a[] = new int[10];
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap 10 phan tu cua mang: ");
		for (int i = 0; i < 10; i++) {
			a[i] = ip.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				if (max < a[i]) {
					max = a[i];
				}
			}
		}
		System.out.println(max);
	}
}
