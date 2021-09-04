package structure;

import java.util.Calendar;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int wkd = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		System.out.println("wkd:" + wkd);
		
		String wkdAsString = null;
		switch(wkd) {
		case 1:
			wkdAsString = "SUNDAY";
			break;
		case 2:
		 	wkdAsString = "MONDAY";
			break;
		case 3:
			wkdAsString = "TUESDAY";
			break;
		case 4:
			wkdAsString = "WENDSDAY";
			break;	
		case 5:
			wkdAsString = "THURTDAY";
			break;
		case 6:
			wkdAsString = "FRIDAY";
			break;
		case 7:
			wkdAsString = "SATURDAY";
			break;	
		default: 
			System.out.println("Wekkday is not valid!!");
			return;
		}
		
		System.out.println("current wkd: " + wkdAsString);
	}
}
