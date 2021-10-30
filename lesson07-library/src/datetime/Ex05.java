package datetime;

import java.time.Duration;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
/*
 * tim tg quen nhau
 */

public class Ex05 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2020,Calendar.FEBRUARY,22,19, 15);
		
		Calendar now=Calendar.getInstance();
		
		long starInMs=start.getTimeInMillis();
		long nowInMs = now.getTimeInMillis();
		
		long duration = nowInMs - starInMs;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -=TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -=TimeUnit.DAYS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -=TimeUnit.DAYS.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -=TimeUnit.DAYS.toMillis(seconds);
		
		String result = days+" days\n"
						+hours+" hours\n"
						+minutes+" minutes\n"
						+seconds+" seconds\n";
		System.out.println(result);
		
		
	}
}
