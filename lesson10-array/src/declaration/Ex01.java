package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex01 {

	public static void main(String[] args) {
		// Array is object
		// initial arrays with size

		// default element: 0
		int[] digits = new int[6];
		digits[2] = 22;
		modify(digits);
		System.out.println(Arrays.toString(digits));

		System.out.println("\n=====\\\\\\=====\n");

		// default element = null
		String[] sequences = new String[4];
		sequences[0] = "Empty";
		System.out.println("sequences: " + Arrays.toString(sequences));

		System.out.println("\n=====\\\\\\=====\n");

		// check does second element in sequences start with "SKG"
		boolean startWithSGK = (sequences[1] != null && sequences[1].startsWith("SGK"));
		System.out.println("start with SGK: " + startWithSGK);

		System.out.println("\n=====\\\\\\=====\n");

		// default element: null
		Item[] items = new Item[8];
		items[0] = new Item(01, "Item A", 220, LocalDate.now());
		System.out.println(Arrays.toString(items));
		
	}

	private static void modify(int[] input) {
		input[0] = 99;
	}
}
