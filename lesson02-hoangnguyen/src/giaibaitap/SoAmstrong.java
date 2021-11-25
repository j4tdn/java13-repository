package giaibaitap;

import java.util.Scanner;

public class SoAmstrong {
	
	public static void main(String[] args) {
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		int start = Integer.parseInt(sc.nextLine());
		int end = Integer.parseInt(sc.nextLine());
		
		for(int i = start + 1; i < end; i++) {
			int temp = i;
			int num = 0;
			while(temp != 0) {
				int rem = temp % 10;
				num += rem * rem * rem;
				temp /= 10;
			}
			if(num == i) {
				if(counter == 0) {
					System.out.println("So Amstrong giua " + start + " va " + end + ": ");
					
				}
				System.out.println(i + " ");
				counter++;
			}
		}
		
		if(counter == 0) {
			System.out.println("Khong co so Amstrong");
		}
	}
}
