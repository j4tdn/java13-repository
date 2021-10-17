package baitap;

import java.util.Scanner;

/*
 * Giải phương trình bậc nhất ax + b = 0 . 
 * Các hệ số nhập vào từ bàn phím. Sử dụng try - catch để bẫy các lỗi khi nhập sai kiểu dữ liệu, 
 * ví dụ nhập số nhưng nhập chữ. Bẫy lỗi chia 0,
 * trư�?ng hợp xảy ra lỗi phải thông báo cho ngư�?i dùng biết và nhập lại 
 * đến khi a b hợp lệ thì in ra kết qua x = -b/a
 */
public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b;
		while (true) {
			try {
				System.out.println("Enter number A:");
				a = Double.parseDouble(input.nextLine());
				System.out.println("Enter number B: ");
				b = Double.parseDouble(input.nextLine());
//				System.out.println(a + "*x + " + b + " = 0");
				System.out.println("x = " + divide(a, b));
				break;
			} catch (NumberFormatException e) {
				System.out.println("Message: input must be a number! Please enter data again! ");
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			
		}	
			
	}	
	
	private static double divide(double a, double b) {
		if(a == 0) {
			throw new ArithmeticException("-- Errorr: divide by 0 --");
		}
		return - b / a;
	}
	
	
}
