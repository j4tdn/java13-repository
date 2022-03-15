package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<Integer> storeAItems =  new ArrayList<Integer>();
		storeAItems.add(1);
		storeAItems.add(2);
		storeAItems.add(3);
		storeAItems.add(4);
		storeAItems.add(5);

		List<Integer> storeBItems =  new ArrayList<Integer>();
		storeBItems.add(4);
		storeBItems.add(5);
		storeBItems.add(6);
		storeBItems.add(7);
		storeBItems.add(8);
		
		//addAll(Hợp), removeAll(Hiệu), retainAll(Giao)
		List<Integer> combinedItems = new ArrayList<Integer>();
		combinedItems.addAll(storeAItems);
		combinedItems.retainAll(storeBItems);
		printf(combinedItems);
	}
	
	private static void printf(List<Integer> list) {
		for(Integer i: list) {
			System.out.print(i + " ");
		}
	}
	
}
