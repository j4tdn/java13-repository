package mutable;

public class Ex03 {
	public static void main(String[] args) {
		//Mutable Task : exchange data >> StringBiulder || StringBuffer
		MutableTask task = new MutableTask();
		
		Thread tA = new Thread(task, " Thread-A");
		tA.start();
		
		Thread tB = new Thread(task, " Thread-A");
		tB.start();
		
		try {
			tA.join();
			tB.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Length: " + task.length());
		
		
	}
	
	private static class MutableTask implements Runnable{
		
		//multiple thread access this task with share data
		//share data : StringBuilder || StringBuffer
		
		private StringBuffer mutable;
		private int count = 50000;
		
		public MutableTask() {
			mutable = new StringBuffer();
		}
		@Override
		public void run() {
			for (int i = 1; i <= count;i++) {
				System.out.println(Thread.currentThread().getName() + "-->" +i);
				mutable.append("A");
				
			}
		}
		public int length() {
			return mutable.length();
		}
	}
}
