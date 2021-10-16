package ex1;

import java.util.Scanner;

/**
 * 
	Giải phương trình bậc nhất ax + b = 0 . Các hệ số nhập vào từ bàn phím. Sử dụng try -
	catch để bẫy các lỗi khi nhập sai kiểu dữ liệu, ví dụ nhập số nhưng nhập chữ. Bẫy lỗi chia 0,
	trường hợp xảy ra lỗi phải thông báo cho người dùng biết và nhập lại đến khi a b hợp lệ thì in ra
	kết qua x = -b/a
 *
 */

public class App {
	public static void main(String[] args) {
		do {
			double a = enterNumber("a");
			double b = enterNumber("b");
			try {
				System.out.println(a + " + " + b + "x = 0");
				System.out.println("=>> x = " + -(division(b, a)));
				break;
			} catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		} while(true);
	}
	
	public static double division(double a, double b) {
		if (b == 0d) throw new ArithmeticException("Error!! Divide by 0!");
		return a / b;
	}
	
	
	public static double enterNumber(String varName) {
		Scanner input = new Scanner(System.in);
		double output = 0d;
		do {
			try {
				System.out.println(">> Input " + varName + ":");
				output = Double.parseDouble(input.nextLine());
				break;
			} catch(Exception e) {
				System.out.println("ERROR!! Please input the number!");
			}
		} while(true);
		input.close();
		return output;
	}
}
