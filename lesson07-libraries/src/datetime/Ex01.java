package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex01 {
	//timezone : múi giờ
	public static void main(String[] args) {
		//time in milliseconds: time 
		
		//GregorianCalendar: today :23.10	
		Calendar c = Calendar.getInstance();
		
		//setTime
		//c.set(Calendar.DAY_OF_MONTH, 20);
		//c.set(Calendar.YEAR, 2022);
		System.out.println(c);
		
		int day =c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("day:" + day +"/"+ month + "/" + year);
		System.out.println(hour + ":" +minute +":" + second);
		
		int dayofweek = c.get(Calendar.DAY_OF_WEEK);
		//System.out.println("dayofweek: " +dayofweek);
		
		DayOfWeek[] dowEnum = DayOfWeek.values();
		System.out.println("dayOfWeek :" + dowEnum[dayofweek-1]);
		
		// first weekday depends on locale
		System.out.println("default: " + Locale.getDefault());
		System.out.println("firstWeekDay: " + c.getFirstDayOfWeek());
		
		//Task : input = today
		//     : output = first current weekday
		// first day of week = today + (first weekday 1|2) - (current weekday)
		
		c.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek()-c.get(Calendar.DAY_OF_WEEK));
		System.out.println("first day of week:" +c.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("=========");
		Date date = new Date();  // = Calendar.getInstance();
		System.out.println("date : " + date);
		
		System.out.println( "hours : "+date.getHours());
	}

}
