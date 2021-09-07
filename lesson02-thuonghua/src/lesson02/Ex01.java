package lesson02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap so can kiem tra: ");
		int a = ip.nextInt();

		check(a);
	}

	private static void check(int a) {
		double loga = Math.log(a) / Math.log(2);
		int logi = (int) (Math.floor(loga));
		if (loga - logi == 0) {
			System.out.println(a + " la luy thua cua 2");
		} else {
			System.out.println(a + " khong la luy thua cua 2");
		}
	}
}
