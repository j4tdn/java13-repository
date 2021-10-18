package ex02;

import java.util.Scanner;

public class Ex02 {
	
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
		
		if (p.length() < 8) {
			throw new Exception("<EXCEPTION> mat khau it nhat 8 ki tu");
		}
		if (p.length() > 256) {
			throw new Exception("<EXCEPTION> mat khau nhieu nhat 256 ki tu");
		}
		if (p.toUpperCase().equals(p)) {
			throw new Exception("<EXCEPTION> mat khau phai co it nhat 1 ky tu viet thuong");
		}
		if (p.toLowerCase().equals(p)) {
			throw new Exception("<EXCEPTION> mat khau phai co it nhat mot ki tu viet hoa");
		}
		if (!so(p)) {
			throw new Exception("<EXCEPTION> mat khau phai co it nhat 1 so");
		}
		if (!kitu(p)) {
			throw new Exception("<EXCEPTION> mat khau phai co it nhat 1 ky tu dac biet (~!@#$%^&*()_=+[]{}|;:,.<>/?)");
		}
		if (p.contains("chanh") == false) {
			throw new Exception("<EXCEPTION> mat khau phai co ten ban");	
		}
		return p;
	}

	private static boolean kitu(String p) {
		String specialChracter = "~!@#$%^&*()_=+[]{}|;:,.<>/?";
		for (int i = 0; i < specialChracter.length(); i++) {
			if (p.contains("" + specialChracter.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	private static boolean so(String p) {
		for (int i = 0; i < 10; i++) {
			if (p.contains("" +i)) {
				return true;
			}
		}
		return false;
	}

}
