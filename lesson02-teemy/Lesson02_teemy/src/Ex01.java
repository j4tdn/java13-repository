import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int a = Integer.parseInt(ip.nextLine());
		if(check(a))
			System.out.println(a+" la luy thua cua 2");
		else
			System.out.println(a+" khong phai la luy thua cua 2");
		
	}
	public static boolean check(int a) {
		if(Math.sqrt(a)==Math.round(Math.sqrt(a)))
			return true;
		return false;
	}
}
