package datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;

public class Ex03 {
	
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";
	
	public static void main(String[] args) {
	DateFormat df = new SimpleDateFormat(PATTERN);
	// date - string >> df.format
	
	// string - date >> df.parse
	Date date = null;
	try {
		// block scope : biến sử dụng trong phạm vi ngoặc nhọn
		 date = df.parse("25/10/1980 16:20:30");
		
	} catch (ParseException e) {
			e.printStackTrace();
	}
	
	System.out.println("date: " + date);
	
	//date - calendar
	Calendar c = Calendar.getInstance();
	c.setTime(date);
	System.out.println("c: " + c);
	}

}
