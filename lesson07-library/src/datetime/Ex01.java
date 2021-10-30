package datetime;

import java.util.Calendar;
import java.util.Date;

import javax.print.CancelablePrintJob;


public class Ex01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
				
		System.out.println(c);
		
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH)+1;
		int year = c.get(Calendar.YEAR);
		System.out.println("DMY: "+day+"/"+month+"/"+year);
		
		int hour24 = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("H24MS: "+hour24+"/"+minute+"/"+second);
		
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dayofweek: "+dayOfWeek);
		
		String[] dayOfWeeks= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		String dayofweekAsString = dayOfWeeks[dayOfWeek-1];
		
		DayOfWeek[] downEnum=DayOfWeek.values();
		System.out.println("dayofweekeAsNum: "+downEnum[dayOfWeek-1]);
		
		
		
		int weekOfMonth = c.get(Calendar.WEEK_OF_MONTH);
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println("weekofmonth: "+weekOfMonth);
		System.out.println("weekofyear: "+weekOfYear);
		
		//System.out.println("default: "+Locale.getDefault());
		System.out.println("firstweekday: "+c.getFirstDayOfWeek());
		
		c.add(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek()-c.get(Calendar.DAY_OF_WEEK));
		System.out.println("first day of week: "+c.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("========================");
		Date date = new Date();
		System.out.println("date: "+date);
		
		System.out.println("hour: "+date.getHours());
	}
}
