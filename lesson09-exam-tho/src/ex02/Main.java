package ex02;

public class Main {
	public static void main(String[] args) {
		String s1 = "01a2b3456cde478";
		
		getLargestNumbers(s1);
		
	}
	
	public static String getLargestNumbers(String string) {
		String[] separateDigit = string.split("[a-z]+");
		
		for(int i = 0; i < separateDigit.length; i++) {
			System.out.println(separateDigit[i]);
		}
		return string;
	}
}
