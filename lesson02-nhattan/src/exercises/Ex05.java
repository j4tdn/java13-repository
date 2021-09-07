package exercises;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		System.out.print("Nhap vao mot so thap phan: ");
		
		int number = new Scanner(System.in).nextInt();
		
		System.out.print("So nhi phan la: " + decToBin(number));
		
	}
	
	public static int decToBin(int decimalNumber){
		int binaryNumber = 0;
	    int index  = 0;

	    while(decimalNumber != 0) {
	        int last = decimalNumber % 2 ;
	        binaryNumber +=   last * Math.pow(10, index++);
	        decimalNumber /= 2;
	    }
	    return binaryNumber;
	}
}
