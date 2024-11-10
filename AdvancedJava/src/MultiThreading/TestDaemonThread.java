package MultiThreading;

public class TestDaemonThread extends Thread{

	public void run() {
		System.out.println("Daemon-Thread Test : " + Thread.currentThread().getName() + " " + Thread.currentThread().isDaemon());
	}
	public static void main(String[] args) {
		TestDaemonThread th1 = new TestDaemonThread();
		TestDaemonThread th2 = new TestDaemonThread();
		
		th1.setDaemon(true); // set daemon value 
		th2.setDaemon(false);
		th1.start();
		th2.start();
	}
}
