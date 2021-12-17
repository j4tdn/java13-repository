package sorting.object;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;

import bean.Item;
import utils.Utils;

public class Ex09 {
	public static void main(String[] args) {
		// Using comparator
		// Handle the restriction of comparable, just possible to apply each sort rule
		// for each object
		// Item don't need to implement from Comparable<Item>

		Item[] items = getItems();
		// C1 >> anonymous function
		// Sort by ID ASC
		Arrays.sort(items, (o1, o2) -> o1.getId() - o2.getId());

		// C2 >> Comparator.comparing
//		Function<Item, Integer> function = new Function<Item, Integer>() {
//			@Override
//			public Integer apply(Item item) {
//				return item.getId();
//			}
//		};
		// Comparator<Item> comparator= comparing(function, reverseOrder());

		// C3 >> Comprator.comparing >>lamda
		// Comparator<Item> comparator = comparing(item -> item.getId(), reverseOrder());

		// C4 >> Comprator.comparing >>lamda >> method reference to in Java08
		// Comparator<Item> comparator = comparing(Item::getId, reverseOrder());	
		
		// Chaining comparator
		// ID ASC, Price DESC
		Comparator<Item> comparator = comparing(Item::getPrice).thenComparing(Item::getId, reverseOrder());
		
		Arrays.sort(items, comparator);
		Utils.print("Sorting items", items);

	}

	private static Item[] getItems() {
		return new Item[] { new Item(1, "Cake Atz", 120, LocalDate.of(2021, 12, 20)),
				new Item(8, "Candy Zkq", 180, LocalDate.of(2021, 12, 22)),
				new Item(6, "Tshirt Atz", 180, LocalDate.of(2019, 12, 21)),
				new Item(2, "Hat ytz", 180, LocalDate.of(2021, 10, 10)),
				new Item(3, "Jeans Qto", 150, LocalDate.of(2021, 9, 28)) };
	}

}
