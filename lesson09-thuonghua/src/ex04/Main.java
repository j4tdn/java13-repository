package ex04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	
		public static void main(String[] args) {
			Scanner ip = new Scanner(System.in);
			System.out.println("Create a new password");
			String useName = null;
			String password = null;
			do {
				try {
					System.out.print("User Name:");
					useName = ip.nextLine();
					System.out.print("Password:");
					password = ip.nextLine();
					CheckPassword(useName, password);
					System.out.println("Created a new password!!!");
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.println("Retype!!!!");
				}
			} while (true);

		}

		private static Boolean CheckPassword(String useName, String password) throws Exception {
			char[]  str1 = useName.toCharArray();	
			char[]  str2 = password.toCharArray();	
 			int cout = 0;
			for(int i = 0; i < str1.length; i++) {
				for(int j = 0; j <str2.length; j++) {
					if(str1[i] == str2[j]) {
						cout++;
					}
				}
			}
			
			if (Pattern.matches("\\A(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!.@#$%^&+=])(?=\\S+$).{8,}\\z", password)) {
				return true;
			} else if(cout > 3) {
				throw new Exception("Error: ...");
			} else {
				throw new Exception("Error: ...");
			}
	}
}
