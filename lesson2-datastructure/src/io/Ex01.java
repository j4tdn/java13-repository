package io;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter full name: ");
		String name = ip.nextLine();
		System.out.print("Enter full age: ");
		int age = Integer.parseInt(ip.nextLine()); 
		System.out.print("Enter full hobbies: ");
		String hobbies = ip.nextLine();
		System.out.print("Enter full address: ");
		String address = ip.nextLine();
		System.out.println("-----------------");
		System.out.println("fullname :"+ name);
		System.out.println("age: "+ age);
		System.out.println("hobbies: "+ hobbies);
	}
}
