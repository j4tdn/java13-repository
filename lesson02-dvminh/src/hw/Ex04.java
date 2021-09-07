package hw;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("nhap so cac phan tu: ");
		int n = ip.nextInt();
		
		System.out.println("nhap day so : ");
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] =  ip.nextInt();
		}
		ex04(a);
	}
	private static void ex04(int[] input) {
		int max = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 2 != 0 && input[i] > max) {
				max = input[i];
			}
		}
		if (max == 0) {
			System.out.println("khong co so le nao!");
		} else {
			System.out.println(max);
		}
	}

}
