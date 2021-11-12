package mutable;

public class Ex03 {
	public static void main(String[] args) {
		//Mutable Task: exchange data >> StringBuilder || StringBuffer
		MutableTask task = new MutableTask();
		
		Thread ta = new Thread(task, "Thread-A");
		ta.start();
		
		Thread tb = new Thread(task, "Thread-B");
		tb.start();
		
		//make sure thread-main run after threadA & threadB
		try {
			ta.join();
			tb.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("length: " + task.length());
	}
	
	private static class MutableTask implements Runnable{
		//multiple threads access this task with share data
		//share data: StringBuilder || StringBuffer
		private StringBuffer mutable;
		private int count = 100;
		
		public MutableTask() {
			mutable = new StringBuffer();
		}

		@Override
		public void run() {
			for(int i = 1; i <= count; i++) {	
				System.out.println(Thread.currentThread().getName() + "--->" + i);
				mutable.append("a");
			}
		}
		
		public int length() {
			//get share data length
			System.out.println("xxx: " + mutable.length());
			return mutable.length();
		}
	
	}
}
