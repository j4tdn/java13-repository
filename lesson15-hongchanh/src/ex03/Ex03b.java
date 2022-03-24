package ex03;

import java.util.Arrays;

public class Ex03b {

	public static void main(String[] args) {
		String string = "aaaababbbbddc";
		maxTimeChar(string);
		
		String string1 = "aaaababbbddcbbbbfffffffffff";
		maxTimeChar(string1);
	}
	
	private static void maxTimeChar(String s) {
		// E cần handle trường hợp trong mảng có các kí tự có số lần bằng nhau nữa là ok
		System.out.println("chuỗi " + s);
		char[] c = s.toLowerCase().trim().toCharArray();
		
		Arrays.sort(c);
		
		int max= 0;
		char rs = c[0];
		
		for (int i = 0; i < c.length; i++) {
			
			int k = 0;
			for (int j = 0; j < c.length; j++) {
				
				if (c[i] == c[j]) {
						k++;
				}
			}
			if (k>max) {
				max=k;
				rs=c[i];
			}
		}
		
		System.out.println("phần tử " + rs + " xuất hiện nhiều nhất với tần số là " +  max);
	}
}
