package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex04 {
	public static void main(String[] args) {
		Calendar dayStart = Calendar.getInstance();
		dayStart.set(2020, Calendar.FEBRUARY, 22, 19, 15);
		
		Calendar now = Calendar.getInstance();
		now.set(2021, Calendar.OCTOBER, 30, 17,22 );
		
		long dayStartInMs = dayStart.getTimeInMillis();
		long nowInMs = now.getTimeInMillis();
		
		long duration = nowInMs - dayStartInMs;
		//ms >> day
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -= TimeUnit.SECONDS.toMillis(seconds);

		
		String result = days + " ngày\n" +
						hours + " giờ\n" +
						minutes + " phút\n" +
						seconds + " giây\n";
		System.out.println(result);
						
		
	}
}
