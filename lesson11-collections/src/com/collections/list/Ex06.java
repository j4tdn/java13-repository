package com.collections.list;

import java.util.Collections;
import static java.util.Comparator.*;
import java.util.List;

import bean.Item;
import model.DataProvider;
/*
 * 
 */

public class Ex06 {
	public static void main(String[] args) {
		List<Item> items = DataProvider.getItems();
		
		Collections.sort(items, comparing(Item::getStoreID)
						.thenComparing(Item::getItemID, reverseOrder()));
		
		DataProvider.printf(items);
		
	}
}
