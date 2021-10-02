package ex02;

public class App {
	public static void main(String[] args) {
		int []arr1 = {3,2,1,6,5};
		int []arr2 = {1,2,3,4,5,6,};
		System.out.println(getMissingNumber(arr1, arr2));
	}
	
	public static int getMissingNumber(int []arr1, int[] arr2) {
		int b = 0;
		for(int i=0;i<arr1.length;i++) {
			for(int j = 0 ;j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) break;
				else b = arr2[j];
			}
		}
		return b;

	}

}
