package ex04;

public class App {

	public static void main(String[] args) {
		String username = "byztkhx256";
		String password = "aDmi@n123456";

		boolean isValid = validate(username, password);
		System.out.println("isValid: " + isValid);
	}

	public static boolean validate(String username, String password) {

//		if (!atLeastNLetters(password, 8))
//			return false;
//		if (!containsDigit(password))
//			return false;
//		if (!containsUpperLetter(password))
//			return false;
//		if (!containsSpecialLetter(password))
//			return false;
//		return true;
		
		return atLeastNLetters(password, 8)
			&& containsDigit(password)
			&& containsUpperLetter(password)
			&& containsSpecialLetter(password)
			&& isExistedLessThanNLetters(username, password, 3);
	}
	
	private static boolean isExistedLessThanNLetters(String username, String password, int n) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for (char letter : password.toCharArray()) {
			if (username.contains(letter + "")) {
				count++;
				sb.append(letter);
				if (count == n) {
					log("Password must not be contains 3 letter same with username");
					System.out.println("Duplicated: " + sb);
					return false;
				}
			}
		}

		return true;
	}

	private static boolean containsDigit(String string) {
		for (char letter : string.toCharArray()) {
			if (Character.isDigit(letter)) {
				return true;
			}
		}
		log("At least one digit !");

		return false;
	}

	private static boolean containsUpperLetter(String string) {
		for (char letter : string.toCharArray()) {
			if (Character.isUpperCase(letter)) {
				return true;
			}
		}
		log("At least one upper letter !");

		return false;
	}

	private static boolean containsSpecialLetter(String string) {
		String specialLetters = "~!@#$%^&*";
		for (char letter : string.toCharArray()) {
			if (specialLetters.contains(letter + "")) {
				return true;
			}
		}
		log("At least one special letter !");

		return false;
	}

	private static boolean atLeastNLetters(String string, int n) {
		if (string.length() >= n) {
			return true;
		} else {
			log("At least " + n + " letters");
			return false;
		}
	}

	private static void log(String text) {
		System.out.println(text);
	}
}
