package io;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		// Full name, hobby, age
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter fullname: ");
		String fullName = sc.nextLine();
		
		System.out.print("Enter age: ");
		int age = Integer.parseInt(sc.nextLine());
		
		// Trôi lệnh
		// Trước đó: Nhập vào giá trị không phải chuỗi VD: sc.nextInt()
		// Sau đó: Nhập vào giá trị là chuỗi
		
		System.out.print("Enter hobbies: ");
		String hobbies = sc.nextLine();
		
		System.out.print("Enter address: ");
		String address= sc.nextLine();
		
		System.out.println("======================");
		
		System.out.println("Fullname: " + fullName);
		System.out.println("Hoobies: " + hobbies);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
	}
}
