package ex04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import ex03.Utils;

public class Sorting {
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		Student[] students = new Student[] { 
				new Student("sv01", "Nguyen Hoang Nguyen", 26),
				new Student("sv02", "Vu Viet Anh", 27), 
				new Student("sv03", "Pham Son", 25),
				new Student("sv04", "Le Minh Tri", 28), 

		};
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100) + 1;
		}
		
		bubleSort(arr);
		System.out.println("Buble Sort: " + Arrays.toString(arr));
		System.out.println("===========\\\\\\\\\\\\\\\\\\\\\\==============");
		selectionSort(arr);
		System.out.println("Selection Sort: " + Arrays.toString(arr));
		System.out.println("===========\\\\\\\\\\\\\\\\\\\\\\==============");
		insertionSort(arr);
		System.out.println("Insertion Sort: " + Arrays.toString(arr));
		System.out.println("===========\\\\\\\\\\\\\\\\\\\\\\==============");
		objectSort(students);
		System.out.println("Object Sort: " + Arrays.toString(students));
		System.out.println("===========\\\\\\\\\\\\\\\\\\\\\\==============");
		shellSort(arr);
		System.out.println("Shell Sort: " + Arrays.toString(arr));
		System.out.println("===========\\\\\\\\\\\\\\\\\\\\\\==============");
		sort(arr, 0, arr.length - 1);
		System.out.println("Merge Sort: " + Arrays.toString(arr));
	}
	
	private static void bubleSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i- 1; j++) {
				if(arr[j] > arr[j + 1]) {
					Utils.swap(arr, j, j + 1);
				}
			}
		}
	}
	
	private static void selectionSort(int[] arr) {
		for(int i = arr.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j] < arr[j + 1]) {
					Utils.swap(arr, j, j + 1);
				}
			}
		}
	}
	
	private static void insertionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j -= 1;
			}
			
			arr[j + 1] = key;
		}
	}
	
	private static void objectSort(Student[] students) {
		
		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				if (s1 == null) {
					return -1;
				}
				if (s2 == null) {
					return 1;
				}
				if(!s1.getName().equalsIgnoreCase(s2.getName())) {
					String name1 = s1.getName();
					String name2 = s2.getName();
					String[] nameSplit1 = name1.split("[\\s]+");
					String[] nameSplit2 = name2.split("[\\s]+");
					if(nameSplit1[nameSplit1.length - 1].equalsIgnoreCase(nameSplit2[nameSplit2.length - 1])) {
						return name1.compareTo(name2);
					} else {
						return nameSplit1[nameSplit1.length - 1].compareTo(nameSplit2[nameSplit2.length - 1]);
					}
				} else {
					return s1.getAge() > s2.getAge() ? 1 : (s1.getAge() == s2.getAge()) ? 0 : -1;
				}
			}
		});
	}
	
	private static void shellSort(int[] arr) {
		for(int gap = arr.length / 2; gap > 0; gap /= 2) {
			for(int i = gap; i < arr.length; i++) {
				int temp = arr[i];
				int j;
				for(j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
					arr[j] = arr[j - gap];
					arr[j] = temp;
				}
			}
		}
		
	}
	
	private static void sort(int[] arr, int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			sort(arr, left, mid);
			sort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}
	
	private static void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i = 0; i < n1; i++) {
			L[i] = arr[left + i];
		}
		
		for(int j = 0; j < n2; j++) {
			R[j] = arr[mid + 1 + j];
		}
		
		int i = 0; int j = 0;
		int k = left;
		while(i < n1 && j < n2) {
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}
