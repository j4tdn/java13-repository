package ex03;

import java.util.Scanner;

import ex02.InvalidPasswordException;

public class Ex03 {
	public static void main(String[] args) {
		String email = "";
		while(true) {
			try {
				email = isCheckEmail();
				break;

			} catch (Exception e) {
				System.out.println("error :" + e.getMessage());
			}
		}
		System.out.println(email + " hợp lệ");
	}
	
	private static String isCheckEmail() throws Exception {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter email: ");
		
		String email = ip.nextLine();
		
		// ^[a-zA-Z]: chữ cái đầu là chữ thường hoặc hoa
		// [\\w]: tiếp theo là chữ thường hoa và số
		//(\\.[\\w]+)*: tiếp theo là dấu chấm và một hoặc nhiều kí tự (có hay không đêu được
		if (!email.matches("^[a-zA-Z][\\w](\\.[\\w]+)*@mail.com")) {
			throw new InvalidEmailException("Sai kí pháp email");
		}
		
		return email;
	}
}
