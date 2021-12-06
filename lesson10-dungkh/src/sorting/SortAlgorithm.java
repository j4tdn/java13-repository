package sorting;

public class SortAlgorithm {
    
	public static void swap (int[] origin, int i, int j) {
		int temp = origin[i];
		origin[i] = origin[j];
		origin[j] = temp;
	}
	// Bubble Sort
	private static void bubbleSort(int[] numbers) {
		int tmp;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 1; j < numbers.length - i; j++) {
				if (numbers[j - 1] > numbers[j]) {
					swap(numbers,j-1,j);
				}
			}
		}
	}
	
		// Selection Sort
		private static void selectionSort(int[] numbers) {
			
			for (int i = 0; i < numbers.length - 1; i++) {
				int min_idx = i;
				for (int j = i + 1; j < numbers.length; j++) {
					if (numbers[j] < numbers[min_idx])
						min_idx = j;
				}
			swap(numbers,i,min_idx);
			}
		}
		
		// Insertion Sort
		private static void insertionSort(int[] numbers) {
			int n = numbers.length;
			for (int i = 1; i < n; i++) {
				int key = numbers[i];
				int j = i - 1;

				while (j >= 0 && numbers[j] > key) {
					numbers[j + 1] = numbers[j];
					j = j - 1;
				}
				numbers[j + 1] = key;
			}
		}

}
