package mutable;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("Ex02#main - start");
		
		
		// create another thread to run parallel with thread-main
		// thread will execute a task
		Thread t0 = new Thread(new Task(), "thread-0");
		t0.start();
		
		
		System.out.println("Ex02#main - end");
	}
	
	// thread execute Task= Runnable
	private static class Task implements Runnable{
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	}
}
