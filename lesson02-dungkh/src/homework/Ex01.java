package homework;

import java.util.Scanner;

public class Ex01 {
	  public static void main(String[] args) { 
	        Scanner in = new Scanner(System.in);
	        System.out.print("nhap n: ");
	        int n = in.nextInt();
	        exam(n);
	      	}

	     public static void exam(int n) {
	        while(true) {
	             if((n%2)!= 0){
	                 System.out.println("false");
	                 break;
	                 }
	              n = n/2;
	              if(n == 1) {
	                 System.out.println("true");
	                 break;
	                 }
	        }
	      }
}
