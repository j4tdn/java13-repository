package IO;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// họ tên, sở thích, tuổi 
		Scanner	ip = new Scanner(System.in);
		
		System.out.println("Enter fullname: ");
		String fullname = ip.nextLine();
		
		System.out.println("Enter hobbies: ");
		String hobby = ip.nextLine();
		
		System.out.println("Enter age: ");
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.println("Enter address: ");
		String address = ip.nextLine();
		// Trôi lệnh 
		// Trước đó: Nhập vào giá trị không phải chuỗi VD: ip.nextInt
		// Sau đó: Nhập vào giá trị chuỗi
		
		// int >> int 		== NO
		// string >> string == NO
		// string >> int 	== NO
		// int >> string 	== YES
		
		System.out.println("================");
		
		System.out.println("Fullname: " + fullname);
		System.out.println("Hobbies: " + hobby);
		System.out.println("Age: " + age);
		System.out.println("Adress: " + address);
		System.out.println("================");
	}
}	
