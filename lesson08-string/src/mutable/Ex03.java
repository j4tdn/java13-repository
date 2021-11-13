package mutable;

public class Ex03 {
	
	public static void main(String[] args) {
		// Mutable Task: exchange data >> StringBuilder || StringBuffer
		
		MutableTask task = new MutableTask();
		
		Thread tA = new Thread(task, "Thread A");
		tA.start();
		
		Thread tB = new Thread(task, "Thread B");
		tB.start();
		
		// Make sure thread main run after thread A and thread B
		try {
			tA.join();
			tB.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("Task length: " + task.length());
	}
	
	private static class MutableTask implements Runnable {
		
		// Multiple threads access this task with share data
		// Share data: String Builder || StringBuffer
		// private StringBuffer mutable; // >> multiple thread
		private StringBuilder mutable;   // >> single thread
		private int count = 50000;
		
		public MutableTask() {
			mutable = new StringBuilder();
		}
		@Override
		public void run() {
			for(int i = 1; i <= count; i++) {
				mutable.append("A");
			}
			
		}
		
		public int length() {
			// get share data length
			return mutable.length();
		}
	}
}
