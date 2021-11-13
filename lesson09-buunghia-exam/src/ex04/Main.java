package ex04;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username:");
		String username=sc.nextLine();
		do {
			System.out.print("Enter password:");
			String password=sc.nextLine();
			try {
				if (isValid(password,username))
					System.out.println("Register successfully");
				break;
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}while(true);
		sc.close();
	}
	public static boolean isValid(String password,String username) throws Exception{
		int count = 0;
		char[] Username = username.toCharArray();
		if(password.length() < 8 ) {
			throw new Exception("Password must contain at least 8 character");
		}
		
		if(!Pattern.matches(".*[a-z].*", password) ) {
			throw new Exception("PassWord must contain at least 1 lowercase character");
		}
		if(!Pattern.matches(".*[A-Z].*", password) ) {
			throw new Exception("PassWord must contain at least 1 uppercase character");
		}
		if(!Pattern.matches(".*[0-9].*", password) ) {
			throw new Exception("Password must contain at least 1 number");
		}
		if((!Pattern.matches(".*[^a-zA-Z0-9].*", password))  ) {
			throw new Exception("Password must contain at least 1 special character.");
		}
		for (char ch:Username) {
			if (password.indexOf(ch)!=-1) count++;
		}
		if (count > 3) {
			throw new Exception("Password can only contain atmost 3 character in username");
		}
		return true;		
	}
}
