package ex04;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex04 {
	public static void main(String[] args) {
		Student[] students = { new Student(123, "John", 21), new Student(221, "Danny", 28), new Student(333, "Marry", 18) };
		System.out.println("AscendingAge: " + Arrays.toString(ascendingAge(students)));
		System.out.println("DescendingAge: " + Arrays.toString(descendingAge(students)));
		System.out.println("AscendingName: " + Arrays.toString(ascendingName(students)));
		System.out.println("DescendingName: " + Arrays.toString(descendingName(students)));
	}
	private static Student[] ascendingAge(Student[] students) {
		Student[] a = students;
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a.length-i-1; j++) {
				if(a[j].compareByAge(a[j+1])) {
					ArrayUtils.swap(a, j+1, j);
				}
			}
		}
		return a;
	}
	private static Student[] descendingAge(Student[] students) {
		Student[] a = students;
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a.length-i-1; j++) {
				if(!a[j].compareByAge(a[j+1])) {
					ArrayUtils.swap(a, j+1, j);
				}
			}
		}
		return a;
	}
	private static Student[] ascendingName(Student[] students) {
		Student[] a = students;
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a.length-i-1; j++) {
				if(a[j].compareByName(a[j+1])>0) {
					ArrayUtils.swap(a, j+1, j);
				}
			}
		}
		return a;
	}
	private static Student[] descendingName(Student[] students) {
		Student[] a = students;
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a.length-i-1; j++) {
				if(a[j].compareByName(a[j+1])<0) {
					ArrayUtils.swap(a, j+1, j);
				}
			}
		}
		return a;
	}
}
