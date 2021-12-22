package com.collections.list;

import java.util.Collections;
import static java.util.Comparator.*;
import java.util.List;

import bean.Item;
import model.DataProvider;
/**
 * Sorting with Collection#List
 * sort(List<T>): required : T implement Comparable<T> >> catch the error at compile time
 * sort(List<T>, Comparator<T>)
 */
public class Ex06 {
	public static void main(String[] args) {
		List<Item> items = DataProvider.getItems();
		// Collections.sort(items);     required: T implement Comparator<T>
		
//		Collections.sort(items, comparing(Item::getStoreId)
//				.thenComparing(Item::getItemId).reversed());
		
		items.sort(comparing(Item::getStoreId).thenComparing(Item::getItemId, reverseOrder()));
		DataProvider.printf(items);
	}
	
}
