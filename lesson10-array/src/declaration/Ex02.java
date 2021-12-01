package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex02 {
	public static void main(String[] args) {
		// initial arrays with values
		
		// int[]
		int[] digits = {22, 44, 66, 88};
		System.out.println("digits: " + Arrays.toString(digits));
		System.out.println("digits class name: " + digits.getClass().getName());
		System.out.println("\n===========/////////==========\n");
		// String[]
		String[] sequences = {"Tom", "Smith", "Jerry"};
		System.out.println("digits: " + Arrays.toString(sequences));
		System.out.println("\n===========/////////==========\n");
		// Item[]
		Item[] items = {
				new Item (1, "Item 1", 120, LocalDate.now()),
				new Item (2, "Item 2", 130, LocalDate.now().plusDays(1)),
				new Item (3, "Item 3", 140, LocalDate.now().minusDays(1))
		};
		System.out.println("Items: " + Arrays.toString(items));
		System.out.println("items class name: " + items.getClass().getName());
		System.out.println("\n===========/////////==========\n");
		System.out.println("items: " + Arrays.toString(mockData()));
		System.out.println("\n===========/////////==========\n");
		
		
	
	}
	private static Item[] mockData() {
		return  new Item[]{
				new Item (11, "Item 11", 120, LocalDate.now()),
				new Item (22, "Item 22", 130, LocalDate.now().plusDays(1)),
				new Item (33, "Item 33", 140, LocalDate.now().minusDays(1))
		};
		
	}
}
