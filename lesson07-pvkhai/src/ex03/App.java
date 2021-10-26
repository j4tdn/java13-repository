package ex03;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class App {
	public static void main(String[] args) {
		System.out.print("Current Time: ");
		currentTime();
		
		System.out.print("Last Day Of Current Month: ");
		lastDayOfCurrentMonth();
		
		firstAndLastDayOfCurrentWeek();
		
		int weekOfYear = weekOfYear();
		System.out.println("Week Of Year: " + weekOfYear);
		
		afterDay();
		
		long number = numberOfDay();
		System.out.println("Số ngày bạn đã sống là: " + number);
		
	}
	private static void currentTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date currentTime = cal.getTime();
		String strTime = sdf.format(currentTime);
		System.out.println(strTime);
	}
	
	private static void lastDayOfCurrentMonth() {
		
		Calendar cal = Calendar.getInstance();
		
		
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		Date lastDayOfMonth = cal.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(sdf.format(lastDayOfMonth));
		
	}
	
	private static void firstAndLastDayOfCurrentWeek() {
		Calendar cal = Calendar.getInstance();
		
		Calendar first = Calendar.getInstance();
		first.setTimeInMillis(cal.getTimeInMillis());
		first.add(Calendar.DAY_OF_MONTH, 1 - first.get(Calendar.DAY_OF_WEEK));
		
		Date firstDate = first.getTime();
		System.out.println("First Day Of Week: " + firstDate.getDate() + "/" +(firstDate.getMonth()+1));
		
		Calendar last = Calendar.getInstance();
		last.setTimeInMillis(first.getTimeInMillis());
		last.add(Calendar.DAY_OF_MONTH, 6);
		
		Date lastDate = last.getTime();
		System.out.println("Last Day Of Current Week: " + lastDate.getDate() + "/" +(lastDate.getMonth()+1));
		
	}
	
	private static int  weekOfYear() {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.WEEK_OF_YEAR);
	}
	
	private static void afterDay() {
		Calendar cal = Calendar.getInstance();
		
		Calendar after = Calendar.getInstance();
		after.setTimeInMillis(cal.getTimeInMillis());
		after.add(Calendar.DAY_OF_MONTH, 20);
		
		int dow = after.get(Calendar.DAY_OF_WEEK);
		String[] dayOfWeeks= {"Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy"};
		String dayOfWeekAsString = dayOfWeeks[dow - 1];
		
		System.out.println("20 ngày sau là: " + dayOfWeekAsString + 
				", ngày " + after.get(Calendar.DAY_OF_MONTH) + " tháng " + (after.get(Calendar.MONTH)+1));
	}
	
	private static long numberOfDay()  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập ngày tháng năm sinh của bạn(dd/MM/yyyy): ");
		
		String dateOfBirthString= sc.nextLine();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		Calendar cal = Calendar.getInstance();
		try {
			cal.setTime(format.parse(dateOfBirthString));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date dateOfBirth = cal.getTime();
		
		Date today = new Date();
		long distance = today.getTime() - dateOfBirth.getTime();
		long numberOfDay = distance / (1000 * 60 * 60 * 24);

		return numberOfDay;
		
	}
	
}
