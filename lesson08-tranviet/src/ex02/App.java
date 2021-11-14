package ex02;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
	//	String str = "tRAn    CONG    viET";
		while (true) {
			System.out.print("Nhập vào họ và tên: ");
			str = sc.nextLine();
			try {
				if (isValid(str)) {
					break;
				}
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}

		}
		System.out.println("Trước khi biến đổi: ");
		System.out.println("Họ và tên: " + str);
		String str1 = upcaseFirstCharacterOfWord(str);
		//String str2 = removedAbundantSpaces(str1);
		System.out.println("Sau khi biến đổi: ");
		System.out.println("Họ và tên: " + str1);
		sc.close();
	}

	private static String upcaseFirstCharacterOfWord(String str) {
		str = str.toLowerCase();
		String[] words = str.split("[\\s]+");
		String newString = "";
		for (String i : words) {
			i = i.replace(i.charAt(0), Character.toUpperCase(i.charAt(0)));
			newString = newString.concat(i + " ");
		}
		return newString.trim();
	}

	private static boolean isValid(String str) {
		String form = "[a-zA-Z\\s]+";
		if (!str.matches(form)) {
			return false;
		}
		return true;
	}
	
	private static String removedAbundantSpaces(String str) {
		return str.trim().replaceAll("[\\s]+", " ");
	}
}
