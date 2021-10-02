import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int[] a;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		a = new int[n - 1];
		nhap(a , n -1);
		check(a, n);
	}
	
	public static void nhap (int a[],int n) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao mang: ");
        for (int i=0;i<n;i++)
            a[i] = scanner.nextInt();
	}
	
	public static void check(int a[], int n) {
		int i;
		for (i = 1;i <= n; i++) {
			contain(a, i);
		}
	}
	public static void contain(int a[], int k) {
		int dem = 0;
		
		for (int j = 0;j < a.length; j++) {
			if (k == a[j]) {
			dem++;
		}
			
		if (dem == 0) {
			System.out.println("k = "+ k);
		}
	}
	}
	
}
