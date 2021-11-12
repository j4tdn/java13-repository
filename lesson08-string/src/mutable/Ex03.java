package mutable;

public class Ex03 {
	public static void main(String[] args) {
		MutableTast tast = new MutableTast();
		
		Thread tA = new Thread(tast, "Thread-A");
		tA.start();
		Thread tB = new Thread(tast, "Thread-B");
		tB.start();
		try {
			tA.join();
			tB.join();
			System.out.println("length: " + tast.length());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	private static class MutableTast implements Runnable {
		// multiple thread access this task with share data 
		// Share data : StringBuider || StringBuffer
//		private StringBuffer mutable; >> multiple thread
		private StringBuilder mutable; // single thread
		private int count = 50000;
		public MutableTast() {
			mutable = new StringBuilder();
		}
		
		
		@Override
		public void run() {
			for(int i = 1; i<= count ; i++) {
				mutable.append("A");
			}
		}
		public int length() {
			return mutable.length();
		}
	}
}
