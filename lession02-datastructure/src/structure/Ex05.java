package structure;

public class Ex05 {

	public static void main(String[] args) {
		doBreak(5);
		System.out.println("=========");
		doContinue(5);
	}
	
	private static void doBreak(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.println(i);
			if (i == 4) {
				break;
			}
			System.out.println("End " + i);
		}
	}
	
	private static void doContinue(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.println(i);
			if (i == 4) {
				continue;
			}
			System.out.println("End " + i);
		}
	}

}
