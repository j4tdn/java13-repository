package com.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * ArrayList
 * JDK:1.4
 *
 */

public class Ex01 {
	public static void main(String[] args) {
		// raw type
		//default: list of objects
		
		// requuired: list of integers
		List listA = new ArrayList();
		
		// able to add any type: Integer, String, Double, Item
		listA.add(new Integer(20));
		listA.add(new Integer(40));
		listA.add("10 triệu"); // compile time >> no error
		                       // runtime >> error : java.lang.NumberFormatException: For input string: "10 triệu"
		
		//List listB = new LinkedList();
		for(Object list:listA) {
			//System.out.println(listA*2); // không cho nhân 2 vì kiểu đang là object kiểu string
			System.out.println(Integer.parseInt(listA.toString())*2);
		}
		
		// Problems
		// 1. Display warning message for raw type(no pas parameter for List)
		// 2. Allow to add any type in List
		//   >> compile time will no show error
		//   >> appear the error at runtime >> hard to find the root cause
		// 3.Expect error at compile time
	}

}
