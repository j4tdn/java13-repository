package ex04;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		Student[] students = {
				new Student(01, "Nam", 22),
				new Student(02, "Bao", 20),
				new Student(03, "An", 16),
				new Student(04, "Duyen", 16),
				new Student(05, "Duong", 21),
				new Student(06, "Nguyen", 19),
		};
		System.out.println("DES NAME: ");
		objectBubbleSortByName(students, (a, b) -> a-b);
		show(students);
		
		System.out.println("ASC NAME:");
		objectBubbleSortByName(students, (a,b) -> b-a);
		show(students);
		
		System.out.println("DES AGE:");
		objectSelectionSortByAge(students, (a,b) -> a-b);
		show(students);
		
		System.out.println("ASC AGE:");
		objectSelectionSortByAge(students, (a,b) -> b-a);
		show(students);
	}
	
	private static void show(Student[] students) {
		for(Student s: students) {
			System.out.println(s.toString());
		}
	}
	
	private static void objectSelectionSortByAge(Student[] students, Strategy strategy) {
		for(int i = students.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(strategy.check(students[i].getAge(), students[j].getAge()) > 0) {
					Utils.swap(students, j, i);
				}
			}
		}
	}
	
	private static void objectBubbleSortByName(Student[] students, Strategy strategy) {
		for(int i = 0; i < students.length; i++) {
			for(int j = 0; j < students.length - i -1; j++) {
				if(strategy.check(students[j].getName().compareTo(students[j+1].getName()), 0) > 0) {
					Utils.swap(students, j, j+1);
				}
			}
		}
	}
}
