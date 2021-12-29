package com.generic;

public class Ex04 {
	public static void main(String[] args) {
		IList<String> students = new CustomList<>();

		students.add("Vu Le");
		students.add("Nam Hoang");
		students.add("Hai Van");
		students.add("Teo Pham");
		students.add("Hong Hoang");

		students.set(2, "Hoa Le");
		System.out.println("E2: " + students.get(2));
		
		System.out.println("count: " + students.count(student -> student.contains("Le")));

		System.out.println("count: " + ListUtils.count(students, student -> student.contains("Le")));

		System.out.println("size: " + students.size());
		System.out.println("===================");
		students.show();
	}
}
