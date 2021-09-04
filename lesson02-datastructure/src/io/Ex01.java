package io;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// họ tên, sở thích, tuổi
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter fullname: ");
		String name = ip.nextLine();
		
		System.out.print("Enter age: ");
		int age = Integer.parseInt(ip.nextLine());
		
		// Trôi lệnh
		// Trước đó: Nhập vào giá trị không phải chuỗi VD: int, double,...
		// Sau đó:   Nhập vào giá trị là chuỗi
		
		// int >> int == NO , nhưng nguy hiểm bởi buffer bàn phím lưu 'enter'
		// String >> String == NO
		// String >> int == NO
		// Int >> String == YES 
		
		System.out.print("Enter hobbies: ");
		String hobbies = ip.nextLine();
		
		System.out.print("Enter address: ");
		String address = ip.nextLine();
		
		
		
		System.out.println("fullname: " + name);
		System.out.println("hobbies: " + hobbies);
		System.out.println("age: " + age);
		System.out.println("address: " + address);
		
		System.out.println("================");
		
		
	}
}
