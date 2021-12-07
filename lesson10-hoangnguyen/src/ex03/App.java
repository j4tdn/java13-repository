package ex03;

import java.util.Arrays;

public class App {
	
	public static void main(String[] args) {
		String[] str = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c",
				"b", "xx"};
		sortIncrease(str);
		System.out.println(Arrays.toString(str));
	}
	
	private static void sortIncrease(String[] str) {
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str.length - i - 1; j++) {
				
				if(str[j] == null && str[j + 1] != null) {
					Utils.swap(str, j, j + 1);
					continue;
				}
				
				if(str[j + 1] == null) {
					continue;
				}
				
				if(str[j].compareTo(str[j + 1]) > 0) {
					Utils.swap(str, j, j + 1);
				}
			}
		}
	}
}
