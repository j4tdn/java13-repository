package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex01 {
	public static void main(String[] args) {
		// array is an object
		// initial arrays with size 
		
		// default element: 0
		int[] digits = new int[6];
		digits[2] = 22;
		modify(digits);
		System.out.println("digits: " + Arrays.toString(digits));
		
		System.out.println("\n=====\\\\\\\\=====\n");
		
		// default element: null
		String[] sequences = new String[4];
		sequences[0] = "Empty";
		System.out.println("sequences: " + Arrays.toString(sequences));

		// check second element in sequences start with "SGK"
		boolean startWithSgk =  sequences[1] != null && sequences[1].startsWith("SGK");
		System.out.println("checking: " + startWithSgk);
	
		System.out.println("\n=====\\\\\\\\=====\n");

		Item[] items = new Item[8];
		items[0] = new Item(123, "Item 123", 220, LocalDate.now());
		System.out.println(Arrays.toString(items));
		
	}
	
	private static void modify(int[] input) {
		input[0] = 99;
		
	}
}
