package lesson06;

import java.util.Scanner;

/*
 * Bài 1: Giải phương trình bậc nhất ax + b = 0. Các hệ số nhập vào từ bàn phím. 
 * Sử dụng try-catch để bẫy các lỗi khi nhập sai kiểu dữ liệu, ví dụ nhập số nhưng nhập chữ.
 * Bẫy lỗi chia 0, trường hợp xảy ra lỗi phải thông báo cho người dùng biết và nhập lại 
 * đến khi a b hợp lệ thì in ra kết quả x = -b/a
 */

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		double x = 0;
		
		while (true) {
			try {
				System.out.print("Enter number of a: ");
				a = Integer.parseInt(ip.nextLine());
				System.out.print("Enter number of b: ");
				b = Integer.parseInt(ip.nextLine());
				System.out.println("Equation: " + a + "x + " + b + " = 0");
				x = divide(a,b);
				System.out.println("The solution of the equation is: " + x);
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (ArithmeticException e) {
				e.printStackTrace();
			} 
		}
		System.out.println("Back to the MAIN method ");
	}
	
	// Hàm ném ngoại lệ chia cho 0
	private static float divide(float a, float b) throws ArithmeticException{
		if (a == 0) {
			throw new ArithmeticException("Devide by Zero");
		}
		return -b/a;
	}
	
}

