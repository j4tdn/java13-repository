package com.collections.list;

import java.util.Collections;
import static java.util.Comparator.*;
import java.util.List;

import bean.Item;
import model.DataProvider;

//Comparable: sorting with only one condition
//Comparator: sorting with multiple conditions
public class Ex06 {
	public static void main(String[] args) {
		List<Item> items = DataProvider.getItems();
		// PRIOR TO JAVA 07 
		// Collections.sort(list, Comparator);
		
		// Collections.sort(items);
		// Collections.sort(items, comparing(Item::getStoreId).thenComparing(Item::getItemId, reverseOrder()));
		
		// From JAVA 08 - NEW METHOD 
		// list.sort(Comparator)
		
		items.sort(comparing(Item::getStoreId).thenComparing(Item::getItemId, reverseOrder()));
		DataProvider.printf(items);
	}
}
