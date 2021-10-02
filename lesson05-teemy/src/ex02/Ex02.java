package ex02;

public class Ex02 {
	public static void main(String[] args) {
		int n=10;
		int[]a= {3,7,9,2,1,6,5,4,10};
		System.out.println(getMissingNumber(a, n));
		
	}
	private static int getMissingNumber (int[] a,int n) {
		int []b= new int [n+1];
		for (int i=0; i<n+1;i++)
			b[i]=0;
		for (int i=0; i<n-1;i++) {
			b[a[i]]++;
		}
		for (int i=1; i<n+1;i++)
			if(b[i]==0) {
				return i;
			}
		return -1;
		
	}
}
