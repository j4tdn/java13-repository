package ex04;

/**
 * Viết chương trình thực hiện chức năng đăng ký tài khoản 
 *    B1. Nhập tên tài khoản ví dụ byztkhx256 
 *    B2. Nhập mật khẩu admin123
 * Validation
 * 1. Độ dài mật khẩu: >= 8
 * 2. Có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)
 * 3. Không được trùng nhiều hơn 3 ký tự với tên tài khoản
 */
public class App {
	
	private static final String SPECIAL_LETTERS = "~!@#$%^&*";
	
	public static void main(String[] args) {
		String username = "byztkhx256";
		String password = "adm#iZz@3154";
		
		System.out.println("|||" + username + "|||");
		System.out.println("|||" + password + "|||");
		System.out.println("==============");
		
		boolean isValid = validate(username, password);
		System.out.println("isValid: " + isValid);

	}

	public static boolean validate(String username, String password) {
		return atLeastNLetters(password, 8)
			&& containsDigit(password)
			&& containsUpperLetter(password)
			&& containsSpecialLetter(password)
			&& isExistedLessThanNLetters(password, username, 3);
		
		// if (!atLeastNLetters(password, 8)) return false;
		// if (!containsDigit(password)) return false;
		// if (!containsUpperLetter(password)) return false;
		// if (!containsSpecialLetter(password)) return false;
		// return true;
		
		// return (!a || !b || !c || !d) ? false : true; 
		// return a & b & c & d ? true : false;
	}
	
	private static boolean atLeastNLetters(String string, int n) {
		if (string.length() >= n) return true;
		
		log("At least " + n + " letters !");
		return false;
	}
	
	private static boolean containsDigit(String string) {
		char[] letters = string.toCharArray();
		for (char letter: letters) {
			// TODO: Duplicate code in 3 methods
			if (Character.isDigit(letter)) {
				return true;
			}
		}
		log("At least one digit !");
		return false;
	}
	
	private static boolean containsUpperLetter(String string) {
		char[] letters = string.toCharArray();
		for (char letter: letters) {
			if (Character.isUpperCase(letter)) {
				return true;
			}
		}
		log("At least one upper letter !");
		return false;
	}
	
	private static boolean containsSpecialLetter(String string) {
		char[] letters = string.toCharArray();
		for (char letter: letters) {
			if (SPECIAL_LETTERS.contains("" + letter)) {
				return true;
			}
		}
		log("At least one special letter !");
		return false;
	}
	
	// s1 letters are existed max N letters in s2
	private static boolean isExistedLessThanNLetters(String s1, String s2, int n) {
		int existedLetters = 0;
		StringBuilder sb = new StringBuilder(); 
		for (int i = 0; i < s1.length(); i++) {
			String letter = "" + s1.charAt(i);
			if (s2.contains(letter)) {
				existedLetters++;
				sb.append(letter);
				if (existedLetters == n) {
					log("Password appears greater than or equals " + n + " letters in username");
					log("DupCode: " + sb);
					return false;
				}
			}
		}
		return true;
	}
	
	private static void log(String text) {
		System.out.println(text);
	}
}
