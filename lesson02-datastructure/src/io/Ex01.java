package io;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// họ tên, sở thích, tuổi
		// họ tên, tuổi, sở thích, địa chỉ
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter fullname: ");
		String fullname = ip.nextLine();
		
		System.out.print("Enter age: ");
		int age = Integer.parseInt(ip.nextLine()); // Để tránh trôi lệnh String của hobbies bên dưới
		
		// Trôi lệnh
		// Trước đó: nhập vào 1 giá trị không phải chuỗi (ip.nextLine)
		// Sau đó: nhập vào giá trị là chuỗi 
		
		// int >> int == NO
		// string >> string == NO
		// string >> int == NO
		// int >> string == YES
		
		
		
		System.out.print("Enter hobbies: ");
		String hobbies = ip.nextLine();
		
		System.out.print("Enter address: ");
		String address = ip.nextLine();
		
		System.out.println("=============");
		
		System.out.println("fullname: " + fullname);
		System.out.println("age: " + age);
		System.out.println("hobbies: " + hobbies);
		System.out.println("address: " + address);
		
		
		System.out.println("=============");
	}

}
