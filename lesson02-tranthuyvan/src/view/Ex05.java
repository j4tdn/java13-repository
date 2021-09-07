package view;

public class Ex05 {
	public static void main(String[] args) {
		 int number = 10;
		 String result = new String();
		 while(number > 0) {
		     result = Integer.toString(number % 2) + result;
		     number /= 2;
		 }
		 System.out.println(result);
	}
}

