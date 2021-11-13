package ex04;

import java.util.Scanner;

/**
 * Viết chương trình thực hiện chức năng đăng ký tài khoản
  B1. Nhập tên tài khoản ví dụ byztkhx256
  B2. Nhập mật khẩu admin123
Yêu cầu mật khẩu như sau:
  1. Độ dài mật khẩu: >= 8
  2. Có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)
  3. Không được trùng quá 3 ký tự với tên tài khoản [Đăng ký khi bắt đầu chương trình]
Sau khi đã thỏa mãn yêu cầu thông báo đăng ký tài khoản thành công
 */
public class Ex04 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhập tên tài khoản: ");
		String name = scanner.nextLine();
		System.out.println(name);
		String password = "";
		while(true) {
			System.out.print("Nhập mật khẩu: ");
			password = scanner.nextLine();
			try {
				if(getCheckPassWord(password));
				System.out.println("Đăng ký tài khoản thành công !!!");
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	private static boolean getCheckPassWord(String password) throws Exception {

		if (!password.matches("^.{8,}$"))
			throw new Exception("Độ dài của mật khẩu phải >= 8 !!!");
		
		if (!password.matches("^.*[0-9]+.*$"))
			throw new Exception("Mật khẩu phải có ít nhất 1 chữ số (1,2,3...)!!!");

		if (!password.matches("^.*[A-Z]+.*$"))
			throw new Exception("Mật khẩu phải có ít nhất một kí tự in hoa (A,B,C...)!!!");
		
		if (!password.matches("^.*[^A-Za-z0-9]+.*$"))
			throw new Exception("Mật khẩu phải chứa một kí tự đặc biệt (Ví dụ: ~!@#$%^&*()-_=+|;:,[]{}<>?/)!!!");

	return true;
	}
}
