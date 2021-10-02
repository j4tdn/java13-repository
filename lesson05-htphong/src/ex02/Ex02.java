package ex02;

public class Ex02 {
	public static void main(String[] args) {
		int n = 6;
		int [] a = {3, 2, 1, 6, 5};
		System.out.println(getMissingNumber(a, n));
	}
	public static int getMissingNumber(int [] a, int n) {
		int miss=0;
		int k=1;
		int count=0;
		while(k<=n) {
			for(int i=0; i<a.length; i++) {
				if(k==a[i]) count++;
			}
			
			if(count == 0 ) {
				return k;
			}
			k++;
			count = 0;
		}
		return 0;
	}
	
}
