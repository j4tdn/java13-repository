package sorting.object;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;
import utlis.ArrayUtils;

public class Ex08 {
	public static void main(String[] args) {
		Item[] items = getItems();
		
		//C1 
		Arrays.sort(items);
		ArrayUtils.print("Sorting: ", items);
		
	}
	
	private static Item[] getItems() {
		return new Item[] {
				new Item(1,"Cake Atz", 120, LocalDate.of(2021,12,20)),
				new Item(8,"Candy Zkq", 150, LocalDate.of(2021,12,22)),
				new Item(6,"Tshift Atz", 160, LocalDate.of(2021,12,21)),
				new Item(2,"Hat ytx", 100, LocalDate.of(2021,10,20)),
				new Item(3,"Jean Ati", 120, LocalDate.of(2021,9,20)),
		};
	}

}
