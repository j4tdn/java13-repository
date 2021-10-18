package view;
/*
 * Bài 1: Giải phương trình bậc nhất ax + b = 0 . Các hệ số nhập vào từ bàn phím.
 *  Sử dụng try - catch để bẫy các lỗi khi nhập sai kiểu dữ liệu, ví dụ nhập số nhưng nhập chữ. 
 *  Bẫy lỗi chia 0,  trường hợp xảy ra lỗi phải thông báo cho người dùng biết và nhập lại đến khi a b 
 *  hợp lệ thì in ra  kết qua x = -b/a 

 */

import java.time.Year;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		int a = 0;
		int b;
		do {
			try {
				a = CheckInput();
				b = CheckInput();
				int check=-b/a;
				System.out.println((-(float) b / (float) a));
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (a == 0);
	}

	private static int CheckInput() {
		int a = 0;
		boolean check = true;
		do {
			System.out.println("nhap(a/b)/nhap lai:");
			try {
				a = Integer.parseInt(ip.nextLine());
				check = false;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (check == true);
		return a;
	}
}
