package ex04;

import java.util.Arrays;

// 15đ
public class UniqueNumbers {
	public static void main(String[] args) {
		int[] arr = {3, 15, 21, 0, 15, 17, 21};
		
		// Cách này có cái chưa tốt đó là VD giá trị 15(arr[0]) mình biết 15 là phần tử bị trùng
		// Nhưng qua cái 15(arr[4]) mình phải kiểm tra 1 lần nữa
		// dup code
		int[] result = getUniqueNumbers(arr);
		
		sort(result);
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ", ");
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
		
		// '0, 3, 17', >0, 0, 0, 0<,
		// Vì mảng có số lượng phần tử cố định. Nên khi a làm như này nó sẽ ra
		// >0000< thừa phía sau. KQ nên chứa 0 3 17
		// >> Mình có k chính là số lượng phần tử xuất hiện 1 lần
		// Nên dùng hàm Arrays.copyOfRange(result, 0, k) để copy 0 3 17 tử mảng result qua mảng mới để return
		return Arrays.copyOfRange(result, 0, k);
	}
	
	// Nên tách riêng 1 hàm sort
	private static void sort(int[] result) {
		for(int i = 0; i < result.length-1; i++) {
			if(result[i + 1] < result[i]) {
				int temp = result[i];
				result[i] = result[i + 1];
				result[i + 1] = temp;
			}
		}
	}
	
	public static int countElement(int a[], int n, int i){
        int count= 0;
        for(int j=0 ; j<n ; j++){
            if(a[j]== i)
            count ++;
        }
        return count;
    }
}

