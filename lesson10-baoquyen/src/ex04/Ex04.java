package ex04;

import java.util.Arrays;

/**
 * 
 * Cho mảng số nguyên integer gồm 10 phần tử ngẫu nhiều từ 1-100
 * Đối với Object Sort tạo mảng các Student: {id, name, age}. Sắp xếp tăng dần, giảm dần theo name, age
 * Tạo package sorting => code các thuật toán sau, mỗi thuật toán một hàm.
 *
 */

public class Ex04 {
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6 };	
		bubleSort(arr, (int a, int b) -> (b - a));
		System.out.println(Arrays.toString(arr));
		System.out.println("=================================");
		
		int arr2[] = { 12, 11, 13, 5, 6 };	
		selectionSort(arr2, (int a, int b) -> (b - a));
		System.out.println(Arrays.toString(arr2));
		System.out.println("=================================");
		
		int arr3[] = { 12, 11, 13, 5, 6 };	
		insertionSort(arr3, (int a, int b) -> (b - a));
		System.out.println(Arrays.toString(arr3));
		System.out.println("=================================");
		
		int arr4[] = { 12, 11, 13, 5, 6 };	
		mergeSort(arr4);
		System.out.println(Arrays.toString(arr4));
		System.out.println("=================================");
		
		int arr5[] = { 12, 11, 13, 5, 6 };	
		quickSort(arr5);
		System.out.println(Arrays.toString(arr5));
		System.out.println("=================================");
		
		Student st1 = new Student("111", "Bao", 19);
		Student st2 = new Student("222", "Yen", 16);
		Student st3 = new Student("333", "Nam", 23);
		Student st4 = new Student("123", "An", 20);
		Student[] students = {st1, st2, st3, st4};
		studentAgeSort(students, (int a, int b) -> a - b);
		System.out.println("ESC age: " + Arrays.toString(students));
		studentAgeSort(students, (int a, int b) -> b - a);
		System.out.println("DESC age: " + Arrays.toString(students));
		studentNameSort(students, (int a, int b) -> a - b);
		System.out.println("ESC name: " + Arrays.toString(students));
		studentNameSort(students, (int a, int b) -> b - a);
		System.out.println("DESC name: " + Arrays.toString(students));
	}
	
	public static void swap(int [] arr , int before, int after) {
		int temp = arr[before];
		arr[before] = arr[after];
		arr[after] = temp;
	}
	
	//1.Sắp xếp Nổi bọt – Buble Sort
	public static void bubleSort(int[] arr, Strategy strategy) {
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j< arr.length - 1 - i; j++) {
				if(strategy.compare(arr[j], arr[j + 1]) > 0) {
					swap(arr, j, j + 1);
				}
			}
		}
	}
	
	//2. Săp xếp Kiểu chọn – Selection Sort
	public static void selectionSort(int[] arr, Strategy stategy) {
		for(int i = arr.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(stategy.compare(arr[j], arr[i]) > 0) {
					swap(arr, i, j);
				}
			}
		}
	}
	
	//3. Sắp xếp Kiểu chèn – Insertion Sort
	public static void insertionSort(int[] arr, Strategy strategy) {
		for(int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while(j >= 0 && (strategy.compare(arr[j], temp) > 0) ) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	
	//4. Sắp xếp các đối tượng – Object Sort
	public static void studentNameSort(Student[] students, Strategy strategy) {
		for(int i = 0; i < students.length - 1; i++) {
			for(int j = i + 1; j < students.length; j++ ) {
				if( strategy.compare(students[i].getName().compareTo(students[j].getName()), 0) > 0 ) {
					swap(students, i, j);
				}
			}
		}
	}
	
	public static void studentAgeSort(Student[] students, Strategy strategy) {
		for(int i = 0; i < students.length - 1; i++) {
			for(int j = i + 1; j < students.length; j++ ) {
				if( strategy.compare(students[i].getAge(),students[j].getAge()) > 0) {
					swap(students, i, j);
				}
			}
		}
	}
	
	public static void swap(Student [] arr , int before, int after) {
		Student temp = arr[before];
		arr[before] = arr[after];
		arr[after] = temp;
	}
	
	//5. Shell Sort
	
	
	//6. Merge Sort
	public static void merge(int[] arr, int l, int m, int r) {
		int l1 = m - l + 1; // chiều dài mảng 1
		int l2 = r - m; // chiều dài mảng 2
		int [] leftArr = new int[l1];
		int [] rightArr = new int[l2];
		for(int i = 0; i < l1; i++) {
			leftArr[i] = arr[i+l];
		}
		for(int i = 0; i < l2; i++) {
			rightArr[i] = arr[i + m + 1];
		}
		int i = 0, j = 0, k = l;
		while(i < l1 && j < l2) {
			if(leftArr[i] < rightArr[j] ) {
				arr[k] = leftArr[i];
				i++;
			}else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while(i < l1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j < l2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}		
	}
	
	public static void sort(int[] arr, int l, int r) {
		if (l < r) {
            int m =l+ (r-l)/2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
	}
	
	public static void mergeSort(int[] arr) {
		sort(arr,0,arr.length-1);
	}
	
	//7. QuickSort (Tìm hiểu thuật toán phân hoạch để xử lý)
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for(int j = low; j < high; j++ ) {
			if(arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			} 
		}
		swap(arr, i+1, high);
		return i + 1;
	}
	
	public static void quickSort(int[] arr,int low, int high) {
		if(low < high) {
			int temp = partition(arr, low, high);
			quickSort(arr, low, temp - 1);
			quickSort(arr, temp + 1, high);
		}
	}
	
	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}
}



