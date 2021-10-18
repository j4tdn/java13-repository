package ex01;
/*
 * Bài 1: Giải phương trình bậc nhất ax + b = 0 . Các hệ số nhập vào từ bàn phím.
 *  Sử dụng try - catch để bẫy các lỗi khi nhập sai kiểu dữ liệu, ví dụ nhập số nhưng nhập chữ.
 *  Bẫy lỗi chia 0,  trường hợp xảy ra lỗi phải thông báo
 *  cho người dùng biết và nhập lại đến khi a b hợp lệ thì in ra  kết qua x = -b/a 

 */

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("nhap a:");
		int a = input();
		System.out.print("nhap b:");
		int b = input();
		
		try {
			System.out.println("nghiem cua phuong la: " + - b / a);

		} catch (ArithmeticException e) {
			if(a == 0 && b == 0) {
				System.out.println("phuong trinh vo so nghiem!");
			} else {
				System.out.println("phuong trinh vo nghiem!");
			}
		}
	}
	
	private static int input() {
		Scanner ip = new Scanner(System.in);
		int input = 0;
		while(true) {
			try {
				input = Integer.parseInt(ip.nextLine());
				break;
				
			} catch (NumberFormatException e) {
				System.out.print("nhap lai so nguyen");
			}
		}
		return input;
	}
}
