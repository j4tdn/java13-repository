import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int n1 = 20 + rd.nextInt(30 - 20 + 1);
		int n2 = 20 + rd.nextInt(30 - 20 + 1);
			if (n1 == n2) {
				n2 = 20 + rd.nextInt(30 - 20 + 1);
			}
			int n3 = 20 + rd.nextInt(30 - 20 + 1);
			if (n3 == n1 ||n3 == n1 ) {
				n3 = 20 + rd.nextInt(30 - 20 + 1);
			}
			int n4 = 20 + rd.nextInt(30 - 20 + 1);
			if (n4 == n1 ||n4 == n2 || n4 == n3 ) {
				n4 = 20 + rd.nextInt(30 - 20 + 1);
			}
			int n5 = 20 + rd.nextInt(30 - 20 + 1);
			if (n5 == n1 ||n5 == n2 || n5 == n3 || n5 == n4) {
				n5 = 20 + rd.nextInt(30 - 20 + 1);
			} System.out.println(n1 + "," + n2 + "," + n3 + "," + n4 + "," +n5 );
	}
}
