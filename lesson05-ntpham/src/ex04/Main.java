package ex04;

public class Main {
	
	public static void main(String[] args) {
		int[] arr = {3, 15, 21, 0, 15, 17, 21};
		int[] result = getUniqueNumbers(arr);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i] + ", ");
		}
	}
	
	public static int[] getUniqueNumbers(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		int k = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(countElement(arr, n, arr[i]) == 1) {
				result[k] = arr[i];
				k++;
			}
		}
		
		for(int i = 0; i < k - 1; i++) {
			if(result[i + 1] < result[i]) {
				int temp = result[i];
				result[i] = result[i + 1];
				result[i + 1] = temp;
			}
		}
		
		return result;
	}
	
	public static int countElement(int a[], int n, int i){
        int count= 0;
        for(int j=0 ; j<n ; j++){
            if(a[j]== i)
            count ++;
        }
        return (count);
    }
}
