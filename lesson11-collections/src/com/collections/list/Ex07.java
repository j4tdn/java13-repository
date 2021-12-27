package com.collections.list;

import java.util.LinkedList;
import java.util.List;

public class Ex07 {
	
	public static void main(String[] args) {
		// Factory pattern
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
		
		// addAll (Hợp), removeAll(Hiệu), retailAll 
		List<Integer> combinedStoreItems = new LinkedList<>(storeAItems);
		combinedStoreItems.addAll(storeBItems);
		printf(combinedStoreItems);
		
		combinedStoreItems.removeAll(storeBItems);
		printf(combinedStoreItems);
		
		storeAItems.retainAll(storeBItems);
		printf(storeAItems);
	}
	
	private static void printf(List<Integer> items) {
		for(Integer item : items) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
}
