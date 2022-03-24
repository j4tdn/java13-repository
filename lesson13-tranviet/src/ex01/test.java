package ex01;

public class test {
	final class Bike {
	}

	public class SH1 extends Bike {
		void run() {
			System.out.println("Chay an toan voi 150km/h");
		}
	}
	public static void main(String args[]) {
			SH1 sh = new SH1();
			sh.run();
	}
}

