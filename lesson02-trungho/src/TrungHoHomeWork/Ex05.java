package TrungHoHomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Please enter a decimal number: ");
		int number = Integer.parseInt(ip.nextLine());
		
		System.out.print("The decimal number in banary is: ");
		decimalToBinary(number);
	}
	
	public static void decimalToBinary(int decimalNumber) {
		ArrayList<Integer> binavalue = new ArrayList<>();
		int binadigit;
		int i = 0;
		while(decimalNumber / 2 != 0) {
			binadigit = decimalNumber - (2 * (decimalNumber / 2));
			binavalue.add(i, binadigit);
			i++;
			decimalNumber = (decimalNumber / 2);
			
			if(decimalNumber == 1) {
				binavalue.add(i, 1);
			}
		}
		
		Collections.reverse(binavalue);
		
		for (int j = 0; j < binavalue.size(); j++) {
			System.out.print(binavalue.get(j));
		}
	}
}
