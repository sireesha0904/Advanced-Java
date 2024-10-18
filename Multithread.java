public class Multithread extends Thread{
    public static void main(String[] args) {
        Multithread t = new Multithread();
        t.run();
    }
    
    public void run() {
        System.out.println("Thread is running");
    }
}
// There are two ways to create a thread:
// By extending Thread class
// By implementing Runnable interface.

