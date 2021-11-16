package ex06;

import java.util.Scanner;

public class Ex06 {
public static void main(String[] args) {
	String n;
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhập vào chuỗi số bất kỳ : ");
    n = scanner.nextLine();
    if(n.length()>100) {
    System.out.println("Chữ số ở vị trí thứ 100 là: "+n.charAt(100));}
    else {
    	System.out.println("Hãy nhập chuỗi số dài hơn 100 chữ số!!");
    }
    
}
}
