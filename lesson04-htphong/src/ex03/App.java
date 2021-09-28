package ex03;

public class App {
	public static void main(String[] args) {
		int n = 4;
		int [] temp = {};
		for(int i = 1; i<=n+1; i++) {
			int[] a=  new int[i+1];
			for(int j=0; j<a.length; j++) {
				if (j==0||j==a.length-1) {
					a[j]=1;
				}
				else {
					a[j] = temp[j-1]+temp[j];
				}
			}
			showArray(a);
			temp = a;
		}
	}
	
	public static void showArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(i==a.length-1) {
				System.out.println(a[i]);
			}
			else {
				System.out.print(a[i]+" ");
			}
		}
	}
}
