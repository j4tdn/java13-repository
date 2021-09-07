package structure;


public class Ex03 {
	public static void main(String[] args) {
		// get current weekday
		int wkd = 2;
		System.out.println("wkd: " + wkd);
		String wkdAsString = null;
		switch (wkd) {
		case 1:
			wkdAsString = "SUNDAY";
			break;
		case 2:
			wkdAsString = "MONDAY";
			break;
		case 3:
			wkdAsString = "TUESDAY";
			break;
		// case 4 5 6 as above
		case 7:
			wkdAsString = "SATURDAY";
			break;
		default:
			System.out.println("Weekday is not valid !");
			return;
		}
		System.out.println("Current wkd: " + wkdAsString);
	}
}