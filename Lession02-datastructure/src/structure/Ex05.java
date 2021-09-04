package structure;

public class Ex05 {
	public static void main(String[] args) {
		int number = 2;
		
		if(number == 1) {
			System.out.println("one");
		}else if (number == 2) {
			System.out.println("two");
		}else if (number == 3) {
			System.out.println("three");
		}else if (number == 4) {
			System.out.println("four");
		}else {
			System.out.println("Invalid [1-4]");
		}
		switch (number) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		default:
			System.out.println("Invalid number");
			break;
		}
		

			
	}
}
