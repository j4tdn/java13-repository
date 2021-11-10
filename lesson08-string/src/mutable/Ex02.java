package mutable;

import java.util.concurrent.TimeUnit;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("Ex02#main - start");
		
		// create another thread to run parallel with thread-main
		// thread will execute a task
		Thread t0 = new Thread(new Task(), "thread-0");
		t0.start(); //automatically call Thread#run >> Runnable#run
		
		doATask(2);
		System.out.println("Ex02#main - end");
	}
	// thread excute Task - Runnable
	private static class Task implements Runnable{
		@Override
		public void run() {
			doATask(4);
			System.out.println(Thread.currentThread().getName() + " is running!");
			System.out.println("Task#running");
		}
		
	}
	private static void doATask(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
