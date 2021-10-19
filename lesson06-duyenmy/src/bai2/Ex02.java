package bai2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mk;
		while(true) {
			System.out.println("Enter password:");
			mk = sc.nextLine();
			try {
				if(kiemtramk(mk)) {
					System.out.println("dang ky thanh cong");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private static boolean kiemtramk(String mk) throws Exception {
		if(mk.length() < 8 ) {
			throw new Exception("Mat khau phai dai it nhat 8 ki tu");
		}
		if(mk.length() > 256 ) {
			throw new Exception("Mat khau chi dai nhieu nhat 256 ki tu");
		}
		if(!Pattern.matches(".*[a-z].*", mk) ) {
			throw new Exception("Mat khau phai co it nhat mot ki tu viet thuong");
		}
		if(!Pattern.matches(".*[A-Z].*", mk) ) {
			throw new Exception("Mat khau phai co it nhat mot ki tu viet hoa");
		}
		if(!Pattern.matches(".*[0-9].*", mk) ) {
			throw new Exception("Mat khau phai co it nhat mot so");
		}
		if((!Pattern.matches(".*[^a-zA-Z0-9].*", mk))  ) {
			throw new Exception("Mat khau phai co it nhat mot ki tu dac biet");
		}
		if(mk.contains(" ")) {
			throw new Exception("Mat khau khong duoc chua ki tu khoang trang");
		}
		return true;		
		
	}
}
