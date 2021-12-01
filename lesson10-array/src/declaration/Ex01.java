package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex01 {
	public static void main(String[] args) {
		// initial arrays with size
		int[] digits = new int[6]; // arrays is an object
		modify(digits);
		System.out.println(digits);
		
		for (int digit : digits) {
			System.out.println(digit);
		}
		System.out.println(Arrays.toString(digits));

		String[] sequences = new String[10];
		sequences[0] = "empety";
		System.out.println(Arrays.toString(sequences));
		
		boolean startWithSgk = (sequences[1] != null && sequences[1].startsWith("Sgk"));
		System.out.println("start with sgk: " + startWithSgk);
		
		
		Item[] items = new Item[8];
		
		items[0] = new Item(123, "123", 220, LocalDate.now());
		System.out.println(Arrays.toString(items));
		
	}

	private static void modify(int[] input) {
		input[0] = 99;
	}
}
