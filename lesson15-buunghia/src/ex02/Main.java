package ex02;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Nhap tuoi:");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("So gio da ngu:");
		int hour= Integer.parseInt(sc.nextLine());
		System.out.println("So phut da ngu:");
		int minute = Integer.parseInt(sc.nextLine());
		System.out.println("Thoi gian bat dau ngu:");
		int startTime=Integer.parseInt(sc.nextLine());
		int sleepingTime= hour * 60 + minute;
		if ( age >=1 && age <= 3)
			a = 1200 - sleepingTime;
		else if (age <= 13)
			a = 660 - sleepingTime;
		else if (age <= 17)
			a = 540 - sleepingTime;
		else if (age <= 64)
			a = 480- sleepingTime;
		else 
			a = 450 - sleepingTime;
		if (a < 0) a = 0;
		b = a / 60;
		c = a % 60;
		// good solution
		System.out.print("Ban nen thuc day luc "+(startTime+b)%24+":");
		if (c < 10) System.out.print("0");
		System.out.println(c);
	}
}
