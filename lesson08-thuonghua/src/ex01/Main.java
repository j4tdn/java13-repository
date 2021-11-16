package ex01;

public class Main {
	public static void main(String[] args) {
		String input = "Thưởng đẹp trai ga lăng thanh lịch vô địch khắp vũ trụ";

		System.out.println("===1. ");

		char[] index = input.toCharArray();
		for (char output : index) {
			System.out.println(output);
		}

		System.out.println("===2. ");

		String[] digits = input.split(" ");
		for (String word : digits) {
			if (!word.isEmpty()) {
				System.out.println(word);
			}
		}

		System.out.println("===3. ");

		String str = input.replaceAll("\\s\\s+", " ").trim();

		String[] words = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(reversedString);

		System.out.println("===4. ");
		
		for(int i = digits.length -1;i  >= 0 ; i--) {
			System.out.println(digits[i]);
		}
	}
}
