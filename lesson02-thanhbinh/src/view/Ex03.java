package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a,c;
	    int b = 0;
	    
	    a = sc.nextInt();
	    c = a;
	    while(a != 0) {
		      int digit = a % 10;
		      b = b * 10 + digit;
		      a = a / 10;
	    }
	    if(b == c){
		      System.out.println(c+ "true");
		    }
		    else{
		      System.out.println(c+ "false");
		    }
	}
}
