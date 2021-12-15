package com.collection.list;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 *List ArrayList and raw type problem
 *JDK 1.4
 *
 */

public class Ex01 {
	public static void main(String[] args) {
		// raw type
				// default: list of objects
				
				// required: list of integers
				List salaries = new ArrayList();
				
				// able to add any type: Integer, String, Double, Item
				salaries.add(new Integer(2000));
				salaries.add(new Integer(4000));
				salaries.add("10 triệu"); 
				
				for(Object salary: salaries) {
					System.out.println(Integer.parseInt(salary.toString()));
				}
	}
}
