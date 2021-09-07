package TrungHoHomeWork;

import java.util.Scanner;

public class Ex01 {
	public static void main (String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = Integer.parseInt(ip.nextLine());
		
		if (isPowerOfTwo(number)) {
			System.out.println("The number " + number + " IS power of 2");
		} else {
			System.out.println("The number " + number + " is NOT power of 2");
		}	
	}
	
	public static boolean isPowerOfTwo(int n) {
		if (n == 0)
			return false;
	 
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        
        return true;
	}		
}
