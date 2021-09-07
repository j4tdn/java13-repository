package view;

public class Ex01 {

	public static void main(String[] args) {
		int number = 8;
		if(number == 0) {
			System.out.println("false");
		}
		while(number > 0) {
			if(number % 2 != 0) {
				System.out.println("false");
				break;
			} else {
				number /= 2;
				if(number == 1) {
					System.out.println("true");
					break;
				  }
            }
        }
     }
}
