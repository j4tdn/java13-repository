package hw;

import java.util.Random;

public class Ex07 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] digits = new int[100];
		int a;
		int count = 0;
		
		for (int i = 0; ; i++) {
			a = 20 + rd.nextInt(11);
			
			if (isCheck(a, digits)) {
				digits[count] = a;
				count++;
				System.out.println(a);
			}
			
			if (count == 5) {
				break;
			}
		}
	}
	
	private static boolean isCheck(int a, int[] input) {
		
		for(int i = 0; i < input.length ;i++) {
			if(a == input[i]) {
				return false;
			}
		}
		return true;
	}
	
	

}
