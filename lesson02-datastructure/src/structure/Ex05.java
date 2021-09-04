package structure;

public class Ex05 {
	public static void main (String[] args) {
		int number = 5;
		
		System.out.println("========== BREAK ==========");
		doBreak(number);
		
		System.out.println("========== CONTINUE ==========");
		doContinue(number);
	}

	private static void doBreak(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
			if (i == 4) {
				break;
			}
			System.out.println("End " + i);
		}
	}

	private static void doContinue(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
			if (i == 4) {
				continue;
			}
			System.out.println("End " + i);	
		}
	}
}
