package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;


public class Ex02 {
public static void main(String[] args) {
	//initial arrays with values
	
	
	//int[]
	int[] digits= {22,44,66,88};
	System.out.println("digits length: "+digits.length);
	System.out.println("digits: "+Arrays.toString(digits));
	System.out.println("digits class name: "+digits.getClass().getSimpleName());
	System.out.println("\n==========================\n");
	
	//String[]
	String[] sequences= {"Tom","Smith","Henry"};
	System.out.println("sequences: "+Arrays.toString(sequences));
	System.out.println("sequences class name: "+sequences.getClass().getSimpleName());
	System.out.println("\n==========================\n");
	
	
	//Item[]
	Item[] items = {
			new Item(1,"item1",120,LocalDate.now()),
			new Item(2,"item2",121,LocalDate.now().minusDays(1)),
			new Item(3,"item3",122,LocalDate.now().plusDays(1))
	};
	System.out.println("Item: "+Arrays.toString(items));
}
private static Item[] mockData() {
	return new Item[] {
			new Item(11,"item1",120,LocalDate.now()),
			new Item(22,"item2",121,LocalDate.now().minusDays(1)),
			new Item(33,"item3",122,LocalDate.now().plusDays(1))
	};
}

}
