package ex04;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2021, Calendar.NOVEMBER, 27);
		
		Calendar c1 = Calendar.getInstance();
		c1.setFirstDayOfWeek(2);
		c1.setTimeInMillis(c.getTimeInMillis());
		
		int deadline = 110;
		
		do {
			c1.add(Calendar.DAY_OF_MONTH, 1);
			if (check(c1)) {
				c.add(Calendar.DAY_OF_MONTH, 1);
				deadline--;
			}
		} while (deadline != 0);
		
		System.out.println("thoi gian A phai ban giao cho B: " + format(c1));
		System.out.println("110 ngay ke tu ngay 27/11: " + format(c));
	
	}

	public static String format(Calendar c) {
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		String date = d.format(c.getTime());
		return date;
	}

	public static boolean check(Calendar c) {
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		int month = c.get(Calendar.MONTH)+1;
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		if (dayOfWeek == 7 || dayOfWeek == 1) {
			return false;
		} else if (month == 12) {
			if (dayOfMonth == 29 || dayOfMonth == 30 || dayOfMonth == 31) {
				return false;
			}
		} else if (month == 1) {
			if (dayOfMonth == 1 || dayOfMonth == 2 || dayOfMonth == 3 || dayOfMonth == 4 || dayOfMonth == 5) {
				return false;
			}
		}
		return true;
	}
}
