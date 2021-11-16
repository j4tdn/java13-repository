package ex03;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

public static void main(String[] args) {
		
		String s = "Em có yêu anh không anh để anh biết còn chờ\r\n"
				+ "Em xin lỗi em đã có thái độ không đúng với anh"  ;
		
		String tmp = Normalizer.normalize(s, Form.NFD); 
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+"); 
		Matcher matcher = pattern.matcher(tmp);
		
		String result = matcher.replaceAll(""); 
		
		System.out.println(result);
	}
}
