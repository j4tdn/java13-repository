package view;

import java.util.Scanner;

public class Ex03 {

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
        int num, reversed = 0, original;
        System.out.println("\n\nNhập vào số cần kiểm tra: ");
        num = sc.nextInt();
        original = num;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if(reversed == original){
          System.out.println(original+ " là số đối xứng!!");
        }
        else{
          System.out.println(original+ " không phải là số đối xứng!!");
        }
     }
}
