package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex02 {
	public static void main(String[] args) {
		//initial arrays with values
		Item[] items = {
				new Item(123, "Item123", 220, LocalDate.now()),
				new Item(234, "Item234", 120, LocalDate.now().minusDays(1)),
				new Item(345, "Item345", 100, LocalDate.now().plusDays(1)),

		};
		System.out.println("items: " + Arrays.toString(items));
		
		Item[] mockItems = mockData();
		System.out.println("=============");
		System.out.println("items: " + Arrays.toString(mockItems));
	}

	private static Item[] mockData() {
		return new Item[]{
			new Item(1, "Item1", 220, LocalDate.now()),
			new Item(2, "Item2", 120, LocalDate.now().minusDays(1)),
			new Item(3, "Item3", 100, LocalDate.now().plusDays(1)),
		};

	}

}
