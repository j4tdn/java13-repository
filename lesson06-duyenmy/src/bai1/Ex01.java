package bai1;

import java.util.Scanner;

public class Ex01 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a, b;
		double nghiem;
		System.out.println("Giải phương trình ax+b !!");
		while (true) {
			try {
				System.out.println("Nhap a: ");
				a = Integer.parseInt(sc.nextLine());
				;
				System.out.println("Nhap b: ");
				b = Integer.parseInt(sc.nextLine());
				;

				nghiem = thuong(a, b);
				System.out.println("Phuong trinh có nghiem -b/a = " + nghiem);
				break;

			} catch (NumberFormatException e) {
				System.out.println("Loi!! Hay nhap vao mot so!!! ");
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static double thuong(int a, int b) {
		if (a == 0) {
			throw new ArithmeticException("Loi!! Hay nhap a khac 0!!!");
		}
		return -b / a;
	}
}
