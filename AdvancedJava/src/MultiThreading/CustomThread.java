//Creating Thread by Extending Thread Class
package MultiThreading;

public class CustomThread extends Thread{

	public void run() { // used to perform action of the thread
		System.out.println("code running in the Thread");
	}
	
	public static void main(String[] args) {
		CustomThread th = new CustomThread();
		th.start();  // Execution of the thread and calls the run() method
		System.out.println("Code is running outside the Thread");
		
	}

}
