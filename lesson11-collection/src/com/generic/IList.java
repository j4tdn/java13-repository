package com.generic;

import java.util.function.Predicate;

public interface IList<E> {
	boolean add(E e);
	boolean remove(int i);
	boolean remove(E e);
	boolean isEmpty();
	E get(int i);
	E set(int i, E e);
	int size();
	void show();
	
	// Strategy pattern 
	int count(Predicate<E> predicate);
}
