package baitap;

import java.util.Scanner;


public class Ex04 {
	
	private static String [] units = {"không", "một", "hai", "ba","bốn","năm","sáu","bảy","tám","chín"};
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n;
		String number = "";
		while(true) {
			try {
				System.out.print("Enter number: ");
				n = Integer.parseInt(input.nextLine());
				while(n > 999 || n < 0) {
					System.out.println("Number must be between 0 - 999");
					n = Integer.parseInt(input.nextLine());
				}
				System.out.println(readNumber(n));
				break;
				
			} catch (Exception e) {
				System.out.println("Message: input must be a number! Please enter data again! ");
			}
		}
	}
	
	private static String readNumber(int n) {
		String number = "";
		
		int length = Integer.toString(n).length();
		if (length == 1) number = units[n];
		else if (length == 2) {
			number = readDozens(n);
		}
		else {
			number = readHundreds(n);
		}
		// chuẩn hóa 
		number = number.substring(0, 1).toUpperCase() + number.substring(1);
		if (number.contains("mươi")) {
			number = number + " || " + number.replaceAll("mươi","");
		}
		if(number.contains("linh")) {
			number = number + " || " + number.replaceAll("linh","lẻ");
		}
		number = number.replace("  ", " ");
		return number;
	}
	
	private static String readDozens(int n) {
		String number = "";
		if (n == 10) {
			number = "mười";
		}else if (n == 11) {
			number = "mười một";
		}
		else {
			int un = n % 10;
			if(un == 0) {
				number = "";
			}
			else if(un == 1) {
				number = "mốt";
			}
			else if(un == 5) {
				number = "lăm";
			}
			else number = units[un];
			n = n / 10;
			if(n == 1) {
				number = "mười" + " " + number;
			}
			else {
				number = units[n] + " mươi " + number; 
			}
		}
	return number;	
	}
	
	private static String readHundreds(int n){
		String number = "";
		int dz = n % 100;
		if(dz == 0) {
			number = "";
		}
		else if(dz > 10) {
			number = readDozens(dz);
		}
		else {
			number = "linh " + units[dz];
		}
		n = n / 100;
		number = units[n] + " trăm " + number;
		return number;
	}
}