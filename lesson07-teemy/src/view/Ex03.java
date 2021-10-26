package view;
/*
 * Bài 3: Viết chương trình, mỗi chức năng một phương thức
1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
 */
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Calendar;

public class Ex03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		int hour24 = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println("(dd/MM/yyy HH:mm:ss)  "+ day + "/" + month + "/" + year +"   "+ hour24 + "/" + minute + "/" + second);

		YearMonth yearMonth = YearMonth.of(year, month); 
		LocalDate firstOfMonth = yearMonth.atDay(month);
		LocalDate last = yearMonth.atEndOfMonth();
		System.out.println(last.getDayOfMonth());
		
		c.add(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek()-c.get(Calendar.DAY_OF_WEEK));
		System.out.println("ngay dau cua tuan: "+c.get(Calendar.DAY_OF_MONTH));
		c.add(Calendar.DAY_OF_WEEK,  c.getFirstDayOfWeek()-c.get(Calendar.DAY_OF_WEEK)+7);
		System.out.println("ngay cuoi cua tuan: "+c.get(Calendar.DAY_OF_MONTH));
		
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println("tuan cua nam "+weekOfYear);
		
		c.add(Calendar.DAY_OF_MONTH,  20);
		System.out.println("sdfa: "+c.get(Calendar.DAY_OF_MONTH));
	}
}
