package baitap;


import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Viết chương trình cho phép nhập địa chỉ email từ bàn phím. 
 * Kiểm tra email nếu không hợp lệ thì thông báo lỗi vào yêu cầu nhập lại cho đến khi hợp lệ và in ra. 
 * Thông tin định dạng email hợp lệ mô tả như sau
 * A valid email address consists of an email prefix and an email domain, both in acceptable formats.
 * The prefix appears to the left of the @ symbol.
 * The domain appears to the right of the @ symbol.
 */
public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String email;
		while(true) {
			try {
				System.out.println("A valid email address consists of an email prefix and an email domain: prefix + @ + domain");
				System.out.print("Enter your email:");
				email = input.nextLine();
				if(hasAtCharacter(email)){
					int indexOfAtCharacter = email.indexOf("@");
					String prefix = email.substring(0, indexOfAtCharacter);
					String domain;
					if(indexOfAtCharacter == email.length() - 1) {
						domain = "";
					} else {
						domain = email.substring(email.indexOf("@") + 1, email.length());
					}
					if(isValidPrefixEmail(prefix) && isValiddomainEmail(domain)) {
						System.out.println("Email: "+ email + " is  valid Email");
					}
				}
				break;
				
			} catch (Exception e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
	
	private static boolean hasAtCharacter(String email) throws Exception {
		if(!email.contains("@")) {
			throw new Exception("Email must contain @ symbol");
		}
		return true;
	}
	
	private static boolean isValidPrefixEmail(String prefix) throws Exception{
		if(prefix.length() == 0) {
			throw new Exception("Email must have prefix");
		}
		if(Pattern.matches(".*[^\\w-_.].*", prefix)) {
			throw new Exception("Prefix error: Allowed characters: letters (a-z), numbers, underscores, periods, and dashes.");
		}
		if(prefix.endsWith("-") || prefix.endsWith("_") || prefix.endsWith(".")) {
				throw new Exception("An underscore, period, or dash must be followed by one or more letter or number");
			}
		if(prefix.startsWith("-") || prefix.startsWith("_") || prefix.startsWith(".")) {
			throw new Exception("prefix must start with aphabetic character");
		}
		return true;
	}
	
	private static boolean isValiddomainEmail(String domain) throws Exception{
		if(domain.length() == 0) {
			throw new Exception("Email must have domain");
		}
		if(!domain.startsWith("mail")) {
			throw new Exception("Domain must start with \"mail\"");
		}
		if(!Pattern.matches(".*[.].*", domain)) {
			throw new Exception("Domain must contain periods character");
		}
		if(Pattern.matches(".*[^\\w.-].*", domain)) {
			throw new Exception("Domain error: Allowed characters: letters, numbers, dashes.");
		}
		if(!Pattern.matches("([\\w]+\\.[\\w]{2,})", domain)) {
			throw new Exception("The last portion of the domain must be at least two characters, for example: .com, .org, .cc");
		}
		return true;
	}

}

