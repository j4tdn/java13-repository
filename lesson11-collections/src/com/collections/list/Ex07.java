package com.collections.list;

import java.util.LinkedList;
import java.util.List;

public class Ex07 {
	public static void main(String[] args) {
		// Factory Pattern
		List<Integer> storeAItems = new LinkedList<>();
		storeAItems.add(1);
		storeAItems.add(2);
		storeAItems.add(3);
		storeAItems.add(4);
		storeAItems.add(5);
		
		List<Integer> storeBItems = new LinkedList<>();
		storeBItems.add(4);
		storeBItems.add(5);
		storeBItems.add(6);
		storeBItems.add(7);
		
		// addALL(Hợp), removeAll(Hiệu), retailAll(Giao)
		List<Integer> combinedStoreItems = new LinkedList<>(storeAItems);
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