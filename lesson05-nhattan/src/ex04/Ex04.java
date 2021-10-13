package ex04;

/**
 * 15đ
 */
public class Ex04 {
	public static void main(String[] args) {
		int arr[] = { 3, 15, 21, 0, 15, 17, 21 };
		int[] uniqueNumbers = getUniqueNumbers(arr);
		printArray(uniqueNumbers, arr.length);

	}

	// Complexity là O(n2) chưa tốt lắm
	// VD 1 2 2 3 2
	// Thì phần tử giá trị 2 mình biết là nó đã duplicate rồi
	// Nhưng mấy giá trị 2 sau mình vẫn check lại
	public static int[] getUniqueNumbers(int arr[]) {
		int[] uniqueNumbers = new int[arr.length];
		int index = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				uniqueNumbers[index++] = arr[i];
			}
		}

		// 3 0 17 0 0 0 0 >> Kết quả trả về đang thừa 0 0 0 0/
		// Nên copy qua mảng mới 3 0 17 để trả về
		return uniqueNumbers;
	}

	private static void printArray(int[] digits, int numberOfDigits) {
		for (int i = 0; i < numberOfDigits; i++) {
			System.out.print(digits[i] + " ");
		}
	}
}
