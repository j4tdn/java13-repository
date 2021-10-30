package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/*
 * Ex04: Tìm khoản thời gian 2 người quen nhau với TimeUnit
 * [Years - Months] - Days - Hours + Minutes + Seconds
 */
public class Ex05 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2018, Calendar.AUGUST, 18, 23, 45, 0);
		
		Calendar now = Calendar.getInstance();
		
		long startInMs = start.getTimeInMillis();
		long nowInMs = now.getTimeInMillis();
		
		long duration = nowInMs - startInMs;
		// duration / 1000 / 60 / 60 / 24;
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.SECONDS.toMillis(seconds);
		System.out.println("days: " + days);
		
		String resutl = days + " days\n"
					  + hours + " hours\n"
					  + minutes + " minutes\n"
					  + seconds + " seconds\n";
		System.out.println(resutl);
	}
}
