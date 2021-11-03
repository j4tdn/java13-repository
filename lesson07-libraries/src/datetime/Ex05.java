package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * Tim khoang thoi gian 2 nguoi quen nhau voi TimeUnit
 * [Years - Months] - Days - Hours + Minutes + Seconds
 * */
public class Ex05 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2021, Calendar.OCTOBER, 29, 5, 0, 0);
		
		Calendar now = Calendar.getInstance();
		
		long startInMs = start.getTimeInMillis();
		long nowInMs = now.getTimeInMillis();
		long duration = nowInMs - startInMs;
		// miliseconds --> seconds
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -= TimeUnit.SECONDS.toMillis(seconds);
		
		String result = days + " days\n"
				      + hours + " hours\n"
					  + minutes + " minutes\n"
					  + seconds + " seconds\n";
		
		System.out.println(result);
	}
}
