package ex01;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		float a = 0;
		float b = 0;
		do {
			try {
				System.out.println("Nhập hệ số a, b cho phương trình: ax + b = 0 (a,b € R; a # 0) ");
				System.out.print("Nhập a: ");
				a = Float.parseFloat(ip.nextLine());
				System.out.print("Nhập b: ");
				b = Float.parseFloat(ip.nextLine());
				IsNumber(a);
				System.out.println("Nghiệm của phương trình là: " + -b / a);
				break;
			} catch (Exception e) {
				System.out.println("Nhập sai, nhập lại: ");
			}

		} while (true);
	}

	private static boolean IsNumber(float a) throws Exception {
		if (a == 0) {
			throw new Exception();
		} else {
			return true;
		}
	}
}