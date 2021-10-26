package java7;

import java.util.Calendar;
import utils.DateTimeUtils;

/**
 * Bài tập 2:Java 7
 * Viết chương trình thực hiện chức năng với:
 * Input:
 * - Ngày, tháng, năm.
 * - Validate dữ liệu nhập vào.
 * Output:
 * - Xuất các thông tin.
 */
public class Ex02 {
	public static void main(String[] args) {
		Calendar currentCal = DateTimeUtils.toCalendar("25/09/1995");
		ShowDateInfo(currentCal);
	}

	private static void ShowDateInfo(Calendar currentCal) {

		Calendar cal = Calendar.getInstance();
		cal.set(currentCal.get(Calendar.YEAR), currentCal.get(Calendar.MONTH), currentCal.get(Calendar.DAY_OF_MONTH));

		// 0
		System.out.println(generalInfo(cal));

		// 1
		System.out.println(" - " + dayOfYear(cal));

		// 2
		System.out.println(" - " + weekDayOfYear(cal));

		// 3
		System.out.println(" - " + dayOfMonth(cal));

		// 4
		System.out.println(" - " + totalDaysOfYear(cal));

		// 5
		System.out.println(" - " + totaldaysOfMonth(cal));
	}

	private static String generalInfo(Calendar cal) {
		return "" + cal.get(Calendar.DAY_OF_MONTH) + " " + DateTimeUtils.months[cal.get(Calendar.MONTH)] + " "
				+ cal.get(Calendar.YEAR) + " is a " + DateTimeUtils.getWeekDayAsString(cal.get(Calendar.DAY_OF_WEEK));
	}

	private static String dayOfYear(Calendar cal) {

		String result = "It is day number " + cal.get(Calendar.DAY_OF_YEAR);
		result += " of the year, ";
		result += cal.getActualMaximum(Calendar.DAY_OF_YEAR) - cal.get(Calendar.DAY_OF_YEAR);
		result += " days left";
		return result;
	}

	private static String weekDayOfYear(Calendar cal) {
		String result = "It is " + DateTimeUtils.getWeekDayAsString(cal.get(Calendar.DAY_OF_WEEK)) + " number ";
		Calendar firstDay = Calendar.getInstance();
		firstDay.setTime(cal.getTime());
		firstDay.set(cal.get(Calendar.YEAR), Calendar.JANUARY, 1);

		Calendar lastDay = Calendar.getInstance();
		lastDay.set(cal.get(Calendar.YEAR), Calendar.DECEMBER, 1);
		lastDay.set(Calendar.DAY_OF_MONTH, lastDay.getActualMaximum(Calendar.DAY_OF_MONTH));

		for (int i = 0; i < 7; i++) {
			if (firstDay.get(Calendar.DAY_OF_WEEK) == cal.get(Calendar.DAY_OF_WEEK)) {
				break;
			}
			firstDay.add(Calendar.DAY_OF_WEEK, 1);
		}

		int count = 0;
		while (!firstDay.after(cal)) {
			count++;
			firstDay.add(Calendar.DAY_OF_MONTH, 7);
		}

		result = result + count + " out of ";

		while (!firstDay.after(lastDay)) {
			count++;
			firstDay.add(Calendar.DAY_OF_MONTH, 7);
		}

		result = result + count + " in " + cal.get(Calendar.YEAR);

		return result;
	}

	private static String dayOfMonth(Calendar cal) {
		String result = "It is " + DateTimeUtils.getWeekDayAsString(cal.get(Calendar.DAY_OF_WEEK));
		result = result + " number " + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) + " out of ";

		Calendar firstDay = Calendar.getInstance();
		firstDay.setTime(cal.getTime());
		firstDay.set(Calendar.DAY_OF_MONTH, 1);

		Calendar lastDay = Calendar.getInstance();
		lastDay.setTime(cal.getTime());
		lastDay.set(Calendar.DAY_OF_MONTH, firstDay.getActualMaximum(Calendar.DAY_OF_MONTH));

		int count = 0;

		while (!firstDay.after(lastDay)) {
			if (firstDay.get(Calendar.DAY_OF_WEEK) == cal.get(Calendar.DAY_OF_WEEK)) {
				count++;
				firstDay.add(Calendar.DAY_OF_MONTH, 7);
			} else {
				firstDay.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
		result = result + count + " in " + DateTimeUtils.months[cal.get(Calendar.MONTH)];
		result = result + " " + cal.get(Calendar.YEAR);
		return result;
	}

	private static String totalDaysOfYear(Calendar cal) {
		return "Year " + cal.get(Calendar.YEAR) + " has " + cal.getActualMaximum(Calendar.DAY_OF_YEAR);
	}

	private static String totaldaysOfMonth(Calendar cal) {
		return DateTimeUtils.months[cal.get(Calendar.MONTH)] + " " + cal.get(Calendar.YEAR) + " has "
				+ cal.getActualMaximum(Calendar.DAY_OF_MONTH) + " days ";
	}
}
