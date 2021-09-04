package structure;

import java.util.Calendar;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		// Get current weekday
		int weekDay = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);		
		String weekDayAsString = null;
		
		switch(weekDay) {
		case 1: // weekDay == 1
			weekDayAsString = "SUNDAY";
			break;
		case 2:
			weekDayAsString = "MONDAY";
			break;
		case 3:
			weekDayAsString = "TUESDAY";
			break;
		case 4:
			weekDayAsString = "WEDNESDAY";
			break;
		case 5:
			weekDayAsString = "THURSDAY";
			break;
		case 6:
			weekDayAsString = "FRIDAY";
			break;
		case 7:
			weekDayAsString = "SATURDAY";
			break;
		default:
			weekDayAsString = "WRONG TYPE, TRY AGAIN !";
			return ; // Kết thúc hàm main
		}
		
		System.out.println("This day is : " + weekDayAsString);

	}

}
