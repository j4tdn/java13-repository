package java07;

import java.util.Calendar;
import java.util.Scanner;

public class Ex01 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Calendar startDay = Calendar.getInstance();
		Calendar nowDay = Calendar.getInstance();
		Calendar finishDay = Calendar.getInstance();
		//do {
		System.out.print("Nhap ngay bat dau hen ho : ");
		int loveDay = sc.nextInt();
		System.out.print("Nhap thang bat dau hen ho : ");
		int loveMonth = sc.nextInt();
		System.out.print("Nhap nam bat dau hen ho : ");
		int loveYear = sc.nextInt();

		startDay.set(Calendar.DAY_OF_MONTH, loveDay);
		startDay.set(Calendar.MONTH, loveMonth-1);
		startDay.set(Calendar.YEAR, loveYear);
		System.out.println("Thoi gian bat dau hen ho : " + startDay.get(Calendar.DATE) +"/" + startDay.get(Calendar.MONTH) + "/" + startDay.get(Calendar.YEAR));
		System.out.println("Ban con hen ho? 1.yes  2.no");
		System.out.print("Chon 1 or 2 :");
		int check =sc.nextInt();
		if(check==1) {
			System.out.print("Nhap ngay ket thuc hen ho : ");
			int sadDay = sc.nextInt();
			System.out.print("Nhap thang ket thuc hen ho : ");
			int sadMonth = sc.nextInt();
			System.out.print("Nhap nam ket thuc hen ho : ");
			int sadYear = sc.nextInt();
			finishDay.set(Calendar.DAY_OF_MONTH, sadDay);
			finishDay.set(Calendar.MONTH, sadMonth);
			finishDay.set(Calendar.YEAR, sadYear);
			System.out.print(" \n chia tay da duoc : ");
			timePeriod(finishDay,nowDay);
		}
	if(check==2) {
		System.out.println("khoang thoi gian hen ho: ");
		timePeriod(startDay,nowDay);
	  }
	}
			
			
	private static void timePeriod(Calendar startDay, Calendar nowDay) {
		int dayOfWeek = startDay.get(Calendar.DAY_OF_WEEK);		
		DayOfWeek[] dowEnum = DayOfWeek.values();
		System.out.println("thoi diem hen ho:" + dowEnum[dayOfWeek-1]);
		int year = nowDay.get(Calendar.YEAR)- startDay.get(Calendar.YEAR);
		int day = year*365 - (startDay.get(Calendar.DAY_OF_YEAR)) + (nowDay.get(Calendar.DAY_OF_YEAR));
		System.out.println( year + " nam " + day%365 + " ngay");
	   }
}
