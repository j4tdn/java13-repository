package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex02 {
	public static void main(String[] args) {
		// initial arrays with values

				// int[]
				int[] digits = { 22, 44, 66, 88 };
				System.out.println("digits: " + Arrays.toString(digits));
				System.out.println("digits length: " + digits.length);
				System.out.println("digits class name: " + digits.getClass().getSimpleName());

				System.out.println("\n========\\\\\\\\=========\n");
				String[] sequences = { "a", "b", "c", "d", "e" };
				System.out.println("sequences: " + Arrays.toString(sequences));
				System.out.println("sequences length: " + sequences.length);

				System.out.println("\n========\\\\\\\\=========\n");
				Item[] items = mockData();
				System.out.println("items: " + Arrays.toString(items));
	}
	
	private static Item[] mockData() {
		return new Item[] {
				new Item(1, "Item 1", 120, LocalDate.now()),
				new Item(2, "Item 2", 240, LocalDate.now().minusDays(1)),
				new Item(3, "Item 3", 360, LocalDate.now().plusDays(1)) };

		/*block code*/
//		return {
//				new Item(1, "Item 1", 120, LocalDate.now()),
//				new Item(2, "Item 2", 240, LocalDate.now().minusDays(1)),
//				new Item(3, "Item 3", 360, LocalDate.now().plusDays(1)) 
//		};
	}
}
