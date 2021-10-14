package ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Bài 1: Giải phương trình bậc nhất ax + b = 0 . Các hệ số nhập vào từ bàn
 * phím. Sử dụng try - catch để bẫy các lỗi khi nhập sai kiểu dữ liệu, ví dụ
 * nhập số nhưng nhập chữ. Bẫy lỗi chia 0, trường hợp xảy ra lỗi phải thông báo
 * cho người dùng biết và nhập lại đến khi a b hợp lệ thì in ra kết qua x = -b/a
 * 
 * @author tranc
 *
 */
public class Main {
	public static void main(String[] args) {
		do {
			double a = enterNumber("a");
			double b = enterNumber("b");
			try {
				System.out.println(a + "*x + " + b + " = 0 => x = " + -(divide(a, b)));
				break;
			} catch (ArithmeticException ex) {
				System.out.println(ex.getMessage());
			}
		} while (true);
	}

	private static double divide(double a, double b) {
		if (b == 0d) {
			throw new ArithmeticException("<<EXCEPTION>> Divide by 0!!!");
		}
		return b / a;
	}

	public static double enterNumber(String varName) {
		Scanner sc = new Scanner(System.in);
		double var = 0d;
		do {
			try {
				System.out.print(">> Input " + varName + ": ");
				var = Double.parseDouble(sc.nextLine());
				break;
			} catch (Exception ex) {
				System.out.println("<<EXCEPTION>> Please input a number!!!");
			}
		} while (true);

		return var;

	}
}
