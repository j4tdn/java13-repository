package structure;

import java.util.Calendar;

public class Ex01 {
	public static void main(String[] args) {
		//get current weekday
		
		
		int wkd = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		int dom = Calendar.DAY_OF_MONTH;
		// int date = Calendar.DAY_OF_WEEK_IN_MONTH;
		String wkdAsString = null;
		
		switch(wkd) {
		case 1:
			wkdAsString = "Sunday";
			break;
		
		case 2:
			wkdAsString = "Monday";
			break;
		case 7:
			wkdAsString = "Saturday";
			break;
		default:
			System.out.println("Weekday is not valid!");
			 //thoat khoi ham main kieu void
			return; 
		}
		System.out.println("WKD: " + wkdAsString);
	}
}
