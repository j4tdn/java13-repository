package sorting.object;

import java.time.LocalDate;
import static java.util.Comparator.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import bean.Item;
import utils.ArrayUtils;

public class Ex09 {
	public static void main(String[] args) {
		Item[] items = getItems();
		
		//required: comparable<Item>
		//Arrays.sort(items);
		
		//comparator >> Item don't need to implements Comparable
		//reference Ex06 Ex07
		
		//Comparator<Item> comparator = (i1, i2) -> i1.getId() - i2.getId();
		//Function<Item, Integer> keyExtractor = item -> item.getId();
		//Function<Item, Integer> keyExtractor = Item::getId;
		
		//Comparator<Item> comparator = Comparator.comparing(Item::getId, Comparator.reverseOrder());
		
		Comparator<Item> comparator = comparing(Item::getPrice,reverseOrder()).thenComparing(Item::getId,reverseOrder());
		Arrays.sort(items, comparator);
		ArrayUtils.print("Sorting: ", items);
	}

	private static Item[] getItems() {
		return new Item[] {
				
				new Item(1, "Cake", 120, LocalDate.of(2021, 12, 20)),
				new Item(8, "Candy", 180, LocalDate.of(2021, 12, 22)),
				new Item(6, "Tshirt", 180, LocalDate.of(2021, 12, 21)),
				new Item(2, "Hat", 180, LocalDate.of(2019, 12, 18)),
				new Item(3, "Jean", 220, LocalDate.of(2021, 12, 29)),
		};
	}
}
