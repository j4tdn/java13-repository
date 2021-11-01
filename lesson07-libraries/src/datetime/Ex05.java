package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex05 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2017, Calendar.JANUARY, 21, 7, 30, 0);
		//start.set(2021, Calendar.OCTOBER, 31, 12, 00, 0);
		Calendar now = Calendar.getInstance();

		long startInMs = start.getTimeInMillis();
		long nowInMs = now.getTimeInMillis();

		long duration = nowInMs - startInMs;

//		long days = duration / (24*60*60*1000);
//		duration-=days*(24*60*60*1000);
//		long hours = duration/(60*60*1000);
//		duration-=hours*(60*60*1000);
//		long minutes = duration/(60*1000);
//		duration-=minutes*(60*1000);
//		long seconds = duration/1000;

		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -= TimeUnit.SECONDS.toMillis(seconds);
		
		System.out.println(days + "days " + hours + "hours " + minutes + "minutes " + seconds + "seconds ");
	}
}
