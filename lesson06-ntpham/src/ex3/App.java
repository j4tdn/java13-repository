package ex3;

import java.util.Scanner;

/**
 *
	Viết chương trình cho phép nhập địa chỉ email từ bàn phím. Kiểm tra email nếu không
	hợp lệ thì thông báo lỗi vào yêu cầu nhập lại cho đến khi hợp lệ và in ra. Thông tin định dạng
	email hợp lệ mô tả như sau
 *
 */
public class App {
	public static void main(String[] args) {
		
	}
	
	public static String enterEmail() throws Exception{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your email:");
		String email = input.nextLine();
		input.close();
		if (!email.contains("@")) throw new Exception("ERROR!! Email has symbol '@'");
		String prefix = email.substring(0, email.indexOf("@"));
		String domain = email.substring(email.indexOf("@") + 1, email.length());
		if (prefix.equals("")) throw new Exception("ERROR!! The prefix is empty. Email must have prefix");
		if (domain.equals("")) throw new Exception("ERROR!! The domain is empty. Email must have domain");
		if (isHasUnAllowedCharacter(prefix)) 
			throw new Exception("ERROR!! The prefix has unallowed character");
		if (isPrefixStartWithSpecialCharacter(prefix)) 
			throw new Exception("ERROR!! The prefix must not start with special character");
		if (isPrefixEndtWithSpecialCharacter(prefix)) 
			throw new Exception("ERROR!! The prefix must not end with special character");
		for (int i = 1; i < email.length() - 1; i++) {
			if (isValidSpecialCharacter(email.charAt(i))) {
				if (isValidSpecialCharacter(email.charAt(i + 1))) 
					throw new Exception("ERROR!! An underscore, period, or dash must be followed by one or more letter or number");
			}
		}
		if (!domain.contains("mail.com")) throw new Exception("ERROR!! Domain must have format \"*mail.com\"");
		return email;
	}
	
	public static boolean isPrefixStartWithSpecialCharacter(String prefix) {
		if (isValidSpecialCharacter(prefix.charAt(0))) return false;
		return true;
	}
	
	public static boolean isPrefixEndtWithSpecialCharacter(String prefix) {
		if (isValidSpecialCharacter(prefix.charAt(prefix.length() - 1))) return false;
		return true;
	}
	
	public static boolean isHasUnAllowedCharacter(String prefix) {
		for (int i = 0; i < prefix.length(); i++) {
			if (!isValidCharacter(prefix.charAt(i))) return true;
		}
		return false;
	}
	
	public static boolean isValidCharacter(char character) {
		if (!Character.isLetterOrDigit(character) && !isValidSpecialCharacter(character))
			return false;
		return true;
	}
	
	public static boolean isValidSpecialCharacter(char specialChar) {
		if (specialChar  == '_' || specialChar == '.' || specialChar == '-') 
			return true;
		return false;
	}
}
