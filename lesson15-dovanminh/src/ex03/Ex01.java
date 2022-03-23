package ex03;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		String str1 = "Worko";
		String str2 = "OkRw";
		char[] c1 = str1.toLowerCase().toCharArray();
		char[] c2 = str2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		// Em có thể dùng hàm equals để thay cho đoạn code bên dưới
		if(c1.length != c2.length) {
			System.out.println("FALSE");
			return;
		}
		for (int i = 0; i < c1.length; i++) {
			if(c1[i] != c2[i]) {
				System.out.println("FALSE");
				return;
			}
		}
		System.out.println("TRUE");
	}
}
