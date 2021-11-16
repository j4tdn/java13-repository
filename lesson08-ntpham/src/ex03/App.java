package ex03;

import java.util.Scanner;

import ex02.NameUtils;

public class App {
	private static  Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		String s = "";
		
		//String s1 =   "Em có yêu anh không anh để anh biết còn chờ\n"
		//	+ 	"Em xin lỗi em đã có thái độ không đúng với anh" ;
		
		while(true) {
			try {
				System.out.println("Input string: ");
				s = inputString();
				break;
			}catch(InvalidFormatStringException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("Convert .......");
		System.out.println(convert(s));
	}
	
	private static String inputString() {
		String s = "";
		s = ip.nextLine();
		if (!NameUtils.isValidName(s)) 
			throw new InvalidFormatStringException("*Chuỗi tiếng việt chỉ gồm chữ cái và khoảng cách*");
		return s;
	}
	
	private static String convert(String s) {
		s = s.replaceAll("[áàảãạăắằẳẵặâấầẩẫậ]", "a");
		s = s.replaceAll("[óòỏõọôốồổỗộơớờởỡợ]", "o");
		s = s.replaceAll("[úùủũụưứừửữự]", "u");
		s = s.replaceAll("[éèẻẽẹêếềểễệ]", "e");
		s = s.replaceAll("[íìỉĩị]", "i");
		s = s.replaceAll("[đ]", "d");		
		s = s.replaceAll("[ý|ỳ|ỷ|ỹ|ỵ]", "y");
		
		s = s.replaceAll("[ÁÀẢÃẠĂẮẰẲẴẶÂẤẦẨẪẬ]", "A");
		s = s.replaceAll("[ÓÒỎÕỌƠỚỜỞỠỢÔỐỒỔỖỘ]", "O");
		s = s.replaceAll("[ÚÙỦŨỤƯỨỪỬỮỰ]", "U");
		s = s.replaceAll("[ÉÈẺẼẸÊẾỀỂỄỆ]", "E");
		s = s.replaceAll("[ÍÌỈĨỊ]", "I");
		s = s.replaceAll("[Đ]", "D");		
		s = s.replaceAll("[Ý|Ỳ|Ỷ|Ỹ|Ỵ]", "Y");

		return s;
	}
}
