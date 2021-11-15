package baitap;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 
 * Viết chương trình cho phép người dùng nhập vào họ và tên sau đó in ra kết quả theo yêu cầu sau:
 * 
 * Họ tên nhập vào chỉ bao gồm các kí tự [A-Za-z ]
 * Viết HOA chữ cái đầu tiên của mỗi từ, còn lại là kí tự thường
 * Các kí tự cách nhau một khoảng trắng
 * Example : aDam Le vAN john Son => Adam Le Van John Son
 * Anne frAnk => Lê Phan
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			String s;
			System.out.println("Nhập chuỗi:");
			s = input.nextLine();
			try {
				if(validName(s)) {
					System.out.println("Họ tên: " + standarString(s).toString());
				}
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private static boolean validName(String s) throws Exception {
		if(!Pattern.matches("[a-zA-Z\\s]+", s)) {
			throw new Exception("Họ tên nhập vào chỉ bao gồm các kí tự [A-Za-z ]");
		}
		return true;
	}
	
	private static String standarString(String s) {
		String result = "";
		s = s.trim().toLowerCase();
		s = s.replaceAll("[\\s]+", " ");
		String [] words = s.split("\\s");
		for(int i = 0; i< words.length; i++ ) {
			result = result + String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
			if (i <= words.length-1) {
				result = result + " ";
			}
		}
		return result;
	}
}
