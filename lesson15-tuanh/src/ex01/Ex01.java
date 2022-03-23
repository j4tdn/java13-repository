package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Bài 1:
 * Cho dãy N (0 <= N < 100) phần tử. Mỗi phần tử N[i] (1 <= N[i] <= 20) là một số nguyên
 * Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N Example:
 * input: 1 2 3 4 5 6 5 5 3 1 output: 2 4 6 Liệt kê các phần tử xuất nhiều hơn
 * một lần trong dãy N Example: input: 5 7 9 10 20 9 7 11 output: 7 9
 */

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> element = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);
		System.out.println("List element: ");
		element.forEach(x -> System.out.print(x + " "));

		System.out.println("\nList the elements that appear only once in the sequence N: ");
		List<Integer> onlyOneTimeAppearance = findOneTimeElements(element);
		onlyOneTimeAppearance.forEach(x -> System.out.print(x + " "));

		System.out.println("\nList the elements that appear more than once in the sequence N: ");
		List<Integer> moreThanOneTimeAppearance = findMoreThanOneTimeElements(element);
		moreThanOneTimeAppearance.forEach(x -> System.out.print(x + " "));
	}

	private static List<Integer> findOneTimeElements(List<Integer> element) {
		List<Integer> newData = new ArrayList<Integer>(element);
		boolean a = newData.removeAll(findMoreThanOneTimeElements(element));
		if (a) {
			return newData;
		}
		return null;
	}
	
	// Cách làm giống 1 bạn a đã review trước đó
	private static List<Integer> findMoreThanOneTimeElements(List<Integer> element) {
		List<Integer> ls = new ArrayList<>();
		for (int i = 0; i < element.size() - 1; i++) {
			if (!ls.contains(element.get(i))) {
				for (int j = i + 1; j < element.size(); j++) {
					if (!ls.contains(element.get(j)) && element.get(j) == element.get(i)) {
							ls.add(element.get(i));
					}
				}
			}
		}
		return ls;
	}
} 