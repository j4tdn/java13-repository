package ex03;

public class Ex03 {
	public static void main(String[] args) {
		int arr1[] = {2, 3};
		int arr2[] = {2, 3, 4};
		
		System.out.println(getLeastCommonMultiple(arr1));
		System.out.println(getLeastCommonMultiple(arr2));
		
		
	}
	
	public static int getLeastCommonMultiple(int arr[]) {
		int leastCommon = getLeastCommon(arr[0], arr[1]);
		
		for(int i = 2; i < arr.length; i++) {
			leastCommon = getLeastCommon(leastCommon, arr[i]);
		}
		return leastCommon;
	}
	
	public static int getLeastCommon(int a, int b) {
		int temp1 = a;
	    int temp2 = b;
		
	    while(a != b){
	        if(a >= b){
	            a -= b;
	        }else{
	            b -= a;
	        }
	    }
	    return temp1 * temp2 / a;
	}
	
	
}
