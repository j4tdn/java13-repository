package ex04;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] array = {1,1,2,2,3,4,5,6,6};
		
		System.out.print("Các phần tử xuất hiện 1 lần trong mảng là: ");
		for (int i = 0; i < array.length; i++) {
			if (getUniqueNumbers(array, array.length, array[i]) == 1)
				System.out.print("[ " + array[i] + " ]" );
		}
	}

	public static int getUniqueNumbers(int a[], int n, int i) {
		int count = 0;
		for (int j = 0; j < n; j++) {
			if (a[j] == i)
				count++;
		}
		return (count);
	}
}
