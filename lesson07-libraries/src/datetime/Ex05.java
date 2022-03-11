package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/*
 * Ex05: Tìm khoảng thời gian 2 người quen nhau với TimeUnit
 * [Years - Months] - Days - Hours + Minutes + Seconds
 */
public class Ex05 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2020, Calendar.FEBRUARY, 29, 19, 15, 0 );
		
		Calendar now = Calendar.getInstance();
		long startInMs = start.getTimeInMillis();
		long nowInMs = now.getTimeInMillis();
		
		long duration = nowInMs - startInMs;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		//duration -= TimeUnit.MINUTES.toMillis(seconds);
		
		String result = days + "days\n"
						+ hours + "hours\n"
						+ minutes + "minutes\n"
						+ seconds + "seconds";
		System.out.println(result);
						
	}
}
