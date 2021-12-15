package sorting.object;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;
import utils.ArraysUtils;

public class Ex08 {
	public static void main(String[] args) {
		Item[] items = getItems();
		
		//Opt2: Ex02
		// restricted of comparable
		// Apply each sort rule for each object
		// it's not case in reality
		// solve: Comparator
		
		Arrays.sort(items);
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
