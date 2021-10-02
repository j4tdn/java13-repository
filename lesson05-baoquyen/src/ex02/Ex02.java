package ex02;

public class Ex02 {
	public static void main(String[] args) {
		int [] a = {1,5,6,2,4};
		System.out.println("missing number: " + getMissingNumber(a) );
		
	}
	private static int getMissingNumber(int [] a) {
		sort(a);
		int ans = 1;
		for(int i = 0; i< a.length; i++) {
			if( a[i] == ans ) ans++;
			else break;
		}
		return ans;
	}
	private  static int [] sort(int [] arr) {
		int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
	}
	
	
}

