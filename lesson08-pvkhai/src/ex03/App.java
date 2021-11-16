package ex03;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi tiếng việt: ");
		String sequence = sc.nextLine();
		System.out.println("Output: ");
		System.out.println(show(sequence));
	}
	private static String show(String s) {
		String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(temp).replaceAll("");
	}
}
