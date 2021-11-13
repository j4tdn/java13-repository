/**
 * Bài 2(30đ): Cho n xâu chuỗi, mỗi chuỗi bao gồm các ký tự la tinh thường và chữ số. Đoạn các
	ký tự số liên tục tạo thành một số nguyên. Ở mỗi xâu chuỗi trích ra các số nguyên và tìm số lớn
	nhất, sắp xếp các số lớn nhất nhận được từ các xâu đã cho và in ra theo thứ tự không giảm, mỗi số
	được đưa ra dưới dạng không có các số 0 không có nghĩa (024)
	Nếu chuỗi rỗng hoặc chuỗi chỉ chứa các ký tự latinh thì số lớn nhất của chuỗi đó là 0
	Ví dụ: với n = 1 : xâu 01a2b3456cde478 : Kết quả: 3456
	 với n = 2 : xâu aa6b546c6e22h, aa6b326c6e22h: Kết quả: 326, 546
 * 
 */
package ex02;

public class Main {
	public static void main(String[] args) {

		String s1 = "01a2b3456cde478";
		String s2 = "aa6b546c6e22h";
		String s3 = "aa6b0326c6e22h";
		//String s4 = "";
		String s5 = "23552W#$#%^#@$@ASDAVgdg";
		String[] numbers = getLargestNumbers(s1, s2, s3, s5);
		printArray(numbers);

	}

	private static void printArray(String[] numbers) {
		System.out.print("Kết quả: ");
		for (String i : numbers) {
			System.out.print(i + " ");
		}
	}

	private static String[] getLargestNumbers(String... ss) {
		int[] numbers = new int[ss.length];
		int count = 0;
		for (String s : ss) {
			numbers[count++] = getTheBiggestNumberInString(s);
		}
		sort(numbers);
		String[] result = new String[numbers.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = " " + numbers[i];
		}
		return result;
	}

	private static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	private static int getTheBiggestNumberInString(String s) {
		int max = Integer.MIN_VALUE;
		int number = 0;
		if (s.isEmpty()) {
			return 0;
		} else {
			String[] numbers = s.split("[a-zA-z]+");
			for (String i : numbers) {
				//Nếu chuỗi rỗng hoặc chuỗi chỉ chứa các ký tự latinh thì số lớn nhất của chuỗi đó là 0
				if (i.isEmpty() || containSpecialCharacter(s)) {
					number = 0;
				} else {
					// đưa ra dưới dạng không có các số 0 không có nghĩa (024)
					number = Integer.parseInt(i);
				}
				if (number > max) {
					max = number;
				}
			}
		}
		return max;
	}

	private static boolean containSpecialCharacter(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}
}
