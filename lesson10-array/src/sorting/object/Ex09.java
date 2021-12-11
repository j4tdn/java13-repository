package sorting.object;

import java.time.LocalDate;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;

import bean.Item;
import utils.ArrayUtils;

public class Ex09 {
	public static void main(String[] args) {
		Item[] items = getItems();
		
		// Required: Comparable<Item>
		// Arrays.sort(items);
		
		// Comparator >> Item don't need to implement from Comparable<Item>
		
		// Comparator<Item> comparator = (o1, o2) -> o1.getId() - o2.getId();
		
		// Required : Price ASC, Id DESC
		Comparator<Item> comparator = comparing(Item::getPrice).thenComparing(Item::getId, reverseOrder());
		
		Arrays.sort(items, comparator);
		
		ArrayUtils.print("Sorting Items: ", items);
		
	}
	
	private static Item[] getItems() {
		return new Item[] {
			new Item(1, "Cake Atz", 120, LocalDate.of(2021, 12, 20)),
			new Item(8, "Candy Zkq",  180, LocalDate.of(2021, 12, 22)),
			new Item(6, "Tshift Atz", 180, LocalDate.of(2021, 12, 21)),
			new Item(2, "Hat ytz",    180, LocalDate.of(2021, 10, 10)),
			new Item(3, "Jean Qto",   150, LocalDate.of(2021, 9, 28)),
		};
	}
}
