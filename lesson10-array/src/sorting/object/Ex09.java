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
		// C1: anonymous class
		// Comparator<Item> comparator =(i1, i2) -> i1.getId() - i2.getId();
		
		// C2: Comparator.comparing
//		Function<Item, Integer> keyExtractor = new Function<Item, Integer>() {
//
//			@Override
//			public Integer apply(Item t) {
//				return t.getId();
//			}
//		};
//		Comparator<Item> comparator = Comparator.comparing(keyExtractor);
		
		// C3: Comparator.comparing >>lambda
//		Function<Item, Integer> keyExtractor = item -> item.getId();
//		Comparator<Item> comparator = Comparator.comparing(keyExtractor);
		
		// C4: Comparator.comparing >> lambda >> method reference in JAVA08
		// (Item item) ->item.getId() <==> Item::getId
		// Function<Item, Integer> keyExtractor = Item::getId;

		// Comparator<Item> comparator = comparing(Item::getId);
		Comparator<Item> comparator = comparing(Item::getPrice).thenComparing(Item::getId, reverseOrder());
		Arrays.sort(items, comparator);
		ArrayUtils.print("Sorting Items", items);
	}
	
	private static Item[] getItems() {
		return new Item[] {
				new Item(1, "Cake Atz",   120, LocalDate.of(2021, 12, 20)),
				new Item(8, "Candy Zkq",  180, LocalDate.of(2021, 12, 22)),
				new Item(6, "Tshirt Atz", 180, LocalDate.of(2019, 12, 21)),
				new Item(2, "Hat ytz",    180, LocalDate.of(2021, 10, 10)),
				new Item(3, "Jean Qto",   150, LocalDate.of(2021, 9,  28))
		};
	}
}
