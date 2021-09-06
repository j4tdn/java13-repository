import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int n = ip.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = ip.nextInt();
		}
		int tem = 0;
		for(int i=0;i<n;i++) {
			if(check(a[i])) {
				if(a [i]> tem )
					tem =a[i];
			}
		}
		System.out.println(tem);
	}
	public static boolean check(int a) {
		if(a%2==0) 
			return false;
		return true;
	}
}
