package MultiThreading;

public class ThreadPriorityEx extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
	}
	
	public static void main(String args[]) {
		ThreadPriorityEx t1 = new ThreadPriorityEx();
		ThreadPriorityEx t2 = new ThreadPriorityEx();
		ThreadPriorityEx t3 = new ThreadPriorityEx();
		
		t1.setPriority(MAX_PRIORITY); // Maximum Priority 
		t2.setPriority(MIN_PRIORITY); // Minimum Priority
		t3.setPriority(7); // Default set Priority 
		
		t1.start();
		t2.start();
		t3.start();
	}
}
