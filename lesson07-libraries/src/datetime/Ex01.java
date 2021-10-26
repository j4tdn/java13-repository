package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		// time in milliseconds:  time=1634977961291
				Calendar c = Calendar.getInstance();
				System.out.println(c);
				
				//set time
				// c.set(Calendar.DAY_OF_MONTH, 20);
				System.out.println(c);

				int day = c.get(Calendar.DAY_OF_MONTH);
				int month = c.get(Calendar.MONTH) + 1;
				int year = c.get(Calendar.YEAR);
				System.out.println("DMY: " + day + "/" + month + "/" + year);
				
				int hour = c.get(Calendar.HOUR);
				int hourOfDay = c.get(Calendar.HOUR_OF_DAY);
				int minute = c.get(Calendar.MINUTE);
				int second = c.get(Calendar.SECOND);
				
				System.out.println("H12MS: " + hour + "/" + minute + "/" + second);
				System.out.println("H24MS: " + hourOfDay + "/" + minute + "/" + second);
				int week = c.get(Calendar.DAY_OF_WEEK);
				System.out.println("dayOfWeek: "+week);
				
				String [] dayOfWeeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday"};
			
				int dow = c.get(Calendar.DAY_OF_WEEK);
				System.out.println("dayOfweek: "+ dayOfWeeks[dow-1]);
				DayOfWeek [] dowEnum = DayOfWeek.values();
				System.out.println("DayOfWeekAsEnum: " + dowEnum[dow -1]);
				
				int weekOfMonth = c.get(Calendar.WEEK_OF_MONTH);
				System.out.println("weekOfMonth: "+ weekOfMonth);
				int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
				System.out.println("weekOfYear: "+ weekOfYear);
				
				System.out.println("default: " + Locale.getDefault() );
				System.out.println("first day of week: "+ c.getFirstDayOfWeek());
				
				Calendar firstDayOFWeek = Calendar.getInstance();
				firstDayOFWeek.setTimeInMillis(c.getTimeInMillis());
				
				firstDayOFWeek.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek()- c.get(Calendar.DAY_OF_WEEK)); 
				System.out.println("first day of week: " + firstDayOFWeek );
				
				GregorianCalendar calendar = new GregorianCalendar();
				System.out.println("isLeapYear: " + calendar.isLeapYear(2024));
	}
}
