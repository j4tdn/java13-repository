package com.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex08 {
	// N = 50001
	// Get, Set, Add, Remove
	// Position: 0, 1000, 49000, 50000

	private static int COUNT = 50000;

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();

		// Add
		long start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			arrayList.add("element # " + i);
		}
		System.out.println("Add " + COUNT + " elements: ArrayList took "
				+ (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			linkedList.add("element # " + i);
		}
		System.out.println("Add " + COUNT + " elements: LikedList took "
				+ (System.currentTimeMillis() - start) + "ms");

		// Add at index: 0 1000 40000
		for (int i = 0; i < COUNT; i++) {
			arrayList.add(49999, "element # " + i);
		}
		System.out.println("Add at index 49000: " + COUNT
				+ " elements: ArrayList took "
				+ (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			linkedList.add(49999, "element # " + i);
		}
		System.out.println("Add at index 49000: " + COUNT
				+ " elements: LinkedList took "
				+ (System.currentTimeMillis() - start) + "ms");

		// Get
		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			arrayList.get(i);
		}
		System.out.println("Get element: ArrayList took "
				+ (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			linkedList.get(i);
		}
		System.out.println("Get element: LinkedList took "
				+ (System.currentTimeMillis() - start) + "ms");

		// Update
		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			arrayList.set(i, "modified element # " + i);
		}
		System.out.println("Update element: ArrayList took "
				+ (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			linkedList.set(i, "modified element # " + i);
		}
		System.out.println("Update element: LinkedList took "
				+ (System.currentTimeMillis() - start) + "ms");

		// Remove
		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			arrayList.remove(0);
		}
		System.out.println("Remove element: ArrayList took "
				+ (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			linkedList.remove(0);
		}
		System.out.println("Remove element: LinkedList took "
				+ (System.currentTimeMillis() - start) + "ms");
	}

}
