//Java Thread Example by implementing Runnable interface
package MultiThreading;

public class Multi implements Runnable{

	public void run() { // perform action of a Thread
		System.out.println("Thread is Running..."); 
	}
	
	public static void main(String[] args) {
	Multi m = new Multi(); // Object
	Thread th = new Thread(m); //Using Thread(runnable r) constructor
	th.start();
	}
}
