package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02 {
	public static final String DATE_PATTERN = "dd/MM/yyyy";
	public static void main(String[] args) {
		long current = System.currentTimeMillis();
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		
		System.out.println(current);
		
		DateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);
		String value = dateFormat.format(date); //date - string
		System.out.println(value);
		
			   value = dateFormat.format(c.getTime()); // calendar - date
		System.out.println(value);
	}
}
