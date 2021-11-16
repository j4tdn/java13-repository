package ex03;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		String string = "Em có yêu anh không để anh biết anh còn chờ\n"
				      + "Em xin lỗi em đã có thái độ không đúng với anh";
		System.out.println(string);
		System.out.println("========");
		System.out.println(removeAccent(string));
	}
	private static String removeAccent(String s) {
		String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(temp).replaceAll("");	
	}
}
