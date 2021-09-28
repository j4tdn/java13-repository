package ex02;

public class App {
	public static void main(String[] args) {
		int[] a = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		int first=0;
		int last=a.length-1;
		for(int i = 0; i<a.length; i++) {
			if (a[i]%7==0&&a[i]%5!=0) {
				int temp = a[first];
				a[first] = a[i];
				a[i]=temp;
				first++;
			}
		}
		for(int i = a.length-1; i>=0; i--) {
			if (a[i]%7!=0&&a[i]%5==0) {
				int temp = a[last];
				a[last] = a[i];
				a[i]=temp;
				last--;
			}
		}
		showArray(a);
	}
	
	public static void showArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(i==a.length-1) {
				System.out.println(a[i]);
			}
			else {
				System.out.print(a[i]+", ");
			}
		}
	}
}
