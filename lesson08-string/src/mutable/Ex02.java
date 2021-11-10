package mutable;

import java.util.concurrent.TimeUnit;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("EX02#main - start");
		
		// create another thread to run parallel with thread-main
		//thread will execute a task
		
		Thread t0 = new Thread(new Tast(), "thread=0");
		t0.start(); // automatically call thread run >> runnable#run
		doATask(2);
		System.out.println("EX02#main - end");
	}
	
	private static class Tast implements Runnable {
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + "is running");
			System.out.println("Tast#executing...");
			
		}
	}
	
	private static void doATask(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		}catch (InterruptedException e){
			e.getMessage();
		}
	}
}
