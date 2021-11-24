package execier09;

import javax.sound.midi.Soundbank;

/**
 * Viết chương trình thực hiện chức năng đăng ký tài khoản 
 *    B1. Nhập tên tài khoản ví dụ byztkhx256 
 *    B2. Nhập mật khẩu admin123
 * Validation
 * 1. Độ dài mật khẩu: >= 8
 * 2. Có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)
 * 3. Không được trùng nhiều hơn 3 ký tự với tên tài khoản
 */
public class Ex04 {

	public static void main(String[] args) {
		String username = "byztkhx256";
		String password = "Abyzzi@N123";
		
		System.out.println(password);
		System.out.println("================");
		
		boolean result = validate(username, password);
		System.out.println("result: " + result);
		
	}
	private static boolean validate( String username, String password) {
		//if(!atLeastNLetters(password, 8)) return false;
		//if(!containDigit(password))return false;
		//if(!containUpper(password))return false;
		//if(!containSpecialLetter(password))return false;
		
		
		return atLeastNLetters(password, 8)
			&& containDigit(password)
			&&containUpper(password)
			&&containSpecialLetter(password)
		    &&isExistedLessThanNLetters( username,password, 3);
	}
	private static void log(String text) {
		System.out.println(text);
	}
	private static boolean atLeastNLetters(String string,int n) {
		if(string.length() >= n) return true;
		
		log("không đủ 8 kí tự !!!");
		return false;		
	}
	private static boolean containDigit(String string) {
		char [] letters = string.toCharArray();
		for (char letter : letters ) {
			if(Character.isDigit(letter)) return true;
		}
		log("Không có 1 kí tự là số !!!");
		return false;
	}
	private static boolean containUpper(String string) {
		char [] letters = string.toCharArray();
		for (char letter : letters ) {
			if(Character.isUpperCase(letter)) return true;
		}
		log("Không có 1 kí tự viết hoa !!!");
		return false;
	}
	private static boolean containSpecialLetter(String string) {
		String special = "~!@#$%^&*";
		char [] letters = string.toCharArray();
		for (char letter : letters ) {
			if(special.contains(""+letter)) return true;
		}
		log("Không có 1 kí tự đặt biệt !!!");
		return false;
	}
	private static boolean isExistedLessThanNLetters(String s1,String s2 , int n) {
		int existedLetters = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0;i < s2.length();i++) {
			String letter = ""+s2.charAt(i);
			if(s1.contains(letter)) {
				existedLetters++;
				sb.append(letter);
				if (existedLetters == n) {
					log("Password tồn tại nhiều hơn hoặc bằng " + n + " trong username");
					log("Trùng :" + sb);
					return false;
				}
			}
		}
		return true;
	}
//	private static boolean isExistedLessThanNLetters(String s1, String s2, int n) {
//		int existedLetters = 0;
//		StringBuilder sb = new StringBuilder(); 
//		for (int i = 0; i < s2.length(); i++) {
//			String letter = "" + s2.charAt(i);
//			if (s1.contains(letter)) {
//				existedLetters++;
//				sb.append(letter);
//				if (existedLetters == n) {
//					log("Password appears greater than or equals " + n + " letters in username");
//					log("DupCode: " + sb);
//					return false;
//				}
//			}
//		}
//		return true;
//	}
	
}
