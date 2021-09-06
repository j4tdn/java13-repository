package lesson02;

public class Ex05 {
	public static void main(String[] args) {
		int n = 25;
		bin(n);
	}
	private static void bin(int n) {
		int bin[] = new int[50];
		int index = 0;
		while(n>0) {
			bin[index] = n % 2;
			n = n/2;
			index++;
		}
		for(int i = index -1; i>= 0 ;i--) {
			System.out.print(bin[i]);
		}
	}

}
