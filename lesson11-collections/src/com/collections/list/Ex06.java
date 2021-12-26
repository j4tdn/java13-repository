package com.collections.list;

import java.util.Comparator;
import java.util.List;

import bean.Item;
import model.DataProvider;

/**
 * 
 * Sorting with Collection#List
 * 
 * sort(List<T>): require: T implement Comparable<T> >> Catch the error at compile time
 * sort(List<T>, Comparator<T>)
 * 
 * JAVA Collections
 *  + Collections.sort(List<T>)
 *  + Collections.sort(List<T>, Comparator<T>)
 *  
 *  + list.sort() <<====>> Collections.sort(List<T>, Comparator<T>)
 */
public class Ex06 {
	
	public static void main(String[] args) {
		List<Item> items = DataProvider.getItems();
		
		// Collections.sort(items) Required: T implement Comparable<T>
		// Collections.sort(items, Comparator.comparing(Item::getPrice).thenComparing(Item::getItemID, Comparator.reverseOrder()));
		
		items.sort(Comparator.comparing(Item::getPrice).thenComparing(Item::getItemID, Comparator.reverseOrder()));
		DataProvider.printf(items);
	}
}
