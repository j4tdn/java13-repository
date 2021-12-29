package com.generic;

import java.util.function.Predicate;

public class ListUtils {
	private ListUtils() {
	}

	//String is final class, and cannot be further extended
	public static <E extends CharSequence> int count(IList<E> list, Predicate<E> predicate) {
		return list.count(predicate);
	}
}
