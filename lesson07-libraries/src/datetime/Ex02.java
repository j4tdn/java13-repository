package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02 {
	private static final String PATTERN = "dd/MM/yyyy'T'hh:mm:ss a";
	public static void main(String[] args) {
		long current = System.currentTimeMillis();
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		System.out.println("date: " + date);
		System.out.println("c: " + c);
		System.out.println("current: " + current);
		
		DateFormat df = new SimpleDateFormat(PATTERN);
		System.out.println("====dd/MM/yyy====");
		System.out.println("date: " + df.format(date));
		System.out.println("c: " + df.format(c.getTime()));
	}
}
