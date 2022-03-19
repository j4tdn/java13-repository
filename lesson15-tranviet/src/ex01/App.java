package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N Example:
 * input: 1 2 3 4 5 6 5 5 3 1 output: 2 4 6 Liệt kê các phần tử xuất nhiều hơn
 * một lần trong dãy N Example: input: 5 7 9 10 20 9 7 11 output: 7 9
 */
public class App {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);
		System.out.println("Dãy phần tử: ");
		nums.forEach(x -> System.out.print(x + " "));

		System.out.println("\n============================================\n");
		System.out.println("Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N: ");
		List<Integer> onlyOneTimeAppearance = findOneTimeElements(nums);
		onlyOneTimeAppearance.forEach(x -> System.out.print(x + " "));

		System.out.println("\n============================================\n");
		System.out.println("Liệt kê các phần tử xuất nhiều hơn một lần trong dãy N: ");
		List<Integer> moreThanOneTimeAppearance = findMoreThanOneTimeElements(nums);
		moreThanOneTimeAppearance.forEach(x -> System.out.print(x + " "));
	}

	private static List<Integer> findOneTimeElements(List<Integer> nums) {
		List<Integer> newData = new ArrayList<Integer>(nums);
		boolean x = newData.removeAll(findMoreThanOneTimeElements(nums));
		if (x) {
			return newData;
		}
		return null;
	}

	private static List<Integer> findMoreThanOneTimeElements(List<Integer> nums) {
		List<Integer> rs = new ArrayList<>();
		for (int i = 0; i < nums.size() - 1; i++) {
			if (!rs.contains(nums.get(i))) {
				for (int j = i + 1; j < nums.size(); j++) {
					if (!rs.contains(nums.get(j)) && nums.get(j) == nums.get(i)) {
							rs.add(nums.get(i));
					}
				}
			}
		}
		return rs;
	}
}
