package ex06;

public class App {
	public static void main(String[] args) {
		
	}
	
	private static int getNumberByIndex(int index) {
		if (index <= 0) throw new RuntimeException("index must bigger than 0");
		if (index < 10) return index;
		
		
		return 1;
	}
}
