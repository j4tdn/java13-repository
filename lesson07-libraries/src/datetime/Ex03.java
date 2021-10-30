package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03 {
	public static final String PATTERN = "dd/MM/yyyy HH:mm:ss";
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat(PATTERN);
		//String - date 
		Date date = null;
		try {
			//block scope
			 date = df.parse("25/10/1999 16:24:30");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("date: "  + date);
		//String - date - calendar
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		System.out.println(c);
	}
}
