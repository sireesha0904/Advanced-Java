package MultiThreading;

public class CustomThread {

	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		CustomThread t = new CustomThread();
		t.run();
	}
}
