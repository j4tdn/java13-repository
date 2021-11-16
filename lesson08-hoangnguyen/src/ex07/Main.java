package ex07;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		String str = "aaabaaabbaaaaa";
		
		System.out.println("Max: " + Arrays.stream(trueSub(str)).max().getAsInt());
		System.out.println("Min: " + Arrays.stream(trueSub(str)).min().getAsInt());
	}
	
	private static int[] trueSub(String str) {
		int[] arr = new int[str.length()];
		int index = 0;
		char s = str.charAt(0);
		int count = 1;
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == s) {
				count++;
			} else {
				arr[index++] = count;
				count = 1;
				s = str.charAt(i);
			}
		}
		
		arr[index] = count;
		
		return Arrays.copyOfRange(arr, 0, index + 1);
		
	}
}
