package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Ex01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		// Calendar c = Calendar.getInstance(Locale.FRANCE);

		// c.set(gia tri can thiet lap)
		// set ngay bay gio la 20
		// c.set(Calendar.DAY_OF_MONTH, 20);
		// c.set(Calendar.YEAR, 2022);

		System.out.println(c);

		// c.get(gia tri can lay)
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);

		System.out.println("DMY: " + day + "/" + month + "/" + year);

		int hour = c.get(Calendar.HOUR); // Clock 12
		int hourOfDay = c.get(Calendar.HOUR_OF_DAY); // Clock 24
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String ap = c.get(Calendar.AM_PM) == 1 ? "PM" : "AM";

		System.out.println("H12ms: " + hour + ":" + minute + ":" + second + " " + ap);
		System.out.println("H24ms: " + hourOfDay + ":" + minute + ":" + second);

		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("Day of Week: " + dayOfWeek);

		// Using map
//		Map<Integer, String> dayAsString = new HashMap<Integer, String>();
//		dayAsString.put(1, "Sunday");
//		dayAsString.put(2, "Monday");
//		dayAsString.put(3, "Tuesday");
//		dayAsString.put(4, "Wednesday");
//		dayAsString.put(5, "Thursday");
//		dayAsString.put(6, "Friday");
//		dayAsString.put(7, "Saturday");
//		System.out.println("Day of Week as String: " + dayAsString.get(dayOfWeek));

		// Using array
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		System.out.println("Day of Week as String: " + daysOfWeek[dayOfWeek - 1]);

		// Using enum
		DayOfWeek[] dowEnum = DayOfWeek.values();
		System.out.println("Day of week as Enum: " + dowEnum[dayOfWeek - 1]);

		int weekOfMonth = c.get(Calendar.WEEK_OF_MONTH);
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Week of month: " + weekOfMonth);
		System.out.println("Week of year: " + weekOfYear);

		// Ngày đầu tuần
		// Phụ thuộc vào vị trí (Quốc gia)
		// US: 1 >> Sunday
		// VN, FRANCE: 2 >> Monday
		System.out.println("Locale default: " + Locale.getDefault());
		System.out.println("First day of week: " + c.getFirstDayOfWeek());

		// Task: input = today
		// output = first current weekday
		// first day of feek = today + first weekday(1|2) - current weekday

		// c:today

		// firstDayOfWeek: today
		Calendar c1 = Calendar.getInstance();
		c1.setTimeInMillis(c.getTimeInMillis());

		c1.add(Calendar.DAY_OF_MONTH, c1.getFirstDayOfWeek() - c1.get(Calendar.DAY_OF_WEEK));
		System.out.println("First day of week: " + c1.get(Calendar.DAY_OF_MONTH));

		/* SAI */
//		 int dayOfWeek1 = c.get(Calendar.DAY_OF_WEEK);
//		 System.out.println(dayOfWeek1);
//		 int a = Calendar.DAY_OF_MONTH - (dayOfWeek1-1);
//		 System.out.println(a);  

		// Kiểm tra có phải là năm nhuận không
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("isLeapYear: " + calendar.isLeapYear(2024));
	}
}
