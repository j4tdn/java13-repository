package ex03;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03 {
public static void main(String[] args) {
		
		String s = "Em có yêu anh không anh để anh biết còn chờ\r\n"
				+ "Em xin lỗi em đã có thái độ không đúng với anh"  ;
		
		String tmp = Normalizer.normalize(s, Form.NFD); // tiêu chuẩn hóa S theo định dạng NFD
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+"); // regex Unicode Blocks: các dấu phụ
		Matcher matcher = pattern.matcher(tmp);
		
		String result = matcher.replaceAll(""); // trả về chuỗi mà các dấu phụ đã được thay thế bằng rỗng. 
		
		System.out.println(result);
	}
}
