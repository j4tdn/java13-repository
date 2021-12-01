package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex02 {
	public static void main(String[] args) {
		//Initial array without value
		
		// int[]
		int [] digits = {22, 44, 66, 88};
		System.out.println("digits: " + Arrays.toString(digits));
		System.out.println("digits length: " + digits.length);
		System.out.println("digits class name: " + digits.getClass().getSimpleName());
		System.out.println("===========================");
		//String[]
		
		String[] sequences =  {"Tom", "Smith", "Herry"};
		System.out.println("sequences: " + Arrays.toString(sequences));
		System.out.println("sequences length: " + sequences.length);
		System.out.println("sequences class name: " + sequences.getClass().getSimpleName());

		System.out.println("===========================");
		//Items []
		Item [] items = {
				new Item(1, "Item 1", 120, LocalDate.now()),
				new Item(1, "Item 2", 240, LocalDate.now().minusDays(1)),
				new Item(1, "Item 3", 360, LocalDate.now().plusDays(1)),
		};
		System.out.println("items: " + Arrays.toString(items));
		System.out.println("items class name: " + items.getClass().getSimpleName());
		Item[] mockItems = mockData();
		System.out.println("items: " + Arrays.toString(mockItems));
	}
	private static Item[] mockData() {
		return new Item[] {
				new Item(11, "Item 1", 120, LocalDate.now()),
				new Item(22, "Item 2", 240, LocalDate.now().minusDays(1)),
				new Item(33, "Item 3", 360, LocalDate.now().plusDays(1)),
		};
		
	}
}
