import java.util.Scanner;

/**
 * Có idea: 5đ
 */
public class Ex02 {
	// Nếu thích nhập thì bỏ biến sc lên đây
	// Ko cần khởi tạo quá nhiều lần tốn memory
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// Không cần nhập suất
		int n = sc.nextInt();
		
		// Để khai báo và sử dụng vào 1 chỗ. Đỡ code dài
		int[] a = new int[n - 1];
		nhap(a , n -1);
		
		check(a, n);
	}
	
	public static void nhap (int a[],int n) {
        System.out.println("Moi nhap vao mang: ");
        for (int i=0;i<n;i++)
            a[i] = sc.nextInt();
	}
	
	public static void check(int a[], int n) {
		// Mảng có length = n
		// Thì chỉ số sẽ từ 0 đến n-1
		// >> for (int i = 0 ; i < a.length - 1; i++)
		// Dụng i <= n sẽ dễ bị exception ArrayIndexOutOfBoundException
		for (int i = 1;i <= n; i++) {
			// Có idea nhưng chưa hoàn thành
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
