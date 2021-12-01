package declaration;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex01 {
public static void main(String[] args) {
	//initial arrays with size
	int[] digits=new int[6];
	digits[2]=22;
	modify(digits);
	System.out.println("Digits: "+Arrays.toString(digits));
	
	//default element: null
	String[] sequences = new String[4];
	sequences[0]="Empty";
	System.out.println();
	System.out.println("Sequences"+Arrays.toString(sequences));
	
	//check does second element in sequences starts with "SGK"
		boolean startWithSgk=(sequences[1] != null && sequences[1].startsWith("SGK"));
		System.out.println("start with SGK: "+startWithSgk);
		
		Item[] items = new Item[8];
		Item itemA=new Item(123,"Item 123",220,LocalDate.now());
		items[0]=itemA;
		System.out.println(Arrays.toString(items));
	
	
	
}

private static void modify(int[] arr) {
	arr[0]=99;
}
}
