package sorting.object;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;
import utils.Utils;

public class Ex08 {
	public static void main(String[] args) {
		Item[] items = getItems();
		Arrays.sort(items);

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
