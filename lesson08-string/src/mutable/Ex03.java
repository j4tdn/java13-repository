package mutable;

public class Ex03 {
	public static void main(String[] args) {
		//Mutable Task: exchange data >> StringBuilder || StringBuffer
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
		
		System.out.println(task.length());
	}
	
	private static class MutableTask implements Runnable{
		
		private StringBuffer mutable;
		private int count = 50000;
		
		public MutableTask() {
			mutable = new StringBuffer();
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i = 1; i <= 50000; i++) {
				mutable.append("A");
			}
		}
		
		public int length() {
			return mutable.length();
		}
	}
}
