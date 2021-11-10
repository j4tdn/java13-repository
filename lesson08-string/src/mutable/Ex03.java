package mutable;

public class Ex03 {
	public static void main(String[] args) {
		// Mutable Task: exchange data >> StringBuilder || StringBuffer

		MutableTask task = new MutableTask();

		Thread tA = new Thread(task, "Thread-A");
		tA.start();

		Thread tB = new Thread(task, "Thread-B");
		tB.start();

		try {
			// to make sure 2 thread-main run after threadA & threadB
			tA.join();
			tB.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("length: " + task.length());
	}

	private static class MutableTask implements Runnable {

		// multiple threads access this task with share data
		// share data: StringBuilder || StringBuffer

		// private StringBuffer mutable; // >> multiple thread
		private StringBuffer mutable; // >> single thread
		private int count = 50000;

		public MutableTask() {
			// mutable = new StringBuffer();
			mutable = new StringBuffer();
		}

		@Override
		public void run() {
			for (int i = 1; i <= 50000; i++) {
				System.out.println(Thread.currentThread().getName() + "-->" + i);
				mutable.append("A");
			}
		}

		public int length() {
			// get share data length
			return mutable.length();
		}
	}

}
