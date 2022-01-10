package ex01;

/**
 * @author Pho Dac Biet 
 * 	1. Với n nhập từ bàn phím. Viết chương trình in ra 2 tam
 *     giác đối đỉnh bằng số tăng theo cột từ 1 đến 2n-1.
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Rectangle: ");
		rectangle(4);
	}

	private static void rectangle(int n) {
		boolean[] flags = new boolean[2*n - 1];
		for (int i = 0; i < 2*n - 1; i++) {
			markFlag(flags, i);
			print(flags);
			System.out.println();
		}
	}

	private static void markFlag(boolean[] flags, int index) {
		int count = Math.abs(flags.length / 2 - index);
		for (int i = 0; i < count; i++) {
			flags[flags.length / 2 - i] = true;
			flags[flags.length/2 + i] = true;
		}
	}
	
	private static void print(boolean[] flags) {
		for (int i = 0; i < flags.length; i++) {
			if (!flags[i]) {
				System.out.print(i+1);
				continue;
			}
			flags[i] = false;
			System.out.print(" ");
		}
	}
}
