package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<Integer> storeATtems = new ArrayList<>();
		storeATtems.add(1);
		storeATtems.add(2);
		storeATtems.add(3);
		storeATtems.add(4);
		storeATtems.add(5);
		
		List<Integer> storeBTtems = new ArrayList<>();
		storeBTtems.add(4);
		storeBTtems.add(5);
		storeBTtems.add(6);
		storeBTtems.add(7);
		
		//addALL(Hợp), removeAll(Hiệu), retailAll(Giao)
   		List<Integer> combinedStoreTtems = new ArrayList<>();
		combinedStoreTtems.addAll(storeATtems);
		//combinedStoreTtems.addAll(storeBTtems);
		printf(combinedStoreTtems);	
		
	}
	private static void printf(List<Integer> items) {
		for(Integer item:items) {
			System.out.print(item+" ");
		}
	}
}
