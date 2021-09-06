package lesson02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	 System.out.println("Nhap so can doi");
		int n = Integer.parseInt(sc.nextLine());
		 System.out.println("So "+n+" trong he co so 2 la");
		 
		int a[]= new int[1000]; 
		 
	    // counter for binary array 
	    int i = 0; 
	    while (n > 0) { 
	 
	        // storing remainder in binary array 
	        a[i] = n % 2; 
	        n = n / 2; 
	        i++; 
	    } 
	    // printing binary array in reverse order 
	    for (int j = i - 1; j >= 0; j--) 
	 
        System.out.print(a[j]);
               
    }
}
