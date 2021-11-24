package mutable;

import java.util.concurrent.TimeUnit;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("Ex02#main - start");
		
		//create another thread to run parallel with thread-main
		//thread will execute a task
		
		//tạo 1 Thread
		Thread t0 = new Thread(new Task(), "thread-0");
		t0.start();//tự động gọi đến Thread#run >> Runnable#run
		
		doATask(2);
		System.out.println("Ex02#main - end");
		
		
	}
	private static class Task implements Runnable{
		@Override
		public void run() {
			doATask(4);
			System.out.println(Thread.currentThread().getName() + " is running");
			System.out.println("Task#executing.....");
			
		}
	}
	private static void doATask(int second) {
		try {
			TimeUnit.SECONDS.sleep(second);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
