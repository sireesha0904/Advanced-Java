package MultiThreading;

public class ThreadPriorityEx extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName() + "is running with priority " + Thread.currentThread().getPriority());
	}
	
	public static void main(String args[]) {
		ThreadPriorityEx t1 = new ThreadPriorityEx();
		ThreadPriorityEx t2 = new ThreadPriorityEx();
		ThreadPriorityEx t3 = new ThreadPriorityEx();
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(7);
	}
}
