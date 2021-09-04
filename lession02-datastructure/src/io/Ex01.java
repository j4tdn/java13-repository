package io;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		//họ tên, sở thích, tuổi
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter fullname: ");
		String name = ip.nextLine();
		
		
		System.out.print("Enter hobbies: ");
		String hobbies = ip.nextLine();
		
		System.out.print("Enter age: ");
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.println("fullname: " + name);
		System.out.println("hobbies: " + hobbies);
		System.out.println("age: " + age);
		
		System.out.println("==========");
		
		
		
		
	}

}
