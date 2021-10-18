package lesson06;

import java.util.Scanner;

/*
 * Bài 2: Viết chương trình kiểm tra tính hợp lệ của mật khẩu khi đăng ký tài khoản.
 * Mật khẩu phải thỏa mãn các điều kiện sau đây. Lặp lại các bước kiểm tra cho đến khi 
 * đăng ký tài khoản thành công
 * Nếu thông tin nhập vào không hợp lệ sẽ ném ra các ngoại lệ, lỗi tương ứng, 
 * sau đó thông báo cho người dùng biết và cho phép nhập lại.
 */
public class Ex02 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String password = "";
		while(true) {
			System.out.print("Enter password: ");
			password = scanner.nextLine();
			try {
				if(getCheckPassWord(password));
				System.out.println("Register password success");
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("PassWord: " + password);
	}
	private static boolean getCheckPassWord(String password) throws Exception {
		
		if (!password.matches("^.*[a-z]+.*$"))
			throw new Exception("Password must have at least 1 lowercase alphabetic character (a,b,c...)!!!");
		
		if (!password.matches("^.*[A-Z]+.*$"))
			throw new Exception("Password must have at least 1 uppercase alphabetic character (A,B,C...)!!!");
		
		if (!password.matches("^.*[0-9]+.*$"))
			throw new Exception("Password must have at least 1 number (1,2,3...)!!!");
		
		if (!password.matches("^.*[^A-Za-z0-9]+.*$"))
			throw new Exception("Password must have at least 1 special character (Example: ~!@#$%^&*()-_=+|;:,[]{}<>?/)!!!");
		
		if (!password.matches("^.{8,256}$"))
			throw new Exception("Password must have at least 8 characters and at most 256 characters (8 - 256 characters)!!!");
		
	return true;
	}
	
}
