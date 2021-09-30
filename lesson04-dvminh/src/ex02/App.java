package ex02;

public class App {
	public static void main(String[] args) {
		int[] ip = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		int[] op = new int[100];
		int count = 0;
		
		for (int i = 0; i < ip.length; i++) {
			if (ip[i] % 7 == 0 && ip[i] % 5 !=0) {
				op[count] = ip[i];
				count++;
			}
		}
		
		for (int i = 0; i < ip.length; i++) {
			if (ip[i] % 7 == 0 && ip[i] % 5 ==0) {
				op[count] = ip[i];
				count++;
			}
		}
		
		for (int i = 0; i < ip.length; i++) {
			if (ip[i] % 7 != 0 && ip[i] % 5 ==0) {
				op[count] = ip[i];
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.print(op[i] + " ");
		}
 	}
}
