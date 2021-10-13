package ex04;

import java.util.ArrayList;

/**
 * 17đ
 */
public class App {
	public static void main(String[] args) {
		// complexity chưa tốt tương tự bài 2
		// VD phần tử 21 cuối cùng. Như trước đó mình thấy 21 đã là duplicate element
		// nhưng qua 21 cuối cùng mình cũng phải check lại
		// Em nên tạo 1 cái flag chi đó để biết những giá trị nào mình đã mark duplicated
		int[] input = { 3, 15, 21, 0, 15, 17, 21 };

		ArrayList<Integer> output = getUniqueNumbers(input);

		for (Integer x : output) {
			System.out.print(x + " ");
		}
	}

	public static ArrayList<Integer> getUniqueNumbers(int input[]) {
		// E dùng ArrayList ở đây có lẽ là muốn return đúng số lượng phần tử unique
		// Tránh dùng mảng int nó có mấy phần tử 0 phía sau
		ArrayList<Integer> output = new ArrayList<Integer>();
		int count = 0;
		int number = 0;
		for (int i = 0; i < input.length; i++) {
			number = input[i];
			count = 0;
			for (int j = 0; j < input.length; j++) {
				if (number == input[j]) {
					count++;
				}
			}
			if (count == 1)
				output.add(number);
		}

		return output;
	}
}
