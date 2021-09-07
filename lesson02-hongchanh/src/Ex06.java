import java.util.Random;

public class Ex06 {
	public static int[] a = new int[5];
public static void main(String[] args) {
	Random rd = new Random();
	int b =0;
	a[0]= 20 + rd.nextInt(30-20+1);
	for (int i=1; i<=4; i++) {
		do {
			b = 20 + rd.nextInt(30-20+1);
		}
		while (loop(b,a,i)==true);
			a[i] =b;
	}
		
	for (int i = 0; i<=4; i++) {
		System.out.println(a[i]);
	}
}

private static boolean loop(int b, int[] a, int t) {
	for (int i=0; i<t; i++) {
		if (a[i]==b) {
			return true;
		}
	}
	
	return false;
}
}
