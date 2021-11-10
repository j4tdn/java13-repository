package mutable;

import java.util.concurrent.TimeUnit;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("Ex02#main - star");
		
		Thread t0 = new Thread(new Task(),"thread-0");
		t0.start();//auto call thread#run
		
		doATask(2);
		
		System.out.println("Ex02#main - end");
	}
	private static class Task implements Runnable{
		@Override
		public void run() {
			//will be run when current thread start
			System.out.println(Thread.currentThread().getName()+"is running");
			System.out.println("Task#executing....");
		}
	}
		
		private static void doATask(int seconds) {
			try {
				TimeUnit.SECONDS.sleep(seconds);
			} catch (Exception e) {
			}
		}
	
}
