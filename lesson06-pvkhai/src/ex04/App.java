package ex04;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		while(true) {
			try {
				System.out.println(readNumber());
				
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private static String readNumber() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = Integer.parseInt(sc.nextLine());
		
		if(n < 0 || n > 999) {
			throw new Exception("0 <= n <= 999");
		}
		
		String[] arr1 = {"","một trăm", "hai trăm", "ba trăm", "bốn trăm", "năm trăm", "sáu trăm",
							"bảy trăm", "tám trăm", "chín trăm"};
		String[] arr2 = {"lẻ", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi","sáu mươi", 
							"bảy mươi", "tám mươi", "chín mươi"};
		String[] arr3 = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
		
		int unit = n % 10;
		int dozen = (n / 10) % 10;
		int hund = n / 100;
		
		if(dozen > 1) {
			arr3[1] = "mốt";
		}
		
		if(unit == 5 && dozen > 0) {
			arr3[5] = "lăm";
		}
		if(hund == 0 && dozen == 0) {
			arr1[0] = "";
			arr2[0] = "";
		}
		return arr1[hund] + " " + arr2[dozen] + " " + arr3[unit];
	}
}
