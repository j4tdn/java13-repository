package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03 {
	private static final String PATTERN = "dd/MM/yyyy";

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat(PATTERN);
		Date date = null;
		try {
			date = df.parse("25/10/2018");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("date: " + date);

		Calendar c = Calendar.getInstance();
		c.setTime(date);
		System.out.println("c: " + c);

	}
}
