package ex03;

import java.util.Scanner;
public class Email {
    public static void main(String[] args) {
        boolean flag;
        Scanner ip = new Scanner(System.in);
        do {
            String emailPattern = "\\w+@\\w+[.]\\w+([.]\\w+)?";
            System.out.print("Nhập địa chỉ email(email@address.com): ");
            String input = ip.next();
            flag = input.matches(emailPattern);
            if (!flag) {
            	System.out.println("Kiểu nhập không hợp lệ!");
            }
        } while (!flag);
        System.out.println("kiểu nhập hợp lệ. ");
        
    }
}