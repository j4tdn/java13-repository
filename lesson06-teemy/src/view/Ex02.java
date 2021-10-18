package view;
/*
 * Bài 2: Viết chương trình kiểm tra tính hợp lệ của mật khẩu khi đăng ký tài khoản
Mật khẩu phải thỏa mãn các điều kiện sau đây. Lặp lại các bước kiểm tra điều kiện cho đến khi
đăng ký tài khoản thành công.


 *da nhan biet duoc cac loi nhung chuwa lap lai den khi dung duoc
 */

import java.util.Scanner;

public class Ex02 {
	static String check() {
		Scanner sc = new Scanner(System.in);

		System.out.println("nhap mat khau");
		String st = sc.nextLine();
		if (st.length() < 8) {
			throw new ArithmeticException("less than 8 character");
		}
		if (st.length() > 256) {
			throw new ArithmeticException("more 256 character");
		}
		int dem = 0, dem1 = 0, dem2 = 0;
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) >= 'A' && st.charAt(i) <= 'Z') {
				dem++;
			}
			if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
				dem1++;
			}
			if (st.charAt(i) >= '0' && st.charAt(i) <= '9') {
				dem2++;
			}

		}
		if (dem == 0) {
			throw new ArithmeticException("less than 1 uppercase alphabetic");
		}
		if (dem1 == 0) {
			throw new ArithmeticException("less than 1 lowercase alphabetic");
		}
		if (dem2 == 0) {
			throw new ArithmeticException("less than 1 number");
		}
		String s = "~!@#$%^&*()-_=+[]{};:,.<>/?";
		dem = 0;
		for (int i = 0; i < s.length(); i++) {
			int vt = st.indexOf(s.charAt(i));
			if (vt != -1) {
				dem++;
			}
		}
		if (dem == 0) {
			throw new ArithmeticException("less than 1 special character");
		}
		return st;
	}

	public static void main(String[] args) {
		boolean check = true;
		do {
			String pass = check();
			System.out.println(pass);
			check = false;
		} while (check);

	}
}
