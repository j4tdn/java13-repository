package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap tuoi:");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println("So gio da ngu:");
		int hourSlept= Integer.parseInt(sc.nextLine());
		
		System.out.println("So phut da ngu:");
		int minuteSlept = Integer.parseInt(sc.nextLine());
		
		int sleptTime= hourSlept * 60 + minuteSlept;
		
		System.out.println("Gio bat dau ngu:");
		int hourStartTimeSleep =Integer.parseInt(sc.nextLine());
		System.out.println("phut bat dau ngu:");
		int minuteStrartSlept = Integer.parseInt(sc.nextLine());
		
		int startTimeSleep = hourSlept * 60 + minuteSlept;
		
		int hour,minute,temp;
		if ( age >=1 && age <= 3) {
			minute = 1200 - sleptTime;
		}
		
		else if (age <= 13) {
			minute = 660 - sleptTime;
		}
			
		else if (age <= 17) {
			minute = 540 - sleptTime;
		}
			
		else if (age <= 64) {
			minute = 480- sleptTime;
		}
			
		else {
			minute = 450 - sleptTime;
		}
			
		
		
		
	}

}
