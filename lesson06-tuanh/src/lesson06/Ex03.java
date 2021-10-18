package lesson06;

import java.util.Scanner;

/*
 * Bài 3: Viết chương trình cho phép nhập địa chỉ từ bàn phím. Kiểm tra email
 * nếu không hợp lệ thì thông báo lỗi và yêu cầu nhập lại cho đến khi hợp lệ và in ra.
 */
public class Ex03 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String emailAddress = "";
		while(true) {
			System.out.print("Enter email address: ");
			emailAddress = scanner.nextLine();
			try {
				if(getCheckEmailAddress(emailAddress));
				System.out.println("Email Address: " + emailAddress);
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private static boolean getCheckEmailAddress(String emailAddress) throws Exception {
		/*
		 * ^: Bắt đầu và $: kết thúc >> của 1 chuỗi regex
		 * \\w+ : có một hoặc nhiều chữ cái
		 * [a-z0-9] : có thể có chữ cái thường và số
		 * *: có một hoặc nhiều.
		 * @: định dạng trong mail phải có @
		 * mail.com: định dạng mail phải có mail.com
		 */
		if (!emailAddress.matches("^\\w+[a-z0-9]*@\\w+mail.com$"))
			throw new Exception("Email Adress Incorrect!!!");
		return true;
	}
}
