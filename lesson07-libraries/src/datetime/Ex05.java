package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
	Ex04: Tìm khoảng thời gian 2 người quen nhau với TimeUnit
	[Years - Months] - Days - Hours + Minutes + Seconds
 */

public class Ex05 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		//start.set(2020, Calendar.FEBRUARY, 22, 19, 15);
		start.set(2021, Calendar.OCTOBER, 29, 5, 0, 0);
		
		Calendar now = Calendar.getInstance();
		
		long startInMs = start.getTimeInMillis();
		long nowInMs = now.getTimeInMillis();
		
		long duration = nowInMs - startInMs;
		
		// duration / 1000 / 60 / 60 / 24 >> ms -> day
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		duration -= TimeUnit.DAYS.toMillis(days);
		
		long ours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(ours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -= TimeUnit.SECONDS.toMillis(seconds);
		
		String result = days + " days\n" + ours + " ours\n" +
						minutes + " minutes\n" + seconds + " seconds\n";
		
		System.out.println(result);
	}
}
