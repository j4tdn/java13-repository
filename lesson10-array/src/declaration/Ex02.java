package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex02 {
	
	public static void main(String[] args) {
		// initial arrays with values

		// int[]
		int[] digits = { 22, 44, 88, 66 };
		System.out.println(digits.length);
		System.out.println("digits: " + Arrays.toString(digits));
		System.out.println("digits class name: " + digits.getClass().getSimpleName());

		System.out.println("\n=======\\\\\\\\\\=======\n");

		// String[]
		String[] sequences = new String[] { "Tom", "Jerry", "Messi" };
		System.out.println("sequences: " + Arrays.toString(sequences));
		System.out.println("sequences: " + sequences.getClass().getSimpleName());

		System.out.println("\n=======\\\\\\\\\\=======\n");

		// Item
		Item[] items = { new Item(1, "Item A", 220, LocalDate.now()),
				new Item(2, "Item B", 200, LocalDate.now().minusDays(1)),
				new Item(3, "Item C", 200, LocalDate.now().plusDays(5)) };
		System.out.println(Arrays.toString(items));

		System.out.println("\n=======\\\\\\\\\\=======\n");

		Item[] mockedItems = mockData();
		System.out.println(Arrays.toString(mockedItems));
	}
	
	private static Item[] mockData() {
		
		return new Item[] {new Item(11, "Item A", 220, LocalDate.now()),
						   new Item(22, "Item B", 200, LocalDate.now().minusDays(1)),
						   new Item(33, "Item C", 200, LocalDate.now().plusDays(5))
						  }; 
		
	}
}
