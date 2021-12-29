package com.generic;

import java.util.ArrayList;
import java.util.List;

public class Ex06 {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		List<Integer> intList2 = new ArrayList<>();

		List<Float> floatList = new ArrayList<>();
		List<Float> floatList2 = new ArrayList<>();

		copy(intList, intList2);

		move(intList, floatList);
	}

	public static <T extends Number> void copy(List<T> dest, List<T> src) {
		dest.addAll(src);
	}

	public static void move(List<? extends Number> dest, List<? extends Number> src) {
		// dest.addAll(src);
	}
}
