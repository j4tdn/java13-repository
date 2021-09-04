package structure;

public class Ex02 {
	public static void main(String[] args) {
		// Toán tử 3 ngôi
		int number = 12;
		String result = (number % 2 == 0) ? "EVEN" : "ODD";
		System.out.println(result);
		
		// format: ctrl shift f
		// Type variable = <condition> ? <value 1> : <value 2>
		/*
		if (condition) {
			variable = value 1
		} else {
			variable = value 2
		}
		*/
	}
}
