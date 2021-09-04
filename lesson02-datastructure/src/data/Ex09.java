package data;

import bean.Digit;
import bean.Item;

public class Ex09 {
	public static void main(String[] args) {
		Item item1 = new Item(1, "Cake", 20);
		Item item2 = new Item(1, "Cake", 20);
		Item item3 = new Item(2, "Candy", 50);
		Item item4 = new Item(3, "Milk", 50);
		
		System.out.println("s1: " + System.identityHashCode(item1));
		System.out.println("s2: " + System.identityHashCode(item2));
		System.out.println("s3: " + System.identityHashCode(item3));
		System.out.println("s4: " + System.identityHashCode(item4));
		item1 = new Item(2, "hi", 4);
		Item i5 = item1;
		System.out.println("s1: " + System.identityHashCode(item1));
		System.out.println("s1: " + System.identityHashCode(i5));
		System.out.println("===============");
		
		System.out.println("s1: " + item1);
		System.out.println("s2: " + item2);
		System.out.println("s3: " + item3);
		System.out.println("s4: " + item4);
	}

}
