package ex01;

import java.util.Arrays;

import utils.Utils;

/*
 * Loại bỏ những phần tử trùng nhau VD: {1,2,3,4,3,1} Kết quả: {2,4}
 */
public class Ex01 {
	public static void main(String[] args) {
		int[] origin = { 1, 2, 3, 4, 1, 4, 2, 6, 1, 1, 5, 1, 7 };
		System.out.println("=========01=========");
		System.out.println(Arrays.toString(removeDuplicateElements(origin)));
		System.out.println("=========02=========");
		comparison(origin);
		System.out.println("=========03=========");
		System.out.println(findElement(origin));
	}

	private static int[] removeDuplicateElements(int[] numbers) {
		int count = 0;
		int index = 0;

		int[] array = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int k = numbers[i];
				int g = numbers[j];
				if (k == g) {
					count++;
					if (count >= 1) {
						count = 1;
						numbers = Utils.delete(numbers, j);
						j--;
					}
				}
			}
			if (count < 1) {
				array[index++] = numbers[i];
				count++;
			}
			count--;
		}
		return Arrays.copyOfRange(array, 0, index);
	}

	private static void comparison(int[] numbers) {
		float first = 0;
		float second = 0;

		for (int i = 0; i < numbers.length / 2; i++) {
			first += numbers[i];
		}

		for (int i = numbers.length / 2 + 1; i < numbers.length; i++) {
			second += numbers[i];
		}

		first = first / (numbers.length / 2);
		second = second / (numbers.length / 2);

		if (first > second) {
			System.out.println("n/2 phần tử đầu tiên lớn hơn n/2 phần tử cuối cùng");
		} else if (first < second) {
			System.out.println("n/2 phần tử đầu tiên nhỏ hơn n/2 phần tử cuối cùng");
		} else {
			System.out.println("n/2 phần tử đầu tiên bằng n/2 phần tử cuối cùng");
		}
	}

	private static int findElement(int[] numbers) {
		int num = 0;
		
		numbers = Utils.sort(numbers, (a, b) -> a < b);
		numbers = Utils.deleteDuplicates(numbers);

		for (int i = 0; i < numbers.length; i++) {
			if (i == 2) {
				num = numbers[i];
			}
		}
		return num;
	}

}
