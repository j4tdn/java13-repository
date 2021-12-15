package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex02 {
	public static void main(String[] args) {
		// initial arrays with values
		
		// int[]
		int[] digits = {22, 44, 88, 66};
		System.out.println("digits length: " + digits.length);
		System.out.println("digits: " + Arrays.toString(digits));
		System.out.println("digits class name: " + digits.getClass().getSimpleName());
		
		System.out.println("\n=====\\\\\\\\\\=====\n");
		
		// String[]
		String[] sequences = {"Tom", "Smith", "Henry"};
		System.out.println("sequences: " + Arrays.toString(sequences));
		System.out.println("sequences class name: " + sequences.getClass().getSimpleName());
		
		System.out.println("\n=====\\\\\\\\\\=====\n");
		
		// Item[]
		Item[] items = {
				new Item(1, "Item 1", 120, LocalDate.now()),
				new Item(2, "Item 2", 240, LocalDate.now().minusDays(1)),
				new Item(3, "Item 3", 180, LocalDate.now().plusDays(1))
		};
		System.out.println("items: " + Arrays.toString(items));
		
		System.out.println("\n=====\\\\\\\\\\=====\n");
		
		Item[] mockedItems = mockData();
		System.out.println("items: " + Arrays.toString(mockedItems));
	}
	
	private static Item[] mockData() {
		return new Item[]{
			new Item(11, "Item 11", 120, LocalDate.now()),
			new Item(22, "Item 22", 240, LocalDate.now().minusDays(1)),
			new Item(33, "Item 33", 180, LocalDate.now().plusDays(1))
		};
	}
}
