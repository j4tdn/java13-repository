package ex03;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {

		String pass = "";
		while (true) {
			System.out.print("nhap password: ");
			try {
				pass = enterPassword();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Password la: " + pass);
	}
	
public static String enterPassword() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		String p = sc.nextLine();
		
		if (kitu(p.charAt(0)) ) {
			throw new Exception("<EXCEPTION> ki tu dau tien khong dc la ki tu dac biet");
		}
		if (test(p)) {
			throw new Exception("<EXCEPTION> truoc @ phai la 1 ky tu alphabetic");
		}
		if (p.toUpperCase().equals(p)) {
			throw new Exception("<EXCEPTION> mat khau phai co it nhat 1 ky tu viet thuong");
		}
		if (p.toLowerCase().equals(p)) {
			throw new Exception("<EXCEPTION> mat khau phai co it nhat mot ki tu viet hoa");
		}
		
		return p;
	}
		
	private static boolean kitu(char p) {
		String specialChracter = "~!@#$%^&*()_=+[]{}|;:,.<>/?";
		for (int i = 0; i < specialChracter.length(); i++) {
		if (p == specialChracter.charAt(i)) {
			return true;
		}
	}
		return false;
	}
	
	private static boolean test (String p) {

		for (int i=0; i < p.length(); i++) {
			if ('@' == p.charAt(i)) {
				if (kitu(p.charAt(i-1))) {
					return true;
				}
			}
		}
		return false;
	}


}
