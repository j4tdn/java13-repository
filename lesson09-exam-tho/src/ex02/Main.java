package ex02;

public class Main {
	public static void main(String[] args) {
		String s1 = "01a2b3456cde478";
		
		// Get max number from string
		System.out.println("Max number from string: " + getLargestNumbers(s1));
	}
	
	public static int getLargestNumbers(String string) {
		String[] separateDigit = string.split("[a-z]+");
		
		Integer[] number = new Integer[separateDigit.length];
		
		for(int i = 0; i < separateDigit.length; i++) {
			number[i] = Integer.parseInt(separateDigit[i]);
		}
		
		int max = number[0];
		for(int i = 0; i < number.length; i++) {
			if (max < number[i]) {
				max = number[i];
			}
		}
		
		return max;
	}
}
