package operation;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4 , 5, 6};
		reverse(numbers);
		System.out.println("reverse: " + Arrays.toString(numbers));
	}
	
	private static void reverse (int[] origin) {
		int[] backup = Arrays.copyOfRange(origin, 0, origin.length);
		
		for (int i = 0; i < origin.length / 2; i++) {
			int tmp = origin[i];
			origin[i] = origin[origin.length - i - 1];
			origin[origin.length - i - 1] = tmp;
		}
	}
}
