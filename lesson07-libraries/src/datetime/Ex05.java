package datetime;

import java.sql.Time;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 Ex04: Tìm khoảng thời gian 2 người quen nhau với TimeUnit
 [Years - Months] - Days - Hours + Minutes + Seconds
 // VD: 735 cm = 7m
 //      35 cm = 3dm
 //       5 cm
 */
public class Ex05 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2020, Calendar.FEBRUARY, 22, 19, 15, 0);
		
		Calendar now = Calendar.getInstance();
		
		long startInMs = start.getTimeInMillis();
		long nowInMs = now.getTimeInMillis();
		
		long duration = nowInMs - startInMs;
		
		//duration / 1000 / 60 / 60 / 24; // second/mimute/hour/day
		// ms > day
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.HOURS.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -= TimeUnit.HOURS.toMillis(seconds);
		
		String result = days    + " days\n"
				      + hours   + " hours\n"
				      + minutes + " minutes\n"
				      + seconds + " seconds\n";
		System.out.println(result);
		
		
		
	}

}
