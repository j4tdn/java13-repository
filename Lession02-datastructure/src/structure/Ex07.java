package structure;

import java.util.Calendar;

public class Ex07 {
	public static void main(String[] args) {
	int wkd = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
	System.out.println("Wkd: " + wkd);
	
	String wkdAssString = null;
	
	switch (wkd) {
	case 1:
		wkdAssString = "Sunday";
		break;
	case 2:
		wkdAssString = "Monday";
		break;
	case 3:
		wkdAssString = "Tuesday";
		break;
	case 4:
		wkdAssString = "Wenday";
		break;
	case 5:
		wkdAssString = "Thusday";
		break;
	case 6:
		wkdAssString = "friday";
		break;
	case 7:
		wkdAssString = "Satuday";
		break;
	default:
		System.out.println("Weekden is not value");
		return;
	}
	System.out.println("Current wkd: " + wkdAssString);
	}
}
