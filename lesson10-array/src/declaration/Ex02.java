package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex02 {
	public static void main(String[] args) {
		// initial arrays with values
		
		// int[]
		int[] digits = {22,33,44,55};
		System.out.println("digits: " + digits.length);
		System.out.println("digits: " + Arrays.toString(digits));
		
		//String[]
		String[] sequences = {"Tom","Smith","Henry"};
		System.out.println("digits: " + Arrays.toString(sequences));
		
		System.out.println("==================");
		
		//Item[]
		Item[] items = {
				new Item(1,"Item 1",120, LocalDate.now()),
				new Item(2,"Item 2",120, LocalDate.now().minusDays(1)),
		};
		System.out.println("items: " + Arrays.toString(items));
		
		Item[] mockedItems = mockData();
		System.out.println("items: " + Arrays.toString(mockedItems));
	}
	
	private static Item[] mockData() {
		return new Item[] {
				new Item(1,"Item 1",120, LocalDate.now()),
				new Item(2,"Item 2",120, LocalDate.now().minusDays(1))
				
		};
	}

}
