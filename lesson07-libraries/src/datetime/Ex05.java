package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex05 {
public static void main(String[] args) {
	Calendar start = Calendar.getInstance();
	start.set(2020, Calendar.FEBRUARY, 22, 19, 15);
	Calendar now = Calendar.getInstance();
	long startInMs = start.getTimeInMillis();
	long nowInMs = now.getTimeInMillis();
	long duration = nowInMs-startInMs;
	//long days = duration/1000/60/60/24;
	long days = TimeUnit.MILLISECONDS.toDays(duration);
    duration -=TimeUnit.DAYS.toMillis(days);
    
    long hours = TimeUnit.MILLISECONDS.toHours(duration);
    duration -=TimeUnit.HOURS.toMillis(hours);
    
    long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
    duration -=TimeUnit.MINUTES.toMillis(minutes);
    
    long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
    duration -=TimeUnit.SECONDS.toMillis(seconds);
    
    String result = days +" days\n"
    		+ hours + " hours\n"
    		+ minutes+" minutes \n"
    		+seconds + " seconds \n";
    
    
    System.out.println("result");
    
    
}
}
