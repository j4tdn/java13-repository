package com.generic;

import java.util.function.Predicate;

public class ListUtils {
	private ListUtils() {
		
	}
	
	public static <E extends CharSequence> int count(IList<E> list, Predicate<E> predicate) {
		return list.count(predicate);
	}
}