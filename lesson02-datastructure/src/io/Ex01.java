package io;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter fullname: ");
		String fullname = ip.nextLine();
		
		System.out.print("Enter age: ");
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.print("Enter hobbies: ");
		String hobbies = ip.nextLine();
		
		System.out.print("Enter address: ");
		String address = ip.nextLine();
		
		System.out.println("=================");
		
		System.out.println("fullname: " + fullname);
		System.out.println("age: " + age);
		System.out.println("hobbies: " + hobbies);
		System.out.println("age: " + address);
	
	}
}
