package com.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex08 {
	// N=50001
	// GET, SET, ADD, REMOVE
	// Position: 0, 1000, 49000, 50000
	private static int COUNT = 50000;

    public static void main(String[] args) {
        List<String> arraylist = new ArrayList<>();
        List<String> linkedlist = new LinkedList<>();

        // Add Last
        long start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            arraylist.add("element # " + i);
        }
        System.out.println("Add " + COUNT + " elements: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            linkedlist.add("element # " + i);
        }
        System.out.println("Add " + COUNT + " elements: LikedList took "
                + (System.currentTimeMillis() - start) + "ms");

        // Add at index: "0" 1000 40000
        for (int i = 0; i < COUNT; i++) {
            arraylist.add(25000, "element # " + i);
        }
        System.out.println("Add at index 25000: " + COUNT
                + " elements: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            linkedlist.add(25000, "element # " + i);
        }
        System.out.println("Add at index 25000: " + COUNT
                + " elements: LinkedList took "
                + (System.currentTimeMillis() - start) + "ms");

        // Get
        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            arraylist.get(i);
        }
        System.out.println("Get element: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            linkedlist.get(i);
        }
        System.out.println("Get element: LinkedList took "
                + (System.currentTimeMillis() - start) + "ms");

        // Update
        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            arraylist.set(i, "modified element # " + i);
        }
        System.out.println("Update element: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            linkedlist.set(i, "modified element # " + i);
        }
        System.out.println("Update element: LinkedList took "
                + (System.currentTimeMillis() - start) + "ms");

        // Remove at index: "0"
        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            arraylist.remove(0);
        }
        System.out.println("Remove element: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            linkedlist.remove(0);
        }
        System.out.println("Remove element: LinkedList took "
                + (System.currentTimeMillis() - start) + "ms");
    }
}