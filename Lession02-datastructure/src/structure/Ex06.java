package structure;

public class Ex06 {
	public static void main(String[] args) {
		int month = 7;
		int daysIsMonth = 0;
		switch (month) {
		case 1:
			System.out.println("daysOfMonth31");
			break;
		case 2:
			System.out.println("daysOfMonth28");
			break;
		case 3:
			System.out.println("daysOfMonth31");
			break;
		case 4:
			System.out.println("daysOfMonth30");
			break;
		case 5:
			System.out.println("daysOfMonth31");
			break;
		case 6:
			System.out.println("daysOfMonth30");
			break;
		case 7:
			System.out.println("daysOfMonth31");
			break;
		case 8:
			System.out.println("daysOfMonth31");
			break;
		case 9:
			System.out.println("daysOfMonth30");
			break;
		case 10:
			System.out.println("daysOfMonth31");
			break;
		case 11:
			System.out.println("daysOfMonth30");
			break;
		case 12:
			System.out.println("daysOfMonth31");
			break;

		default:
			System.out.println("Not month of Year");
			break;
		}
		int months = 12;
		switch (months) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			daysIsMonth = 31;
			break;
		case 4:
		case 6:
		case 9:
			daysIsMonth = 31;
		case 2:
			daysIsMonth = 28;
		default:
			System.out.println("Invalid Month");
			return;
		}
		System.out.println("Month: " + months + " has " + daysIsMonth + "days ");
	
	}
}