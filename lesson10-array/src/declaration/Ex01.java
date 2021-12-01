package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex01 {
	public static void main(String[] args) {
		//array is an object
		//initial arrays with size 
		int[] digits = new int[6];
		modify(digits);
		System.out.println(digits);
		
		System.out.println("=============");
		
		String[] sequences = new String[4];
		sequences[0] = "Empty";
		
		//check does second element in sequences starts with "SGK"
		boolean startSGK = sequences[1] != null && sequences[1].startsWith("SGK");
		System.out.println("start with SGK: " + startSGK);
		
		System.out.println("sequences: " + Arrays.toString(sequences));
		
		System.out.println("=============");
		
		Item[] items = new Item[8];
		Item itemA = new Item(123, "Item123", 220, LocalDate.now());
		items[0] = itemA;
		
		System.out.println(Arrays.toString(items));
		
		
	}
	private static void modify(int[] input) {
		input[0] = 99;
	}
}
