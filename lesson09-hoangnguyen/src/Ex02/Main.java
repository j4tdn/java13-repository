package Ex02;


public class Main {
	
	public static void main(String[] args) {
		String n1 = "aa6b546c6e22h";
		String n2 = "aa6b326c6e22h";
		String[] result = getLargestNumbers(n1, n2);
		for(String number : result) {
			System.out.print(number + ", ");
		}
	}
	
	private static String[] getLargestNumbers(String n1, String n2) {
		String[] result = new String[10];
		int count = 0;
		String[] numbersN1 = splitString(n1);
		String[] numbersN2 = splitString(n2);
		int numberMaxN1 = convertToInteger(numbersN1);
		int numberMaxN2 = convertToInteger(numbersN2);
		
		if(numberMaxN1 > numberMaxN2) {
			result[0] = numberMaxN2 + "";
			result[1] = numberMaxN1 + "";
		} else {
			result[0] = numberMaxN1 + "";
			result[1] = numberMaxN2 + "";
		}
		
		return result;
	}
	
	private static String[] splitString(String str) {
		String[] numbers = str.split("[a-z]+");
		
		return numbers;
	}
	
	private static int convertToInteger(String[] numbers) {
		int numberMax = Integer.parseInt(numbers[1]);
		for (int i = 2; i < numbers.length; i++) {
			if(Integer.parseInt(numbers[i]) > numberMax) {
				numberMax = Integer.parseInt(numbers[i]);
			}
		}
		
		return numberMax;
	}
}
