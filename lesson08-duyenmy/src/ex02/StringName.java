package ex02;

import java.util.Scanner;

public class StringName {
public static void main(String[] args) {
	String n;
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhập vào chuỗi bất kỳ: ");
    n = scanner.nextLine();
    Name(n);
}
public static void Name(String n) {
	String name=n.toLowerCase();
	String[] n1 = name.split("\\s");
	for(int i = 0; i<n1.length; i++) {
		
		n1[i] = n1[i].substring(0, 1).toUpperCase() + n1[i].substring(1);
		System.out.print(n1[i] +" ");
	}
	
	
}
}
