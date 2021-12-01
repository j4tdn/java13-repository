package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex02 {
	public static void main(String[] args) {
		// initial arrays with values

		// int[]
		int[] digits = { 22, 44, 88, 66 };
		System.out.println("digits length: " + digits.length);
		System.out.println("digits: " + Arrays.toString(digits));
		// String[]
		String[] sequences = { "Tom", "Smith", "Henry" };
		System.out.println("sequences: " + Arrays.toString(sequences));
		// Item[]
		Item[] items = { 
				new Item(1, "Item1", 120, LocalDate.now()),
				new Item(2, "Item2", 10, LocalDate.now().minusDays(1)),
				new Item(3, "Item3", 20, LocalDate.now().plusDays(1)), 
			};
		System.out.println("items: " + Arrays.toString(items));
	}

	private static Item[] mockData() {
		Item[] items = { 
				new Item(1, "Item1", 120, LocalDate.now()),
				new Item(2, "Item2", 10, LocalDate.now().minusDays(1)),
				new Item(3, "Item3", 20, LocalDate.now().plusDays(1)), 
			};
		return items;
	}
	
	
}
