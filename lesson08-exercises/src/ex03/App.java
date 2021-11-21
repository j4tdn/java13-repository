package ex03;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class App {
	public static void main(String[] args) {
		String inputString = "Lớp JAVA 13 Thầy Quyền";
		System.out.println("Original string:        |||" + 
				inputString + "|||");
		System.out.println("String after processed: |||" + removeVietnameseAccent(inputString) + "|||");
	}

	public static String removeVietnameseAccent(String inputString) {
		try {
			String temp = Normalizer.normalize(inputString, Normalizer.Form.NFD);
			Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
			return pattern.matcher(temp).replaceAll("");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
