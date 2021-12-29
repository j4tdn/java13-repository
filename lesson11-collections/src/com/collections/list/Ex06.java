package com.collections.list;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

import java.util.Collections;
import java.util.List;

import been.Item;
import model.DataProvider;
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
		List<Item> items = DataProvider.getItems();
		
		// Arrays.sort(itemArray) // non-require
		Collections.sort(items); // required: T implement Comparable<T>
		
		Collections.sort(items, comparing(Item::getStoreId)
				   .thenComparing(Item::getItemId, reverseOrder()));
		
		items.sort(comparing(Item::getStoreId)
				  .thenComparing(Item::getItemId, reverseOrder()));
		
		DataProvider.printf(items);
	}

	
}
