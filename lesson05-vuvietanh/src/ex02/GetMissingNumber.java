package ex02;

public class GetMissingNumber {
	public static void main(String[] args) {
	     int arr[] = {1,3,5,2,8,6,9,10,7};
	     int n = getMissingNumber(arr,10);
	    System.out.println("Số còn thiếu: "+n);


	}
	private static int getMissingNumber(int[] arr, int n) {

	    int acctualnumber =0;
	    int expectednumber = (n*(n+1)/2);

	    for (int j : arr) {
	        acctualnumber = acctualnumber+j;

	    }
	    return expectednumber-acctualnumber;

	}
}
