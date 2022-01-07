package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<Integer> storeAItems = new ArrayList<Integer>();
		storeAItems.add(1);
		storeAItems.add(2);
		storeAItems.add(3);
		storeAItems.add(4);
		storeAItems.add(5);

		List<Integer> storeBItems = new ArrayList<Integer>();
		storeBItems.add(4);
		storeBItems.add(5);
		storeBItems.add(6);
		storeBItems.add(7);

		// addALL(Hợp), removeAll(Hiệu), retailAll(Giao)
		List<Integer> combinedStoreItems = new ArrayList<Integer>(storeAItems);
		combinedStoreItems.retainAll(storeBItems);
		printf(combinedStoreItems);
	}

	private static void printf(List<Integer> items) {
		for (Integer item: items) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
}