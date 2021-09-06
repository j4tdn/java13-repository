package structure;

import java.util.Calendar;

public class Ex03 {
	public static void main(String[] args) {
		//get current weekday
		int wkd = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		System.out.println("wkd: "+wkd);
		
		String wkdAsString = null;
		switch (wkd) {
		case 1:
			wkdAsString = "SUNDAY";
			break;
		case 2:
			wkdAsString = "MONDAY";
			break;
		case 3:
			wkdAsString = "3DAY";
			break;
		case 4:
			wkdAsString = "4DAY";
			break;
		case 5:
			wkdAsString = "5DAY";
			break;
		case 6:
			wkdAsString = "6DAY";
			break;
		case 7:
			wkdAsString = "7DAY";
			break;

		default:
			System.out.println("weekday is not valid !");
			return;
		}
		System.out.println("Current wkd: "+wkdAsString);
	}
}
