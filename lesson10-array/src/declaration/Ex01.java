package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = new int[6];
		modify(digits);
		System.out.println(Arrays.toString(digits));
		
		String[] sequences = new String[4];
		sequences[0] = "Empty";
		sequences[1] = "SGK abc";
		boolean startWithSgk = (sequences[1] != null&&sequences[1].startsWith("SGK"));
		
		System.out.println("checking: " + startWithSgk);
		System.out.println("sequences: " + Arrays.toString(sequences));
		System.out.println("==============");
		
		Item[] items = new Item[8];
		items[0] = new Item(123, "Item 123", 220, LocalDate.now());
		System.out.println(Arrays.toString(items));
	}
	private static void modify(int[] input) {
		input[0] = 99;
	}
}
