package ex04;

public class Ex04 {
	public static void main(String[] args) {
		int arr[] = {3, 15, 21, 0, 15, 17, 21};
		int[] uniqueNumbers = getUniqueNumbers(arr);
		printArray(uniqueNumbers, arr.length);
		
	}
	
	public static int[] getUniqueNumbers(int arr[]) {
		int[] uniqueNumbers = new int[arr.length];
		int index = 0;
		
		for(int i = 0; i < arr.length - 1; i++) {
			int count = 0;
			for(int j = 0; j < arr.length ; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count == 1) {
				uniqueNumbers[index++] = arr[i];
			}
		}
		return uniqueNumbers;
	}
	
	private static void printArray(int [] digits, int numberOfDigits) {
		for(int i = 0; i < numberOfDigits; i++) {
			System.out.print(digits[i] + " ");
		}
	}
}
