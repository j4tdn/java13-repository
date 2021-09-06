import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = Integer.parseInt(ip.nextLine());
		nbDX(number);	
		
	}
	private static void nbDX(int a) {
		int SDN = 0;
		int SDX;
		for (int temp = a; temp != 0;temp = temp/10) {
			SDX = temp % 10;
			SDN = SDN * 10 + SDX;
			
		}
		if (SDN == a) {
			System.out.println(a + ": la so doi xung");
		}else {
			System.out.println(a + ": khong la so doi xung");
		}
	}
}

