package sorting.object;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Comparator.*;
import java.util.function.Function;

import bean.Item;
import utils.ArraysUtils;

public class Ex09 {
	public static void main(String[] args) {
		Item[] items = getItems();
		
		// Required comparable<Item>
		// Arrays.sort(items);
		
		// Comparator >> Item don't need to implement from comparable<Item>
		// Reference: EX06, Ex07
//		Comparator<Item> comparator = (i1, i2) -> i1.getId() - i2.getId();
		
		
		//C2: Comparator.comparing
//		Function<Item , Integer> keyExtractor = new Function<Item, Integer>() {
//			public Integer apply(Item item) {
//				return item.getId();
//			}
//		};
		
		
		// C3: Comparator.comparing >> lambda
//		Function<Item , Integer> keyExtractor = (item) -> item.getId();
		// C4: Comparator.comparing >> lambda >> method reference in Java08
		// (Item item) -> item.getPrice
		
		
		
//		Comparator<Item> comparator = Comparator.comparing(keyExtractor);
		Arrays.sort(items,comparing(Item::getPrice).themComparing(Item::getId,reservese()));
		
		ArraysUtils.print("Sort Items: ", items);
		
	}
	
	public static Item[] getItems() {
		return new Item[] {
				new Item(1, "Cake Atz",   120, LocalDate.of(2021, 12, 20)),
				new Item(8, "Candy Zkq",  180, LocalDate.of(2021, 12, 22)),
				new Item(6, "Tshift Atz", 180, LocalDate.of(2021, 12, 21)),
				new Item(2, "Hat ytz",    180, LocalDate.of(2021, 10, 10)),
				new Item(3, "Jean Qto",   150, LocalDate.of(2021, 9, 28)),
		};
	}
}
