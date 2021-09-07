import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap so can kiem tra");
	Integer c = sc.nextInt();
	
	if(check(c)) {
		System.out.println("so nay doi xung!");
	}else System.out.println("so nay khong doi xung!");
}

private static boolean check(Integer a) {
	char[] r = a.toString().toCharArray();
	int n = 0;
	while (n <= r.length/2) {
		if (r[n]== r[r.length-1-n])
		{
			n= n+1;
		}else return false;
	}
	return true;
	
}
}
