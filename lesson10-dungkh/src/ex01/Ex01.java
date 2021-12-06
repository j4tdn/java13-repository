package ex01;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 3, 4, 5, 6,7,7,7};
		System.out.print("Remove duplicate elements: ");
		remove(arr);

		System.out.println();

		System.out.print("Compare n/2 front with n/2 behind: ");
		compareAverage(arr);

		findMax3(arr);
	}
	
	private static void remove(int[] origin) {
		int flag;
		for (int i = 0; i < origin.length; i++) {
			flag = 0;
			for (int j = 0; j < origin.length; j++) {
				if (origin[i] == origin[j]) {
					flag++;
				}
			}
			if (flag == 1) {
				System.out.print(" " + origin[i]);
			}
		}
	}
	
	private static void compareAverage(int[] origin) {
		int  start = 0;
		int end = 0;
		
		for (int i = 0; i < origin.length/ 2; i++) {
			start += origin[i];
		}
	
		int mid = (origin.length % 2 == 0) ? origin.length / 2 : origin.length / 2 + 1;
		for (int j = mid; j < origin.length; j++) {
			end += origin[j];
		}
		if (start > end) {
			System.out.println("n/2 first element > n/2 last element");
		} else if (start < end) {
			System.out.println("n/2 last element > n/2 first element ");
		} else {
			System.out.println("n/2 last element = n/2 first element");
		}

	}
	
	private static void findMax3(int[] origin) {
	
		int count = 0;
		for (int i = 0; i < origin.length; i++) {
			for (int j = i + 1; j < origin.length; j++) {
				if (origin[i] > origin[j]) {
					int temp = origin[i];
					origin[i] = origin[j];
					origin[j] = temp;
				}
			}
		}
		
		for (int k = origin.length - 1; k > 0; k--) {
			if (origin[k] != origin[k - 1]) {
				count++;
			}
			if (count == 3) {
				System.out.println("3rd largest element: " + origin[k]);
				break;
			}
		}
	}
}
