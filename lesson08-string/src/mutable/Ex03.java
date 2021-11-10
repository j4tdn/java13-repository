package mutable;

public class Ex03 {
	public static void main(String[] args) {
		// Mutable Task: exchange data >> StringBuilder || StringBuffer
		MutableTask task = new MutableTask();
		Thread tA = new Thread(task, "Thread-A");
		tA.start();

		Thread tB = new Thread(task, "Thread-B");
		tB.start();
		// make sure thread-main run after ThreadA&ThreadB;
		try {
			tA.join();
			tB.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("length: " + task.length());
	}

	private static class MutableTask implements Runnable {
		// mutiple threads access this task with share data
		// share data: String Buffer || StringBuilder
		// String Builder doesn't assure the exact synchronization
		private StringBuffer mutable;
		private int count = 50000;
		public MutableTask() {
			mutable = new StringBuffer();
		}

		@Override
		public void run() {
			for (int i = 0; i < count; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
				mutable.append("A");
			}
		}

		public int length() {
			return mutable.length();
		}
	}
}
