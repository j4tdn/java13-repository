package structure;

import java.util.Calendar;

public class Ex01 {
	public static void main(String[] args) {
		int wkd=Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		System.out.println("wkd: "+wkd);
		String wkdAsString = null; 
		switch (wkd) {
		case 1:
			wkdAsString = "Sunday";
			break;
		case 2:
			wkdAsString = "Monday";
			break;
		case 3:
			wkdAsString = "Tuesday";
			break;
		// case 4 5 6 as above
		case 7:
			wkdAsString = "Saturday";
			break;
		default:
			System.out.println("Weekday is not valid!");
		}
		System.out.println("Current wkd: "+ wkdAsString);
	}
}
