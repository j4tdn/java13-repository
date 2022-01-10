package com.generic;

import java.util.function.Predicate;

public interface IList<E> {
	boolean add(E e);
	boolean remove(E e);
	boolean remove(int i);
	E get(int i);
	E set(int i, E e);
	
	boolean isEmpty();
	int size();
	void show();
	

	// strategy pattern
	int count(Predicate<E> predicate);
	
}
