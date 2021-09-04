package io;

import java.util.Scanner;

public class Ex01 {
		public static void main(String[] args) {
			//hoj ten,so thich, tuoi
			Scanner ip = new Scanner(System.in);
			
			System.out.println("Enter fullname");
			String fullname = ip.nextLine();
			System.out.println("Enter hobbies");
			String hobbies = ip.nextLine();
			System.out.println("Enter age");
			int age = Integer.parseInt(ip.nextLine());
			
			System.out.println("======");
			System.out.println("fullname: "+fullname);
			System.out.println("fullname: "+hobbies);
			System.out.println("fullname: "+age);
			System.out.println("======");
		}

}
