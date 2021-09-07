import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap chuoi can kiem tra");
	String c = sc.nextLine();
	
	String[] b = c.split(" ");
	
	int[] a = new int[b.length];
	
	for (int i=0; i<= b.length-1; i++) {
		a[i]= Integer.parseInt(b[i]);
	}
	
	maxodd(a);
}

private static void maxodd(int[] a) {
	int max = 0;
	for (int i=0; i<= a.length-1; i++) {
		if (a[i]%2 !=0 && a[i]>max) {
			max =a[i];
		}
	}
	System.out.println("so le lon nhat la: "+ max);
}
}
