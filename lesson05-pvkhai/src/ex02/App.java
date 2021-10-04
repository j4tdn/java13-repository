package ex02;

public class App {
	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 6, 5};
		System.out.println(getMissingNumber(arr));
	}
	
	public static boolean isCheck(int[] arr,  int i) {
			for (int j = 0; j <= arr.length-1; j++) {
				if (i == arr[j]) return true;
			}			
		return false;
	}
	public static int getMissingNumber(int[] arr) {
		for (int i = 1; i <= arr.length; i++) {
			for (int j = 0; j <= arr.length-1; j++) {
				if (!isCheck(arr,i)) return i;
			}			
		}
		return 0;
	}

}
