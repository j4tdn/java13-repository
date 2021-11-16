package ex01;

import java.util.Scanner;

public class PrintString {
public static char kyTu;
public static void main(String[] args) {
	String n;
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhập vào chuỗi bất kỳ: ");
    n = scanner.nextLine();
    printOneLine(n);
    printMoreLine(n);
    reverse(n);
    reverseWord(n);
    
}
public static void printOneLine(String n) {
	System.out.println("Các ký tự có trong chuỗi là: ");
    for (int i = 0; i < n.length(); i++) {
        kyTu = n.charAt(i);
        if(kyTu != ' ') {
            System.out.print(kyTu);}
    }
}
public static void printMoreLine(String n) {
	System.out.println("Các ký tự có trong chuỗi là: ");
    for (int i = 0; i < n.length(); i++) {
        kyTu = n.charAt(i);
             if(kyTu != ' ') {
        System.out.println(kyTu);}
    }
}
public static void reverse(String n) {
	System.out.println("Các ký tự có trong chuỗi đảo ngược là: ");
	StringBuilder str = new StringBuilder(n);
    System.out.println(str.reverse().toString());
	
}
public static void reverseWord(String n) {
	System.out.println("Các ký tự có trong chuỗi đảo ngược là: ");
	String[] n1 = n.split("\\s");
	
	for(int i = 0; i<n1.length; i++) {
		StringBuilder a = new StringBuilder(n1[i]);
		a.reverse();
		n1[i] = a.toString();
		System.out.print(n1[i] +" ");
	}
	
	
}
}
