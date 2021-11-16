package ex02;

import java.text.Format;

public class Ex02 {
	public static void main(String[] args) {
		String name = " nGuyen vaN Anh";
		
		name = name.trim().replaceAll("\\s+", " ");
		name = name.toLowerCase();
		String[] a = name.split(" ");
		name = "";
		for(String k: a) {
			name += k.substring(0, 1).toUpperCase() + k.substring(1) + " ";
		}
		name = name.trim();
		
		System.out.println("|"+name+"|");
	}
}
