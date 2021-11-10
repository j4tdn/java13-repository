package mutable;

public class Ex03 {
	public static void main(String[] args) {
		// Mutable Task: exchange data >> StringBuilder || StrungBuffer
		
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
		
		// make sure thread-main run after threadA and threadB
		
		System.out.println("length: " + task.length());
	}
	private static class MutableTask implements Runnable{
		// multiple threads access this task with share data
		// share data: StringBuilder || StringBuffer
		
		// private StringBuffer mutable; // >> Multiple thread
		private StringBuilder mutable;   // >> single thread
		private int count = 500;
		
		public MutableTask() {
			//mutable = new StringBuffer();
			mutable = new StringBuilder();
		}
		
		@Override
		public void run() {
			for(int i = 1; i <= count; i++) {
				System.out.println(Thread.currentThread().getName() + "-->" + i);
				mutable.append("A");
			}
		}
		public int length() {
			//get share data length
			return mutable.length();
		}
	}
}
