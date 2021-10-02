import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a , b;
		
		System.out.print("Nhap a ");
		a = sc.nextInt();
		System.out.print("Nhap b(nho hon a)");
		b = sc.nextInt();
		check (a , b);
		
	}
	public static void check(int a, int b) {
		while(a % b == 0) {
			a = a / b;
		}
		if (a == 1) {
			System.out.println("a la luy thua cua b");
		}
		else {
			System.out.println("a ko phai luy thua cua b");
		}
		
	}
	
}
