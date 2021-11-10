package mutable;

public class Ex03 {
public static void main(String[] args) {
	
	MutableTask task= new MutableTask();
	Thread tA = new Thread(task,"Thread-A");
	tA.start();
	
	Thread tB = new Thread(task,"Thread-B");
	tB.start();
	try {
		tA.join();
		tB.join();
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	//tA.join();
	System.out.println("length: "+task.length());
}
private static class MutableTask implements Runnable{
	private StringBuilder mutable;
	private int count = 50000;
	
	public MutableTask() {
		mutable = new StringBuilder();
	}
	public void run() {
		//will be run when current thread start
	for(int i=1; i<=count;i++) {
		System.out.println(Thread.currentThread().getName() +"-->"+i);
		mutable.append("A");
	}
	}
	public int length() {
		return mutable.length();	}
	
}
}
