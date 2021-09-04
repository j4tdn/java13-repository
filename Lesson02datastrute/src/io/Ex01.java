package io;

import java.util.Scanner;


public class Ex01 {
	public static void main(String[] args) {
		// Họ tên, sở thích, tuổi
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter fullName: ");
		String name = ip.nextLine();
		
		System.out.print("Enter Hobbies: ");
		String hobbies = ip.nextLine();
		
		System.out.print("Enter Age: ");
		int age = ip.nextInt();
		
		System.out.print("Enter Address: ");
		String address = ip.nextLine();
		
		ip.nextLine();
		
		//troi lenh
		//Truoc do: Nhap 1 gia tri khong phai chuoi (ip.nextLine)
		//Sau do: Nhap vao gia tri la chuoi
		
		System.out.println("=========");
		
		System.out.println("fullName: " + name);
		System.out.println("Hobbies: " + hobbies);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		System.out.println("=========");
		
	}

}
