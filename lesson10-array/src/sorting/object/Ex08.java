package sorting.object;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;
import utils.ArrayUtils;

public class Ex08 {
	public static void main(String[] args) {
		Item[] items = getItems();
		
		//refer ex02
		//restricted of comparable
		//apply each sort rule each object 
		
		//it is not the case in reality
		
		//solve: Comparator Ex09
		
		Arrays.sort(items);
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
