package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex02 {
	public static void main(String[] args) {
		int[] digits = {22, 44, 88, 66};
		System.out.println("digits length: " + digits.length);
		System.out.println("digits: " + Arrays.toString(digits));
		System.out.println("digits class name: " + digits.getClass().getSimpleName());
		
		String[] sequences = {"Tom", "Smith", "Henry"};
		System.out.println("sequences: " + Arrays.toString(sequences));
		
		Item[] items = {
				new Item(1, "Item 1", 120, LocalDate.now()),
				new Item(2, "Item 2", 240, LocalDate.now().minusDays(1)),
				new Item(3, "Item 3", 180, LocalDate.now().plusDays(1))
		};
		System.out.println("items: " + Arrays.toString(items));
		
		Item[] mockedItems = mockData();
		System.out.println("items: " + Arrays.toString(mockedItems));
	}
	 private static Item[] mockData() {
		 return new Item[] {
				 new Item(11, "Item 11", 120, LocalDate.now()),
				 new Item(22, "Item 22", 240, LocalDate.now().minusDays(1)),
				 new Item(33, "Item 33", 180, LocalDate.now().plusDays(1))
		 };
	 }
}
