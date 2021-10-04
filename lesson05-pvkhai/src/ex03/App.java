package ex03;

public class App {
	public static void main(String[] args) {
		int []arr = {2,3};
		System.out.println(getLeastCommonMultiple(arr));
		
	}
	public static int getLeastCommonMultiple(int arr[]) {
		int tmp = getLeastCommonMultiple2Number(arr[0], arr[1]);
		for(int i=2;i<=arr.length-1;i++) {
			tmp = getLeastCommonMultiple2Number(tmp, arr[i]);
		}
		return tmp;
	}
	public static int getGreatestCommonDivisor2Number(int a, int b) {
		if(a==b) return a;
		if(a>b) {
			return getGreatestCommonDivisor2Number(a-b, b);
		}
		else {
			return getGreatestCommonDivisor2Number(a, b-a);
		}
	}
	
	public static int getLeastCommonMultiple2Number(int a, int b) {
		return a*b/getGreatestCommonDivisor2Number(a, b);
	}
	
}
