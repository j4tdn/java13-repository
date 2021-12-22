package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<Integer> storeAItems = new ArrayList<>();
		storeAItems.add(1);
		storeAItems.add(2);
		storeAItems.add(3);
		storeAItems.add(4);
		storeAItems.add(5);

		List<Integer> storeBItems = new ArrayList<>();
		storeBItems.add(4);
		storeBItems.add(5);
		storeBItems.add(6);
		storeBItems.add(7);

		// addAll
		List<Integer> combinedStoreItems = new ArrayList<>(storeAItems);
		combinedStoreItems.addAll(storeBItems);
		printf("addAll", combinedStoreItems);

		// removeAll
		combinedStoreItems.removeAll(storeBItems);
		printf("removeAll", combinedStoreItems);

		// retainAll (Giao)
		combinedStoreItems.retainAll(storeAItems);
		printf("retainAll", combinedStoreItems);

	}

	private static void printf(String s, List<Integer> items) {
		System.out.println(s + ": " + items.toString());
	}
}
