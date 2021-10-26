package ex01;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
/** Xây dựng ứng dụng The Ultimate Relationship Calculator
Nhập thời gian bắt đầu hẹn hò của 2 người.
Nếu đã chia tay, nhập ngày chia tay ngược lại lấy thời gian hiện tại
Nhấn Enter để thực hiện tính toán. Hỏi
Ngày bắt đầu hẹn họ là ngày thứ mấy.
Mối tình đã bắt đầu được bao nhiêu năm, tháng, ngày, giờ, phút, giây
*/
public class UltimateRelationshipCalculator {
	private static Scanner ip = new Scanner(System.in);
	private static String[] dayOfWeeks = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư","Thứ Năm","Thứ Sáu","Thứ Bảy"};
	public static void main(String[] args) {
		
		Calendar start = Calendar.getInstance();
		start.set(Calendar.DAY_OF_MONTH, 20);
		start.set(Calendar.MONTH, 9);
		start.set(Calendar.YEAR, 2019);
		
		int check = 0;
		do {
			System.out.println("Bạn đã chia tay chưa?");
			System.out.println("1. Rồi");
			System.out.println("2. Chưa");
			System.out.println("0. Dừng ứng dụng");
			System.out.print("Lựa chọn: ");
			check = Integer.parseInt(ip.nextLine());
			switch (check) {
				case 1:{
					System.out.println("Ngày chia tay: 19/10/2021");
					Calendar finish = Calendar.getInstance();
					finish.set(Calendar.DAY_OF_MONTH, 19);
					finish.set(Calendar.MONTH, 9);
					finish.set(Calendar.YEAR, 2021);
					
					calculate(start, finish);
					break;
				}
				case 2:{
					Calendar now  = Calendar.getInstance();
					calculate(start, now);
					break;
				}
				
			}
			
		}while(check!=0);
		
		
	}
	private static void calculate(Calendar start, Calendar finish) {
		int year = finish.get(Calendar.YEAR) - start.get(Calendar.YEAR);
		int day = 365*year - start.get(Calendar.DAY_OF_YEAR) + finish.get(Calendar.DAY_OF_YEAR) ;
		
		System.out.println("Ngày bắt đầu hẹn hò là ngày: " + dayOfWeeks[start.get(Calendar.DAY_OF_WEEK) - 1]);
		System.out.println("Mối tình đã bắt đầu được: ");
		System.out.println("    + " + ((int)day/365>0?day/365:"Chưa đủ 1") + " Năm " + day%365 + " Ngày");
		System.out.println("    + " + day + " ngày");
		System.out.println("    + " + day*24 + " giờ");
		System.out.println("    + " + day*24*60 + " phút");
		System.out.println("    + " + day*24*60*60 + " giây");
	}
}
