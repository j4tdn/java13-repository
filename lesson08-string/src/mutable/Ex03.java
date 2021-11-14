package mutable;

public class Ex03 {

	public static void main(String[] args) {
		
		MutableTask task = new MutableTask();		
		Thread tA = new Thread(task, "Thread-A");
		tA.start();
		
		
		Thread tB = new Thread(task, "Thread-B");
		tB.start();
		
		try {
			tA.join();
			tB.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("length: " + task.length());
	}
	private static class MutableTask implements Runnable {
		
		//private StringBuffer mutable;
		private StringBuilder mutable;
		private int count = 50000;

		public MutableTask() {
			mutable = new StringBuilder();
		}
		
		@Override
		public void run() {
			for (int i = 1; i <= 50000; i++) {
				mutable.append("A");
			}
		}
			
		public int length() {
			return mutable.length();
		}
	}
}
