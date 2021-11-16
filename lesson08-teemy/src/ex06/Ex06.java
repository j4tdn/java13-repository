package ex06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.println("nhap k");
		int k = cs.nextInt();
		k = k + 1;
		if ((k > 0) && (k <= 9)) {
			System.out.println(k);
		} else if (k <= 109) {
			if (k % 2 == 0) {
				System.out.println((k / 10));
			} else {
				System.out.println((k % 10)-2);
			}
		}
	}
}
