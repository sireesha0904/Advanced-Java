package MultiThreading;

public class ThreadPriorityEx extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName() + "is running with priority " + Thread.currentThread().getPriority());
	}
}
