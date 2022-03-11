package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02 {
	
	private static final String PATTERN = "dd/MM/yyyy'T'hh:mm:ss a";
	
	public static void main(String[] args) {
		//current time
		long current = System.currentTimeMillis();
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		
		DateFormat df = new SimpleDateFormat(PATTERN);
		
		//date - String
		String dateAsString = df.format(date);
		System.out.println("ddMMyyyy: " + dateAsString);
		
		//calendar - date -> calendar.getTime()
		
		
	}
}
