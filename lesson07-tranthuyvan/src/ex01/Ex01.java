package ex01;
/**
 * Xây dựng ứng dụng The Ultimate Relationship Calculator
   Nhập thời gian bắt đầu hẹn hò của 2 người.
   Nếu đã chia tay, nhập ngày chia tay ngược lại lấy thời gian hiện tại
   Nhấn Enter để thực hiện tính toán. Hỏi
   Ngày bắt đầu hẹn họ là ngày thứ mấy.
   Mối tình đã bắt đầu được bao nhiêu năm, tháng, ngày, giờ, phút, giây
 */

import java.util.Calendar;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar start = Calendar.getInstance();
		System.out.println("Enter start day: ");
		try {
			start.set(Calendar.DATE, Integer.parseInt(sc.nextLine()));
			System.out.print("month: ");
			start.set(Calendar.MONTH,Integer.parseInt(sc.nextLine())-1);
			System.out.print("year: ");
			start.set(Calendar.YEAR, Integer.parseInt(sc.nextLine()));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("message " + e.getMessage());
		}
		
		System.out.println("Did you break up? Please enter 'Y' for yes or 'N' for no");
		String breakUp = sc.nextLine();
		breakUp.toUpperCase();
		if("Y".equals(breakUp)) {
			System.out.println("Please enter breaking up date: ");
			try {
				Calendar breakUpDay = Calendar.getInstance();
				System.out.print("day: ");
				breakUpDay.set(Calendar.DATE, Integer.parseInt(sc.nextLine()));
				System.out.print("month: ");
				breakUpDay.set(Calendar.MONTH,Integer.parseInt(sc.nextLine()) - 1);
				System.out.print("year: ");
				breakUpDay.set(Calendar.YEAR, Integer.parseInt(sc.nextLine()));
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("message " + e.getMessage());
			}
		} else {
			Calendar currentDay = Calendar.getInstance();
			int dow = start.get(Calendar.DAY_OF_WEEK);		
			String [] dayOfWeeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
			System.out.println("Start day is : "+ dayOfWeeks[dow-1]);
			int y = currentDay.get(Calendar.YEAR)- start.get(Calendar.YEAR);
			int days = y*365 - start.get(Calendar.DAY_OF_YEAR) + currentDay.get(Calendar.DAY_OF_YEAR);
			System.out.println("Your relationship: ");
			System.out.println( y + " Year(s) " + days%365 + " days");
			System.out.println( days + " days");
			System.out.println( days*24 + " hours");
			System.out.println( days*24*60 + " minutes");
			System.out.println( days*24*60*60 + " seconds");
		}
	}

}
