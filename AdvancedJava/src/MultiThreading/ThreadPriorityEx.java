package MultiThreading;

public class ThreadPriorityEx extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running with " + Thread.currentThread().getPriority());
	}
	
	public static void main(String args[]) {
		ThreadPriorityEx t0 = new ThreadPriorityEx();
		ThreadPriorityEx t1 = new ThreadPriorityEx();
		ThreadPriorityEx t2 = new ThreadPriorityEx();
		
		t0.setPriority(MAX_PRIORITY); // Maximum Priority 
		t1.setPriority(MIN_PRIORITY); // Minimum Priority
		t2.setPriority(7); // Default set Priority 
		
		t0.start();
		t1.start();
		t2.start();
	}
}
