package ex04;

import java.util.Arrays;


public class Ex04 {
	public static void main(String[] args) {
		Student[] students = { new Student(01, "Dung", 22), new Student(02, "Dat", 21), new Student(03, "Chau", 23) };
		System.out.println(" Sort Age: " + Arrays.toString(sortAge(students)));
		
	}
	private static Student[] sortAge(Student[] students) {
		Student[] arr = students;
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr.length-i-1; j++) {
				if(arr[j].getAge()>arr[j+1].getAge()) {
				swap(arr, j+1, j);
				}
			}
		}
		return arr;
	}
	private static void swap (Object[] origin, int i, int j) {
		Object temp = origin[i];
		origin[i] = origin[j];
		origin[j] = temp;
	}

}
