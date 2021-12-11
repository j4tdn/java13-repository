package sorting.object;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;
import java.util.function.Function;

import bean.Item;
import utils.ArrayUtils;

public class Ex09 {
	
	public static void main(String[] args) {
		Item[] items = getItems();
		
		// Required: Comparable<Item>
		// Reference: Ex02
		
		// Comparator >> Item don't need to implement from Comparable<Item>
		// Reference: Ex06 Ex07
		// C1: Anonymous class
//		Comparator<Item> comparator = (o1, o2) -> o1.getId() - o2.getId();
		
		// C2: Comparator.comparing
//		Function<Item, Integer> keyExtractor = new Function<Item, Integer>() {
//			@Override
//			public Integer apply(Item item) {
//				return item.getId();
//			}
//		};
		
		// C3: Comparator.comparing >> Lambda
		// Function<Item, Integer> keyExtractor = (item) -> item.getId();
		
		// C4: Comparator.comparing >> Lambda >> method reference in JAVA8
		// (Item item) -> item.getId() <==> Item::getId
		
		// Function<Item, Integer> keyExtractor = Item::getId;
		
		// Comparator<Item> comparator = comparing(Item::getId);
		
		// Required: Price ASC, ID ASC
		// Chaining comparator
		// Comparator<Item> comparator = comparing(Item::getPrice).thenComparing(Item::getId, reverseOrder());
	
		Arrays.sort(items, comparing(Item::getPrice).thenComparing(Item::getId, reverseOrder()));
		ArrayUtils.printf("Sorting Items: " , items);
		
	}
	
	private static Item[] getItems() {
		return new Item[] {
			new Item(1, "Cake Azt",   120, LocalDate.of(2021, 12, 20)),
			new Item(8, "Candy Zkw",  180, LocalDate.of(2021, 12, 22)),
			new Item(6, "Tshirt Atz", 180, LocalDate.of(2019, 12, 21)),
			new Item(2, "Hat ytz",    180, LocalDate.of(2021, 10, 10)),
			new Item(3, "Jean Qto",   150, LocalDate.of(2021, 9, 28)),
		};
	}
}
