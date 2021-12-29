package com.generic;

import java.util.function.Predicate;

public class ListUtils {
	private ListUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static <E extends CharSequence> int count(IList<E> list, Predicate<E> predicate) {
		return list.count(predicate);
	}
}
