package view;

import java.time.LocalDate;
import java.time.YearMonth;
/*
 * Bài 1: Xây dựng ứng dụng The Ultimate Relationship Calculator
 Nhập thời gian bắt đầu hẹn hò của 2 người.
 Nếu đã chia tay, nhập ngày chia tay ngược lại lấy thời gian hiện tại
 Nhấn Enter để thực hiện tính toán. Hỏi
 Ngày bắt đầu hẹn họ là ngày thứ mấy.
 Mối tình đã bắt đầu được bao nhiêu năm, tháng, ngày, giờ, phút, giây
 */
import java.util.Calendar;
import java.util.Scanner;


public class Ex01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nhap ngay quen nhau: ");
		int d = sc.nextInt();
		System.out.println("nhap thang quen nhau: ");
		int m = sc.nextInt();
		System.out.println("nhap nam quen nhau: ");
		int y = sc.nextInt();
		System.out.println("nhap gio quen nhau: ");
		int ho = sc.nextInt();
		System.out.println("nhap phut quen nhau: ");
		int mi = sc.nextInt();
		System.out.println("nhap giay quen nhau: ");
		int se = sc.nextInt();
		
		System.out.println("ban da chia tay chua nhap?? (roi/chua)");
		String st=sc.nextLine();
		if(st.equals("roi")) {
			System.out.println("nhap ngay chia tay: ");
			d = sc.nextInt();
			System.out.println("nhap thang chia tay: ");
			m = sc.nextInt();
			System.out.println("nhap nam chia tay: ");
			y = sc.nextInt();
			System.out.println("nhap gio chia tay: ");
			ho = sc.nextInt();
			System.out.println("nhap phut chia tay: ");
			mi = sc.nextInt();
			System.out.println("nhap giay chia tay: ");
			se = sc.nextInt();
		}
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		int hour24 = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);

		int years = year - y;
		int months = month - m;
		int days = day - d;
		int hours = hour24 - ho;
		int minutes = minute - mi;
		int seconds = second - se;

		//int[] DaysMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (seconds < 0) {
			minutes--;
			seconds += 60;
		}
		;
		if (minutes < 0) {
			hours--;
			minutes += 60;
		}
		if (hours < 0) {
			days--;
			hours += 24;
		}
		if (day < 0) {
			months--;
//			if (month == 2) {
//				if (year % 4 == 0) {
//					day += 29;
//				} else {
//					day += 28;
//				}
//			} else {
//				day += DaysMonth[month - 1];
//			}
			YearMonth yearMonth = YearMonth.of( year, month );  
			LocalDate firstOfMonth = yearMonth.atDay( month );
			LocalDate last = yearMonth.atEndOfMonth();
			int daylast=last.getDayOfMonth();
			day+=daylast;
		}
		if (month < 0) {
			year--;
			month += 365;
		}
		if(st.equals("roi")) {
			System.out.println("Moi tinh da ket thuc duoc :" + years + " nam " + months + " thang " + days + " ngay " + hours
					+ " gio " + minutes + " phut " + seconds + " giay ");
		} else {
			System.out.println("Moi tinh da bat dau duoc :" + years + " nam " + months + " thang " + days + " ngay " + hours
					+ " gio " + minutes + " phut " + seconds + " giay ");
		}
	}
}
