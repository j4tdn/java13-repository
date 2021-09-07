import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so can kiem tra");
		Integer a = sc.nextInt();
		
		check(a);
		

	}
	
	private static void check (Integer a ) {
		Integer r = 0;
		while (a >= 2) {
			if (a%2 == 0) {
				a = a/2;
			} else {
				System.out.println("khong phai!");
				break;
			}
		}
		
		if (a==1) {
			System.out.println("day la luy thua cua 2!");
		}
		
	}

}
