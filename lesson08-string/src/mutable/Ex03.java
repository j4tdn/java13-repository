package mutable;


public class Ex03 {
	public static void main(String[] args) {
		//mutable task: exchange data >> stringBulder||StringBuffer
		
		MutableTask task = new MutableTask();
		Thread tA= new Thread(task,"Thread-A");
		tA.start();
		
		Thread tB= new Thread(task,"Thread-B");
		tB.start();
		
		try {
			tA.join();
			tB.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("length: "+task.length());
	}
	private static class MutableTask implements Runnable{
		private StringBuffer mutable;
		private int count = 5000;
		
		public MutableTask() {
			mutable = new StringBuffer();
		}
		
		@Override
		public void run() {
			for(int i=1;i<=count;i++) {
				mutable.append("A");
			}
		}
		public int length() {
			//get share  date length
			return mutable.length();
		}
	}
}
