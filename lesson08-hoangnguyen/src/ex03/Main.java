package ex03;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String[] args) {
		String str = "Em có yêu anh không anh để anh biết còn chờ";
		System.out.println(removeAccent(str));
	}
	
	private static String removeAccent(String str) {
		String temp = Normalizer.normalize(str, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		String result = pattern.matcher(temp).replaceAll("");
		return result;
	}
}
