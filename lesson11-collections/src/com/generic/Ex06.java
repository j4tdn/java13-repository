package com.generic;

import java.util.ArrayList;
import java.util.List;

public class Ex06 {
	public static void main(String[] args) {
		List<Integer> intList1 = new ArrayList<>();
		List<Integer> intList2 = new ArrayList<>();
		
		List<Float> floatList1 = new ArrayList<>();
		List<Float> floatList2 = new ArrayList<>();
		
		copy(intList1, intList2);
		//copy(intList1, floatList1);
		
		move(intList1, intList2);
		move(intList1, floatList1);
	}
	
	public static <T extends Number> void copy(List<T> dest, List<T> src) {
		dest.addAll(src);
	}
	
	public static void move(List<? extends Number> dest, List<? extends Number> src) {
		//dest.addAll(src);
	}
}
