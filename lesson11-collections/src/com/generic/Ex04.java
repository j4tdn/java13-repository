package com.generic;

public class Ex04 {
	public static void main(String[] args) {
		IList<String> students = new CustomList<String>();
		
		students.add("Vu Le");
		students.add("Nam Hoang");
		students.add("Teo Le");
		students.add("Ti");
		students.add("Thoc");
		
		
		System.out.println("E2:" + students.get(2));
		System.out.println("Size: " + students.size());
		System.out.println("===========");
		
		students.show();
		System.out.println("===========");
		
		System.out.println("count: " + students.count(student->student.contains("Le")));
	}
}
