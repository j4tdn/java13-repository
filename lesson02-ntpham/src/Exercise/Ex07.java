package Exercise;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		boolean checks[] = new boolean[10];
		int count = 0;
		while (count != 5) {
			int temp = 20 + rd.nextInt(10);
			if(!checks[temp - 20]) {
				count++;
				System.out.println("a[" + count + "] = " + temp);
				checks[temp - 20] = true;
			}
		}
	}
}
