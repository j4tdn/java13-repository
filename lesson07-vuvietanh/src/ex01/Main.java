package ex01;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2013, Calendar.JULY, 24);
		System.out.println("Ngày bắt đầu hẹn hò: " + cal.getTime() );
		
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		String [] dayOfWeek = {"Sunday","Monday,","Tuesday","Wendsday"
				,"Thursday","Friday","Saturday"};
		String dayOfWeekAsString = dayOfWeek[dow -1];
		System.out.println("Ngày hẹn hò là thứ: " + dayOfWeekAsString);
		
		LocalDate startDate = LocalDate.of(2013, 7, 24);
        
	    LocalDate endDate = LocalDate.of(2021, 10, 24);  
	         
	    
	    Period distance = Period.between(startDate, endDate);
		
		System.out.println("Mối tình bắt đầu đã được: " + distance.getYears() + 
							" năm " + distance.getMonths() + " tháng " + 
							distance.getDays() + " ngày");
		
		LocalDateTime startDay = LocalDateTime.of(2013, 07, 24, 4, 20, 39);
	    LocalDateTime endDay = LocalDateTime.of(2021, 10, 24, 10, 1, 8);
	         
	    // tính sự chênh lệch về giờ, phút, giây
	    // giữa 2 ngày startDate và endDate
	    // sử dụng phương thức between() của Duration
	    // Duration được dùng để tính sự chênh lệch về giây giữa 2 ngày
	    // bằng hàm getSeconds()
	    long differentInSeconds = Duration.between(startDay, endDay).getSeconds();
	    long differentInHours = Duration.between(startDay, endDay).toHours();
	    long differentInMinutes = Duration.between(startDay, endDay).toMinutes();
	         
	    System.out.println("Mối tình bắt đầu đã được: " + 
	        differentInSeconds + " giây tương ứng với " + differentInMinutes +
	        " phút và tương ứng với " + differentInHours + " giờ.");
	}
}
