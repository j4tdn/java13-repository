package lesson02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		   
	    Scanner sc = new Scanner(System.in);
	   
	    int num1, reversed = 0, or;
	    System.out.println("\n\nNhap vao so can kiem tra: ");
	    num1 = sc.nextInt();
	    or = num1;
	    
	    while(num1 != 0) {
	      int digit = num1 % 10;
	      reversed = reversed * 10 + digit;
	      num1 /= 10;
	    }
	    
	    if(reversed == or){
	      System.out.println(or+ " la so doi xung!!");
	    }
	   
	    else{
	      System.out.println(or+ " khong phai so doi xung!!");
	    }
	 
	  }
}
