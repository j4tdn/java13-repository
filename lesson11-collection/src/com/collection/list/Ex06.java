package com.collection.list;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

import java.util.ArrayList;
import java.util.List;

import bean.Item;


/**
 * Sorting with Collections#List
 * 
 * sort(List<T>): required: T implement Comparable<T> >> catch the error at compile time
 * sort(List<T>, Comparator<T>)
 * 
 * JAVA Collections - PRIOR TO JAVA 07
 * + Collections.sort(List<T>)
 * + Collections.sort(List<T>, Comparator<T>)
 * 
 * + JAVA 08 - NEW METHOD
 * + list.sort(Comparator<T>)     <<====>> Collections.sort(List<T>, Comparator<T>)
 */
public class Ex06 {
	public static void main(String[] args) {
		List<Item> items = getItems();

		// Collections.sort(items); required: T implement Comparable<T>

		// Collections.sort(items, comparing(Item::getStoreId)
						   // .thenComparing(Item::getItemId, reverseOrder()));

		items.sort(comparing(Item::getStoreId)
			  .thenComparing(Item::getItemId, reverseOrder()));

		printf(items);
	}

private static List<Item> getItems() {
		
		List<Item> items = new ArrayList();
		items.add(new Item(1, 1, "Store 1 - Item 1", 120));
		items.add(new Item(1, 2, "Store 1 - Item 2", 260));
		items.add(new Item(1, 3, "Store 1 - Item 3", 170));
		items.add(new Item(2, 3, "Store 2 - Item 3", 110));
		items.add(new Item(2, 4, "Store 2 - Item 4", 90));
		items.add(new Item(3, 5, "Store 3 - Item 5", 120));
		items.add(new Item(3, 6, "Store 3 - Item 6", 290));
		return items;
	}
	
	private static void printf(List<Item> items) {
		for(Item item: items) {
			System.out.println(item);
		}
	}
}
