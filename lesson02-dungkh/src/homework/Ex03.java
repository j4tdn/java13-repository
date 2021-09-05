package homework;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = in.nextInt();
        exam(n);
      	}

     public static void exam(int n) {
    	 int r,sum=0,temp;
    	 for(temp=n ; n!=0 ; n=n/10){
             r=n%10;
             sum=sum*10+r;
        }
        if(temp==sum) {
        	System.out.println("la so doi xung");
        }else {
        	System.out.println("la so doi xung");
        } 
    }
}
