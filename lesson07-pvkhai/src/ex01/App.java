package ex01;

import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thời gian bắt đầu hẹn hò của 2 người(dd/MM/yyyy): ");
		String startStringDate = sc.nextLine();
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(format.parse(startStringDate));
		Date startDate = cal.getTime();
		
	
		
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		String[] dayOfWeeks= {"Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy"};
		String dayOfWeekAsString = dayOfWeeks[dow - 1];
		System.out.println("Ngày bắt đầu hẹn hò: " + dayOfWeekAsString);
		
		System.out.println("Đã chia tay???(y/n)");
		String br = sc.nextLine();
		
		Date date = null;
		
		if("y".equals(br)) {
			System.out.println("Nhập thời gian chia tay(dd/MM/yyyy): ");
			String brDateString = sc.nextLine();
			cal.setTime(format.parse(brDateString));
			date = cal.getTime();
		}
		if("n".equals(br)) {
			date = new Date();
		}
		
		long distance = date.getTime() - startDate.getTime();
		
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(distance);
		
		int year = c.get(Calendar.YEAR) - 1970;
		int month = c.get(Calendar.MONTH) ;
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(c);
		System.out.println("Mối tình đã kéo dài " + year + " năm " + month + " tháng " + day + " ngày");
		
		
		
	}
	
}
