package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		//raw type
		//default : list of object
		
		//required : list of integer
		List salaries = new ArrayList();
		
		salaries.add(new Integer(2000));
		salaries.add(new Integer(4000));
		
		System.out.println(salaries);

		
	}
}
